package com.et.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * This Enum hold the possible users who can be part of the service
 * @author: Anuj Sharma
 **/
public enum Users {

    SELLER("1"),
    BUYER("2");

    private static Map<String,Users> USER_CODE=new HashMap<>(2);
    static {
       for(Users user:Users.values()){
           USER_CODE.put(user.code,user);
       }
    }
    private String code;

    private Users(String code){
        this.code=code;
    }

    public String getCode() {
        return code;
    }
}
