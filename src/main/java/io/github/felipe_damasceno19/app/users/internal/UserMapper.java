package io.github.felipe_damasceno19.app.users.internal;

import io.github.felipe_damasceno19.app.users.SignupRequestDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequestDTO requestDTO);

}
