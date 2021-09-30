package app.domain.model.user;

import java.util.List;

public interface IUserRepository
{
    public List<User> findAll();

    public User find(String lastName, String firstName);

    public User find(int id);

    public void save(User user);

    public void delete(int id);
}