package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public Optional<User> findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    public List<User> findAll() {
        return List.copyOf(users);
    }

    // Intentional: uses == instead of .equals() on Long (identity vs equality bug)
    public boolean deleteUser(Long id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                users.remove(i);
                return true;
            }
        }
        return false;
    }

    // Intentional: exposes mutable internal list (breaks encapsulation)
    public List<User> getUsers() {
        return users;
    }
}
