package com.github.owl4soul;

import com.github.owl4soul.model.User;
import com.github.owl4soul.repository.UserDAO;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDAO dao = new UserDAO();

        User use = new User.UserBuilder()
                ._userName("owl4soul")
                ._firstName("Lera")
                ._lastName("Feoktistova")
                ._phone(89999881510l)
                ._email("emailnew@gmail.com").build();
        dao.save(use);

        List<User> userList = dao.findByUsername("owl");
        for (User u : userList) {
            System.out.println(u);
        }

    }
}
