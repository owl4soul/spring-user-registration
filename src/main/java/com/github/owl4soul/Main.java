package com.github.owl4soul;

import com.github.owl4soul.model.User;
import com.github.owl4soul.repository.UserDAO;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDAO dao = new UserDAO();

        User use = new User.UserBuilder()
                ._userName("qwew")
                ._firstName("Lera")
                ._lastName("Feoktistova")
                ._phone(89999881510l)
                ._email("emailnew@gmqwawil.comw").build();
        dao.save(use);

        dao.delete(dao.findByUsername("qwew"));

    }
}
