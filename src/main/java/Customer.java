import java.util.Scanner;

public class Customer extends Runner {

    Scanner input = new Scanner(System.in);
    private int username;
    private int password;


    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Customer() {
    }

    public Customer(int username, int password) {
        this.username = username;
        this.password = password;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }





}
