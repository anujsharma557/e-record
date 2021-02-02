package com.et.model;

/**
 * @author: Anuj Sharma
 **/
public class UserDetail  {
    String firstName;
    String middleName;
    String lastName;
    String phone;
    String email;
    String password;

    public UserDetail(String firstName, String middleName, String lastName,
    String phone, String email, String password){
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.phone=phone;
        this.email=email;
        this.password=password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("firstName:"+firstName
                             +" middleName:"+middleName
                +" lastName:"+lastName+
                " phone: "+phone
        +" email:"+email);

    }
}
