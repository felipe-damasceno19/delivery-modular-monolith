package io.github.felipe_damasceno19.app.users.internal;

import io.github.felipe_damasceno19.app.users.LoginRequestDTO;
import io.github.felipe_damasceno19.app.users.TokenResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository repository;
    private final JwtService jwtService;
    private final PasswordEncoder encoder;
    private final AuthenticationManager authenticationManager;

    public void signup(User user){
        repository.save(user);
    }

    public TokenResponseDTO login(LoginRequestDTO request) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.email(), request.password())
        );

        User user = repository.findByEmail(request.email())
                .orElseThrow();

        String token = jwtService.generateToken(user);
        return new TokenResponseDTO(token);
    }
}
