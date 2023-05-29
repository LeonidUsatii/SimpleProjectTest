package de.ait.app;

import de.ait.models.User;
import de.ait.repositories.UsersRepository;
import de.ait.repositories.UsersRepositoryListImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет");
        UsersRepository usersRepository = new UsersRepositoryListImpl();
        List<User> users = usersRepository.findAll();

    }
}
