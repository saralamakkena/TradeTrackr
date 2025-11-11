package dev.tradetrackr.user;

import dev.tradetrackr.user.dto.UserResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-10T18:40:34-0600",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse toDto(UserEntity e) {
        if ( e == null ) {
            return null;
        }

        Long id = null;
        String email = null;
        String fullName = null;

        id = e.getId();
        email = e.getEmail();
        fullName = e.getFullName();

        UserResponse userResponse = new UserResponse( id, email, fullName );

        return userResponse;
    }
}
