package com.github.owl4soul.controllers;

import com.github.owl4soul.forms.RegistrationForm;
import com.github.owl4soul.model.User;
import com.github.owl4soul.services.UserService;

import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class AddUserController {

    @ModelAttribute("registrationForm")
    public RegistrationForm registrationForm() {
        return new RegistrationForm();
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView showForm() {
        ModelAndView result = new ModelAndView();
        result.setViewName("/views/addUser");
        result.addObject("registrationForm", new RegistrationForm());
        return result;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addUser(
            @ModelAttribute("registrationForm") @Valid RegistrationForm registrationForm,
            BindingResult bindingResult
    ) {
        if (bindingResult.hasErrors()) {
            ModelAndView result = new ModelAndView("/views/index");
            return result;
        } else {


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
}
