package com.demo.controller;

import com.demo.entry.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/show")
    public String showAllUser(Model model) {
        List<User> users = userService.queryAllUser();
        model.addAttribute("users", users);
        return "index";
    }
}
