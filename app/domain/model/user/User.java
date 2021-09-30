package app.domain.model.user;

public class User
{
    protected int id;
    protected String lastName = "";
    protected String firstName = "";

    public User(int id, String lastName, String firstName) {
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

    public void changeName(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

}