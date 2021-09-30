package app.exception.user;

import app.domain.model.user.User;

public class CanNotCreateUserException extends Exception
{
    private static final long serialVersionUID = 1L;

    public CanNotCreateUserException(User user) {
        super("Name '" + user.getLastName() + " " + user.getFirstName() + "' can not be created");
    }
}
