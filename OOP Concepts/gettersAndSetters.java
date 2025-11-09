import java.util.*;

public class gettersAndSetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account myAccount = new Account();

        // Step 1: Set Account Number
        System.out.print("Enter your account number: ");
        myAccount.setNumber(sc.nextInt());
        sc.nextLine(); // Consume leftover newline

        // Step 2: Set Password
        System.out.print("Set your password: ");
        myAccount.setPassword(sc.nextLine());

        // Step 3: Ask to verify password
        System.out.print("Re-enter your password to verify: ");
        String enteredPassword = sc.nextLine();

        // Step 4: Display account info and check password
        System.out.println("\nYour account number is: " + myAccount.getNumber());

        if (myAccount.checkPassword(enteredPassword)) {
            System.out.println("Password is correct.");
        } else {
            System.out.println("Incorrect password.");
        }

        sc.close();
    }
}

class Account {
    private int number;
    private String password;

    // Getters and setters
    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("New password updated successfully.");
    }

    public boolean checkPassword(String inputPassword) {
        return password.equals(inputPassword);
    }
}

