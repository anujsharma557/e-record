package com.et.service;

import com.et.entity.User;
import com.et.model.UserDetail;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author: Anuj Sharma
 **/
@Service
public class UserService implements User {
    private Map<String,UserDetail> users;

    public UserService(){
        users = new HashMap<>();

    }
    public UUID registerSeller(String firstName, String middleName, String lastName,
                               String phone, String email, String password) {
        UserDetail detail= new UserDetail(firstName,middleName,lastName,
                phone,email,password);
        UUID userID=UUID.randomUUID();
        String id=userID.toString();
        users.put(id,detail);
        // make DB cal to store use basic data.
        return userID;

    }

    @Override
    public UUID addUser(String firstName, String middleName, String lastName,
                        String phone, String email, String password) {

        UUID uderID=UUID.randomUUID();
        return null;
    }

    @Override
    public String removeUser(UUID uuid) {
        return null;
    }

    @Override
    public String updateUserDetail(UUID uuid) {
        return null;
    }

    @Override
    public String getUserDetail(UUID uuid) {
        UserDetail detail=users.get(uuid.toString());
        return detail.toString();
    }
}
