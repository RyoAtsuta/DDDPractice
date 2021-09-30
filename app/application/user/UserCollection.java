package app.application.user;

import app.domain.model.user.User;
import java.util.List;
import java.util.ArrayList;

public class UserCollection {
    
    protected List<UserData> users;

    public UserCollection(List<User> users) {
        this.users = new ArrayList<UserData>();
        for (User user : users) {
            this.users.add(new UserData(user));
        }
    }

    public List<UserData> getUsers() {
        return this.users;
    }

}