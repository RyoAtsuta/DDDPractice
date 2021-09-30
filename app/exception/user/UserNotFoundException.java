package app.exception.user;

public class UserNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public UserNotFoundException(int id) {
        super("This user id(" + id + ") not found");
    }
}