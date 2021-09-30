package app.application.user;

public class CreateUserCommand
{
    protected String lastName;
    protected String firstName;

    public CreateUserCommand(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }
}