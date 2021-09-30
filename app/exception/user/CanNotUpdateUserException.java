package app.exception.user;

import app.domain.model.user.User;

public class CanNotUpdateUserException extends Exception {
    private static final long serialVersionUID = 1L;

    public CanNotUpdateUserException(User user) {
        super("Name '" + user.getLastName() + " " + user.getFirstName() + "' can not be updated");
    }
}