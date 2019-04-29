package com.github.owl4soul.controllers;

import com.github.owl4soul.forms.RegistrationForm;
import com.github.owl4soul.model.User;
import com.github.owl4soul.model.UserList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddUserController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView showForm() {
        ModelAndView result = new ModelAndView();
        result.setViewName("/views/addUser");
        result.addObject("registrationForm", new RegistrationForm());
        return result;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addUser(RegistrationForm registrationForm) {
        String userName = registrationForm.getName();
        String firstName = registrationForm.getFirst();
        String lastName = registrationForm.getLast();
        long phone = registrationForm.getPhone();

        User user = new User(new User.UserBuilder()
                ._userName(userName)
                ._firstName(firstName)
                ._lastName(lastName)
                ._phone(phone));

        ModelAndView result = new ModelAndView("/views/addUserSuccess");
        result.addObject("user", user);
        result.addObject("list", UserList.userListSingletone.getUserList());

        return result;
    }
}
