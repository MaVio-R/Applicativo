package Controller;

import Model.*;
import Gui.Admin.*;
import Gui.User.*;

import java.util.Scanner;
import java.util.ArrayList;


public class Controller {
    private ArrayList<User> users;
    private User loggedUser;

    public Controller() {
        users = new ArrayList<>();
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) &&
                    user.getPassword().equals(password)) {
                loggedUser = user;
                return true;
            }
        }
        return false;
    }

    public void register(String username, String password) {
        User newUser = new User(username, password);
        users.add(newUser);
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void logout() {
        loggedUser = null;
    }
}
