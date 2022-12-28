public class Menu {

    public static void displayMenu() {
        System.out.println("Welcome to the shopping basket");
        System.out.println("Please choose an option:");
        System.out.println("1. Add item");
        System.out.println("2. Display basket");
        System.out.println("3. Exit");
    }

    public static void displayMenuAlt() {
        System.out.println("Please choose an option:");
        System.out.println("1. Add item");
        System.out.println("2. Display basket");
        System.out.println("3. Exit");
    }

    public static void separatedMenu(){
        System.out.println("1. Vegetables");
        System.out.println("2. Fruits");
        System.out.println("3. Dairy");
        System.out.println("4: Back");
        System.out.println("5: Exit");
    }

    public static void vegetableMenu(){
        System.out.println("Tomato");
        System.out.println("Potato");
        System.out.println("Cucumber");
        System.out.println("Broccoli");
        System.out.println("Carrot");
        System.out.println("Please write the name of the product you would like to add to the basket: ");
    }

    public static void fruitMenu(){
        System.out.println("Banana");
        System.out.println("Kiwi");
        System.out.println("Apple");
        System.out.println("Watermelon");
        System.out.println("Grapes");
        System.out.println("Please write the name of the product you would like to add to the basket: ");
    }

    public static void dairyMenu(){
        System.out.println("Cheese");
        System.out.println("Yogurt");
        System.out.println("Milk");
        System.out.println("Kefir");
        System.out.println("Egg");
        System.out.println("Please write the name of the product you would like to add to the basket: ");
    }


}
