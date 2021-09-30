package app.application.user;

public class DeleteUserCommand
{
    protected int id;

    public DeleteUserCommand(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}