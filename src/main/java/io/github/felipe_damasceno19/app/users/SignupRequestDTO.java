package io.github.felipe_damasceno19.app.users;

public record SignupRequestDTO(
        String name,
        String email,
        String password,
        Role role
) {}
