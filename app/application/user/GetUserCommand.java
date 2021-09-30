package app.application.user;

public class GetUserCommand
{
    protected int id;

    public GetUserCommand(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}