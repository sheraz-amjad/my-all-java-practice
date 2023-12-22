public @ManagedBean
@RequestScoped
public class LoginBean {
    private String username;
    private String password;
    private UserDAO userDAO;

    public LoginBean() {
        userDAO = new UserDAOImpl(); // Instantiate the UserDAO implementation
    }

    public String login() {
        User user = userDAO.getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            // Successful login, navigate to a protected page
            return "success";
        } else {
            // Invalid credentials, show an error message
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid credentials", null));
            return null;
        }
    }

    public String register() {
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password);
        userDAO.addUser(newUser);
        // Registration successful, navigate to a login page
        return "login";
    }

    // Getters and setters
}{

}
