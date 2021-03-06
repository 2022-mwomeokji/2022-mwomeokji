package com.umc.mwomeokji.domain.user.api;

import com.umc.mwomeokji.domain.user.application.UserServiceImpl;
import com.umc.mwomeokji.domain.user.dto.UserDto.SignUpRequest;
import com.umc.mwomeokji.domain.user.dto.UserDto.SignUpResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private final UserServiceImpl userServiceImpl;

    @PostMapping
    public ResponseEntity<SignUpResponse> signUp(@RequestBody @Valid SignUpRequest signUpRequest) {
        return ResponseEntity.status(CREATED).body(userServiceImpl.signUp(signUpRequest));
    }
}
