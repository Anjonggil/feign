package com.example.feign.controller;

import com.example.feign.dto.LoginDto;
import com.example.feign.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final ClientService clientService;

    @PostMapping("/api/login")
    public Map<String,Object> login(
            @RequestBody LoginDto loginDto
    ){
        return clientService.login(loginDto.getEmail(), loginDto.getPassword());
    }
}
