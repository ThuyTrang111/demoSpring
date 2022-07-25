package com.example.demospring.controller;

import com.example.demospring.entity.User;
import com.example.demospring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//import javax.annotation.security.RolesAllowed;
import javax.annotation.security.RolesAllowed;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/users")

public class MyController {
    @Autowired
    private UserService service;


    @PostMapping("/addUser")
    @RolesAllowed("admin")
    public User addUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @PostMapping("/addUsers")
    @RolesAllowed("admin")
    public List<User> addUser(@RequestBody List<User> users) {
        return service.saveUsers(users);
    }

    @GetMapping("")
    @RolesAllowed("admin")
    public List<User> findAllUsers() {
        return service.getUsers();
    }

    @GetMapping("/logout")

    public  String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "Logout success";
    }

    @GetMapping("/userById/{id}")
    @RolesAllowed("admin")
    public User findUserById(@PathVariable int id) {
        return service.getUserById(id);
    }

    @GetMapping("/userId/{id:2}")
    @RolesAllowed("user")
    public User findUserId(@PathVariable int id) {
        return service.getUserId(id);
    }



    @GetMapping("/{name}")
    @RolesAllowed("admin")
    public User findUserByName(@PathVariable String name) {
        return service.getUserByName(name);
    }

    @PutMapping("/update")
    @RolesAllowed("admin")
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    @RolesAllowed("admin")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteUser(id);
    }



}