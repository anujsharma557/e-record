package com.et.entity;

import java.util.UUID;

/**
 * @author: Anuj Sharma
 **/
public interface User {

    UUID addUser(String firstName, String middleName, String lastName,
                 String phone, String email, String password);

    String removeUser(UUID uuid);

    String updateUserDetail(UUID uuid);
    String getUserDetail(UUID uuid);


}
