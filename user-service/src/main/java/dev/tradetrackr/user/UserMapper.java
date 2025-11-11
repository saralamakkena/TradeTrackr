package dev.tradetrackr.user;

import dev.tradetrackr.user.dto.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
  UserResponse toDto(UserEntity e);
}
