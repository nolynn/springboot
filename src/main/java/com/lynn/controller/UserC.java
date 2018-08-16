package com.lynn.controller;

import com.lynn.entities.User;
import com.lynn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserC {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "Hello World!";
    }

    @Autowired
    UserService userService;

    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUser() {
        List<User> allUser = userService.getAllUser();
        return allUser;
    }
}
