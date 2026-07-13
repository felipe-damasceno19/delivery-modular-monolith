package io.github.felipe_damasceno19.app.users.internal;

import io.github.felipe_damasceno19.app.users.SignupRequestDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequestDTO requestDTO);
    
}
