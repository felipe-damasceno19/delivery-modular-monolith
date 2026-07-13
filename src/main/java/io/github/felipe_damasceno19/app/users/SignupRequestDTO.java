package io.github.felipe_damasceno19.app.users;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record SignupRequestDTO(
        @NotBlank(message = "O nome é obrigatório!") @Size(max = 200) String name,

        @NotBlank(message = "o e-mail é obrigatório")
        @Email(message = "Insira um e-mail válido")
        String email,

        @NotBlank(message = "A senha é obrigatória")
        @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres!")
        String password,

        Role role
) {}
