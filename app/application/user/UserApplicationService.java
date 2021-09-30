package app.application.user;

import app.domain.model.user.UserService;
import app.domain.model.user.IUserFactory;
import app.domain.model.user.IUserRepository;
import app.domain.model.user.UserFullSpecification;
import app.domain.model.user.User;
import app.exception.user.CanNotCreateUserException;
import app.exception.user.CanNotUpdateUserException;
import java.util.List;

public class UserApplicationService
{
    protected UserService userService;
    protected IUserFactory userFactory;
    protected IUserRepository userRepository;
    protected UserFullSpecification userFullSpecification;

    public UserApplicationService(
        UserService userService,
        IUserFactory userFactory,
        IUserRepository userRepository,
        UserFullSpecification userFullSpecification
    ) {
        this.userService = userService;
        this.userFactory = userFactory;
        this.userRepository = userRepository;
        this.userFullSpecification = userFullSpecification;
    }

    public void createUser(CreateUserCommand command) throws CanNotCreateUserException {
        User user = this.userFactory.create(command.getLastName(), command.getFirstName());
        List<User> users = this.userRepository.findAll();

        if (this.userService.exists(user) || !this.userFullSpecification.isSatisfied(users)) {
            throw new CanNotCreateUserException(user);
        }

        this.userRepository.save(user);        
    }

    public UserCollection getAllUsers(GetAllUsersCommand command) {
        List<User> users = this.userRepository.findAll();
        return new UserCollection(users);
    }

    public UserData getUser(GetUserCommand command) {
        int userId = command.getId();
        User user = this.userRepository.find(userId);

        if (user == null) {
            return null;
        }

        return new UserData(user);
    }

    public void changeUserDetail(ChangeUserDetailCommand command) throws CanNotUpdateUserException {
        User user = this.userFactory.create(command.getLastName(), command.getFirstName());

        if (this.userService.exists(user)) {
            throw new CanNotUpdateUserException(user);
        }

        user = this.userRepository.find(command.getId());
        user.changeName(command.getLastName(), command.getFirstName());

        this.userRepository.save(user);
    }

    public void deleteUser(DeleteUserCommand command) {
        User user = this.userRepository.find(command.getId());

        if (user == null) {
            return;
        }

        this.userRepository.delete(command.getId());
    }

}