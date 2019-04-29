package com.github.owl4soul.interfaces;

import com.github.owl4soul.model.User;

public interface Observer {
    void update(Observer observer, User user);
}
