package com.github.owl4soul.controllers;

import com.github.owl4soul.model.User;
import com.github.owl4soul.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeleteUserController {
    UserService service = new UserService();

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView showDeleteUserPage(@RequestParam("deleteByName") String username) {
        ModelAndView result = new ModelAndView("/views/deleteUser");
        service = new UserService();
        User userToDel = service.findByUsername(username);

        result.addObject("user", userToDel);
        return result;
    }

    @RequestMapping(value = "/deleteUserSuccess", method = RequestMethod.POST)
    public ModelAndView showSuccess(@RequestParam("username") String username) {
        ModelAndView result = new ModelAndView("/views/deleteUserSuccess");
        User userToDel = service.findByUsername(username);
        service.deleteUser(userToDel);
        return result;
    }

}
