public class Admin {
    private String username = "admin114";
    private String password = "password114";

    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}
