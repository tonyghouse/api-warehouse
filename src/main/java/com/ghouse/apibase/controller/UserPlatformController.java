package com.ghouse.apibase.controller;

import com.ghouse.apibase.entity.UserPlatform;
import com.ghouse.apibase.service.UserPlatformService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserPlatformController {

    private static final Logger log = LoggerFactory.getLogger(UserPlatformController.class);

    @Autowired
    private UserPlatformService userPlatformService;

    @GetMapping(value = "/user-platforms/{userId}", produces = "application/json")
    public ResponseEntity<List<UserPlatform>> getUserPlatforms(@PathVariable String userId) {
        List<UserPlatform> results = userPlatformService.getUserPlatformsByUserId(userId);
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

}
