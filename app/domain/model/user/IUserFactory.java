package app.domain.model.user;

public interface IUserFactory {
    public User create(String lastName, String firstName);
}