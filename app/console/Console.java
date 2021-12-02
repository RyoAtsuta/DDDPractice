package app.console;

import app.application.user.UserCollection;
import app.application.user.UserData;

public class Console {
    public void printUser(UserData user) {
        System.out.println("ID: " + user.getId());
        System.out.println("Name: " + user.getLastName() + " " + user.getFirstName());
        System.out.println("");
    }

    public void printUsers(UserCollection users) {
        System.out.println("=================== list users ==========================");
        for (UserData user : users.getUsers()) {
            this.printUser(user);
        }
        System.out.println("=================== end of list users ==========================");
    }

    public void printError(Exception e) {
        System.out.println("ERROR: " + e.getMessage());
    }
}