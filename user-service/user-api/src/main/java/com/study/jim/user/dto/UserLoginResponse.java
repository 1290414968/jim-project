package com.study.jim.user.dto;


import com.study.jim.user.abs.AbstractResponse;

public class UserLoginResponse extends AbstractResponse {
    private static final long serialVersionUID = -4339900472381840119L;

    private Integer uid;
    private String avatar;
    private String mobile;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
