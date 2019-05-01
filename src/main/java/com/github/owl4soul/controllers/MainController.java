package com.github.owl4soul.controllers;

import com.github.owl4soul.model.User;
import com.github.owl4soul.model.UserList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
//        new User().registerObserver(UserList.initUserList());
        return "views/index";
    }
}

