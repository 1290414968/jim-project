package com.study.jim.sso.controller;

import com.study.jim.user.IUserCoreService;
import com.study.jim.user.dto.UserLoginRequest;
import com.study.jim.user.dto.UserLoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    IUserCoreService userCoreService;

    @PostMapping("/login")
    public ResponseEntity doLogin(String username, String password){
        UserLoginRequest request=new UserLoginRequest();
        request.setPassword(password);
        request.setUserName(username);
        UserLoginResponse response=userCoreService.login(request);
        return ResponseEntity.ok(response);
    }


}
