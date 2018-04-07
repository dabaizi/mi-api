package com.dabaizi.mi.domain;

import com.dabaizi.mi.common.BaseEntity;

public class User extends BaseEntity {

    private Long userId;

    private String userName;

    private String mobilePhone;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }



}
