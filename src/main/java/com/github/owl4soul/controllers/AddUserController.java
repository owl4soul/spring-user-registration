package com.github.owl4soul.controllers;

import com.github.owl4soul.forms.RegistrationForm;
import com.github.owl4soul.model.User;
import com.github.owl4soul.services.UserService;
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
        UserService service = new UserService();
        String userName = registrationForm.getName();
        String password = registrationForm.getPassword();
        String firstName = registrationForm.getFirst();
        String lastName = registrationForm.getLast();
        long phone = registrationForm.getPhone();
        String email = registrationForm.getEmail();

        User user = new User(new User.UserBuilder()
                ._userName(userName)
                ._password(password)
                ._firstName(firstName)
                ._lastName(lastName)
                ._phone(phone)
                ._email(email));

        service.saveUser(user);

        ModelAndView result = new ModelAndView("/views/addUserSuccess");
        result.addObject("user", user);
        result.addObject("list", service.findAllUsers());

        return result;
    }
}
