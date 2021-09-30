package app.domain.model.user;

public class UserService
{
    protected IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean exists(User user) {
        User savedUser = this.userRepository.find(user.getLastName(), user.getFirstName());

        if (savedUser == null) {
            return false;
        }

        return user.getLastName() == savedUser.getLastName() && user.getFirstName() == savedUser.getFirstName();
    }
}