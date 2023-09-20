package com.tjjhtjh.memorise.domain.auth.controller;

import com.tjjhtjh.memorise.domain.user.repository.entity.User;
import com.tjjhtjh.memorise.domain.user.service.UserService;
import com.tjjhtjh.memorise.domain.user.service.dto.request.LoginRequest;
import com.tjjhtjh.memorise.domain.user.service.dto.response.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        User user = userService.getUserInfo(loginRequest.getEmail());
        return ResponseEntity.ok(new LoginResponse(true));
    }
}
