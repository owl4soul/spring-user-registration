package com.github.owl4soul.controllers;

import com.github.owl4soul.model.User;
import com.github.owl4soul.model.UserList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeleteUserController {

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView showDeleteUserPage(@RequestParam("deleteByName") String userName) {
        ModelAndView result = new ModelAndView("/views/deleteUser");
        User userToDel = UserList.userListSingletone.getUserByUsername(userName);
        UserList.userListSingletone.getUserList().remove(userToDel);
        result.addObject("user", userToDel);
        return result;
    }

    @RequestMapping(value = "/deleteUserSuccess", method = RequestMethod.GET)
    public ModelAndView showSuccess() {
        ModelAndView result = new ModelAndView("/views/deleteUserSuccess");
        return result;
    }

}
