import java.util.*;

public class Options extends Customer{

    Scanner input = new Scanner(System.in);

    boolean flag = true;


    public void checkingOperations(){
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Menu.displayMenu();
        while (flag) {
            int option = input.nextInt();
            int option2 = input.nextInt();
            switch (option){
                case 1:
                    Menu.separatedMenu();
                    switch (option2){
                        case 1:
                            Menu.vegetableMenu();
                            String item = input.next();
                            System.out.println("Enter the quantity:");
                            int quantity = input.nextInt();
                            shoppingBasket.addItem(item,quantity);
                            break;
                        case 2:
                            Menu.fruitMenu();
                            String item2 = input.next();
                            System.out.println("Enter the quantity:");
                            int quantity2 = input.nextInt();
                            shoppingBasket.addItem(item2,quantity2);
                            break;
                        case 3:
                            Menu.dairyMenu();
                            String item3 = input.next();
                            System.out.println("Enter the quantity:");
                            int quantity3 = input.nextInt();
                            shoppingBasket.addItem(item3,quantity3);
                            break;
                        case 4:
                            checkingOperations();
                        case 5:
                            flag = false;
                            break;
                    }
                case 2:
                    shoppingBasket.displayBasket();
                    System.out.println();
                    Menu.displayMenuAlt();
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
