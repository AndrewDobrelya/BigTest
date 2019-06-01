package com.example.bigtest.ex_004_toast_and_activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String login;
    private String password;
    private String name;

    private static List<User> allUsers = new ArrayList<>();

    public User(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public static List<User> getAllUsers() {
        return allUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }
}
