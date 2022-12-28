import java.util.*;

public class Options extends Customer{

    Scanner input = new Scanner(System.in);

    boolean flag = true;


    public void displayMenu() {
        System.out.println("Welcome to the shopping basket");
        System.out.println("Please choose an option:");
        System.out.println("1. Add item");
        System.out.println("2. Display basket");
        System.out.println("3. Exit");
    }

    public void displayMenu1() {
        System.out.println("Please choose an option:");
        System.out.println("1. Add item");
        System.out.println("2. Display basket");
        System.out.println("3. Exit");
    }



    public void menu(){
        System.out.println("Tomato");
        System.out.println("Potato");
        System.out.println("Cucumber");
        System.out.println("Broccoli");
        System.out.println("Carrot");
        System.out.println("Banana");
        System.out.println("Kiwi");
        System.out.println("Apple");
        System.out.println("Watermelon");
        System.out.println("Grapes");
        System.out.println("Please write the name of the product you would like to add to the basket: ");
    }



    public void checkingOperations(){
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        displayMenu();
        while (flag) {
            int option = input.nextInt();
            switch (option){
                case 1:
                    menu();
                    String item = input.next();
                    System.out.println("Enter the quantity:");
                    int quantity = input.nextInt();
                    shoppingBasket.addItem(item,quantity);
                case 2:
                    shoppingBasket.displayBasket();
                    System.out.println();
                    displayMenu1();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("You have entered a wrong value");
            }
        }
    }

    HashMap<Integer, Integer> data = new HashMap<>();

public void login() {
    System.out.println("Welcome to Virtual Supermarket");
    do {
        data.put(123456, 1234);
        data.put(123457, 1234);
        data.put(12345, 1234);

        try {
            System.out.println("Please enter your username: ");
            setUsername(input.nextInt());
            System.out.println("Please enter your password: ");
            setPassword(input.nextInt());
        } catch (Exception e) {
            System.out.println("You have entered a wrong Username/Password. Please enter 'Q' to exit.");
            input.nextLine();
            String exit = input.next();
            if (exit.equalsIgnoreCase("q")) {
                System.out.println("GoodBye!");
                flag = false;
            }
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> w : data.entrySet()) {
            if (w.getKey().equals(getUsername()) && w.getValue().equals(getPassword())) {
                checkingOperations();
            } else {
                count++;
            }
        }
    } while (flag);
}





}
