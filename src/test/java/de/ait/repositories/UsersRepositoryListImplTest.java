package de.ait.repositories;

import de.ait.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersRepositoryListImplTest {

    User user;
    UsersRepository usersRepository;



    @BeforeEach
    void prepareData() {
        user = new User("Leonid", "Usatii", 52, 1.78);
        usersRepository = new UsersRepositoryListImpl();


    }
    @Test
    void findAll() {
        List<User> expected = new ArrayList<>();
        expected.add(user);

        assertEquals(expected.size(), usersRepository.findAll().size());
    }
}