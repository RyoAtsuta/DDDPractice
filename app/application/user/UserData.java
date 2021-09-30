package app.application.user;

import app.domain.model.user.User;

public class UserData
{
    protected int id;
    protected String lastName;
    protected String firstName;

    public UserData(User user) {
        this.id = user.getId();
        this.lastName = user.getLastName();
        this.firstName = user.getFirstName();
    }

    public int getId() {
        return this.id;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }
}