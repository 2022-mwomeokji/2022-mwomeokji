package com.umc.mwomeokji.domain.user.dto;

import com.umc.mwomeokji.domain.user.domain.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-19T12:55:10+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserDto.SignUpRequest signUpRequest) {
        if ( signUpRequest == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.name( signUpRequest.getName() );
        user.email( signUpRequest.getEmail() );

        return user.build();
    }

    @Override
    public UserDto.SignUpResponse toSignUpResponse(User user) {
        if ( user == null ) {
            return null;
        }

        String name = null;
        String email = null;

        name = user.getName();
        email = user.getEmail();

        UserDto.SignUpResponse signUpResponse = new UserDto.SignUpResponse( name, email );

        return signUpResponse;
    }
}
