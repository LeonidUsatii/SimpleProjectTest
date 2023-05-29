package de.ait.repositories;

import de.ait.models.User;

import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryListImpl implements UsersRepository{
    @Override
    public List<User> findAll() {
        ArrayList<User> users = new ArrayList<>();
        User user = new User("Leonid", "Usatii", 52, 1.78);

        users.add(user);

        return users;
    }
    
}

