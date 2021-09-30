package app.application.user;

public class ChangeUserDetailCommand
{
    protected int id;
    protected String lastName;
    protected String firstName;

    public ChangeUserDetailCommand(int id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
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