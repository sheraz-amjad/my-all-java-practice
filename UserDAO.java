public interface UserDAO {
    User getUserByUsername(String username);

    void addUser(User user);
}