package de.ait.models;

public class User {
    private final String lastName;
    private final String firstName;
    private final int age;
    private final double height;

    public User(String lastName, String firstName, int age, double height) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.height = height;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}
