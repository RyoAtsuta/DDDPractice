package app.in_memory.user;

import app.domain.model.user.User;
import app.domain.model.user.IUserFactory;

public class InMemoryUserFactory implements IUserFactory {

    private int currentId = 0;
    
    public User create(String lastName, String firstName) {
        this.currentId++;
        return new User(this.currentId, lastName, firstName);
    }

}