package io.github.felipe_damasceno19.app.users;

import io.github.felipe_damasceno19.app.users.internal.AuthService;
import io.github.felipe_damasceno19.app.users.internal.UserMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    private final UserMapper mapper;

    @PostMapping("/signup")
    public ResponseEntity<Void> signup (@RequestBody @Valid SignupRequestDTO requestDTO){
        authService.signup(mapper.toEntity(requestDTO));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/login")
    public ResponseEntity<TokenResponseDTO> login
            (@RequestBody @Valid LoginRequestDTO requestDTO) {
        return ResponseEntity.ok(authService.login(requestDTO));
    }
}
