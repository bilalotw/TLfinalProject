package Parent;
class parent{
public class Main {
public static void main(String[] args) {
    // Create a new User instance
    User user = new User("user@example.com", "securePassword123");

    // Display user information
    user.displayUserInfo();

    // Change email and password
    user.setEmail("newuser@example.com");
    user.setPassword("newSecurePassword456");

    // Display updated information
    user.displayUserInfo();
}
}
}
