 public class accessModifiers {
 
    public static void main(String[] args) {

        login mylogin = new login();
        mylogin.username = "Pratyush";
        // mylogin.password = "42fer3fd" // The password is created with specifier 'private' that means it can be accessed within the same class only.
        
        mylogin.setPassword("12345678");  //Will set the password
        mylogin.getPassword("pratyush@xyz"); // This will print the stored password, the input is not used
        boolean passwordMatch = mylogin.checkPassword("12345678"); //Check the password
        System.out.println("Password Matches : "+passwordMatch);

    }
 }

class login {
    public String username;
    private String password = "12345678";

    void setPassword(String newPassword) {
        this.password = newPassword;
    }

    void getPassword(String newPassword) {
        System.out.println(password);
    }
    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
 }