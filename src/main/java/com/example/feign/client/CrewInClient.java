package com.example.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@FeignClient(name = "CrewInClient", url = "http://skysrd.iptime.org:8080/api")
public interface CrewInClient {

    @PostMapping(value = "/auth/login", produces = "application/json", consumes = "application/json")
    Map<String,Object> crewInLogin(@RequestHeader(HttpHeaders.AUTHORIZATION) String authorization);
}
