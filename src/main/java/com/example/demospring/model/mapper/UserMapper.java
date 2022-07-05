package com.example.demospring.model.mapper;

import com.example.demospring.entity.User;

public class UserMapper {
    public static User user(User user){
        User tmp = new User();
        tmp.setId(user.getId());
        tmp.setName(user.getName());
        tmp.setEmail(user.getEmail());
        tmp.setAddress(user.getAddress());

        return tmp;
    }


}
