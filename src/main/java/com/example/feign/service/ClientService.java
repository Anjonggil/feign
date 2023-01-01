package com.example.feign.service;

import com.example.feign.client.CrewInClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Base64;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class ClientService {

    private final CrewInClient crewInClient;

    public Map<String,Object> login(String email,String password){
        Base64.Encoder encoder = Base64.getEncoder();
        return crewInClient.crewInLogin("Basic " + encoder.encodeToString((email + ":" + password).getBytes()));
    }
}
