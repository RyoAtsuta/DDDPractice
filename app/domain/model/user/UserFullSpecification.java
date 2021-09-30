package app.domain.model.user;

import java.util.List;

public class UserFullSpecification {
    protected int maxSavingCount = 5;

    protected IUserRepository userRepository;

    public UserFullSpecification(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean isSatisfied(List<User> users) {
        int currentUserSize = users.size();
        int newUserCount = 1;
        if (currentUserSize + newUserCount <= this.maxSavingCount) {
            return true;
        }
        return false;
    }
}