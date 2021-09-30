package app.in_memory.user;

import java.util.List;
import java.util.ArrayList;
import app.domain.model.user.User;
import app.domain.model.user.IUserRepository;

public class InMemoryUserRepository implements IUserRepository
{
    protected static List<User> users;
    protected int current_user_count = 0;

    public InMemoryUserRepository() {
        InMemoryUserRepository.users = new ArrayList<User>();
    }

    public List<User> findAll() {
        return InMemoryUserRepository.users;
    }

    public User find(String lastName, String firstName) {
        for (User user : InMemoryUserRepository.users) {
            if (user.getLastName() == lastName && user.getFirstName() == firstName) {
                return user;
            }
        }
        return null;
    }

    public User find(int id) {
        for (User user : InMemoryUserRepository.users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public void save(User user) {
        InMemoryUserRepository.users.add(user);
        current_user_count++;
    }

    public void delete(int id) {
        InMemoryUserRepository.users.removeIf(user -> user.getId() == id);
        current_user_count--;
    }
}