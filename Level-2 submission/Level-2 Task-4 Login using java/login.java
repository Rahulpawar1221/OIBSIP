import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// User.java
 class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}



 class AuthenticationSystem {
    private List<User> users;
    private User currentUser;

    public AuthenticationSystem() {
        this.users = new ArrayList<>();
        this.currentUser = null;
    }

    public void registerUser(String username, String password) {
        users.add(new User(username, password));
        System.out.println("User registered successfully.");
    }

    public void login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                currentUser = user;
                System.out.println("Login successful. Welcome, " + username + "!");
                return;
            }
        }
        System.out.println("Invalid username or password. Login failed.");
    }

    public void accessSecuredPage() {
        if (currentUser != null) {
            System.out.println("You have access to the secured page. Welcome!");
        } else {
            System.out.println("You need to login first.");
        }
    }
}


 class login {
    public static void main(String[] args) {
        AuthenticationSystem authSystem = new AuthenticationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register\n2. Login\n3. Access Secured Page\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String regUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String regPassword = scanner.nextLine();
                    authSystem.registerUser(regUsername, regPassword);
                    break;

                case 2:
                    System.out.print("Enter username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = scanner.nextLine();
                    authSystem.login(loginUsername, loginPassword);
                    break;

                case 3:
                    authSystem.accessSecuredPage();
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
            //scanner.close();
        }
    }
}


