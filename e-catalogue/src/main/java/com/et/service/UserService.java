package com.et.service;

import com.et.entity.User;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author: Anuj Sharma
 **/
@Service
public class UserService implements User {
    public UUID registerSeller(String firstName, String middleName, String lastName,
                               String phone, String email, String password) {
        UUID uderID=UUID.randomUUID();
        // make DB cal to store use basic data.
        return uderID;

    }

    @Override
    public UUID addUser() {
        return null;
    }

    @Override
    public String removeUser() {
        return null;
    }

    @Override
    public String updateUserDetail() {
        return null;
    }
}
