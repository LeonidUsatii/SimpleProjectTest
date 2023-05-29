package de.ait.models;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @org.junit.jupiter.api.Test
    void getLastName() {
        User user = new User("Leonid", "Usatii", 52, 1.78);
        assertEquals("Leonid", user.getLastName());
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
    }
}