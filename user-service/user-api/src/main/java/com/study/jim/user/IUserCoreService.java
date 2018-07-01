package com.study.jim.user;

import com.study.jim.user.dto.UserLoginRequest;
import com.study.jim.user.dto.UserLoginResponse;

public interface IUserCoreService {
    UserLoginResponse login(UserLoginRequest request);
}
