package app.console;

import app.application.user.UserData;
import app.application.user.UserCollection;

public class Console {
    public void printUser(UserData user) {
        System.out.println("--------");
        System.out.println("ID: " + user.getId());
        System.out.println("Name: " + user.getLastName() + " " + user.getFirstName());
    }
    
    public void printUsers(UserCollection users) {
        System.out.println("=================== start ==========================");
        for (UserData user : users.getUsers()) {
            this.printUser(user);
        }
        System.out.println("=================== end ==========================");
    }

    public void printError(Exception e) {
        System.out.println("ERROR: " + e.getMessage());
    }
}