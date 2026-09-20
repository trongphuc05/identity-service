package com.trongphuc.identity_service.mapper;

import com.trongphuc.identity_service.dto.request.UserCreationRequest;
import com.trongphuc.identity_service.dto.request.UserUpdateRequest;
import com.trongphuc.identity_service.dto.response.UserResponse;
import com.trongphuc.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "roles", ignore = true)
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
