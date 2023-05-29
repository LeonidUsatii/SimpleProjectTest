package de.ait.models;

public class User {
    private String lastName;
    private String firstName;
    private int age;
    private double height;

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
