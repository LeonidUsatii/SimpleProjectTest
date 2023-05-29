package de.ait.models;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;
    @BeforeEach
    void prepareData() {
        user = new User("Leonid", "Usatii", 52, 1.78);
    }
    @org.junit.jupiter.api.Test
    void getLastName() {
        assertEquals("Leonid", user.getLastName());
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        assertEquals("Usatii", user.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals(52, user.getAge());
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
        assertEquals(1.78, user.getHeight());
    }
}