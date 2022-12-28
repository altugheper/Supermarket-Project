import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingBasket {
    private Map<String, Integer> basket;
    private Map<String, Double> prices;
    private boolean flag;

    DecimalFormat moneyFormat = new DecimalFormat("###,##0.00");


    public ShoppingBasket() {
        basket = new HashMap<>();
        prices = new HashMap<>();
        prices.put("Tomato", 11.90);
        prices.put("Potato", 3.98);
        prices.put("Cucumber", 3.49);
        prices.put("Broccoli", 4.79);
        prices.put("Carrot", 2.69);
        prices.put("Banana", 6.49);
        prices.put("Kiwi", 5.99);
        prices.put("Apple", 3.69);
        prices.put("Watermelon", 79.99);
        prices.put("Grapes", 10.19);
        prices.put("Cheese", 6.59);
        prices.put("Yogurt", 4.50);
        prices.put("Milk", 2.69);
        prices.put("Kefir", 1.70);
        prices.put("Egg", 13.99);
        Scanner input = new Scanner(System.in);
        flag = true;
    }

    public void addItem(String item, int quantity) {
        if (prices.containsKey(item)) {
            basket.put(item, quantity);
        } else {
            System.out.println("Item not found");
        }
    }


    public double getTotalCost() {
        double totalCost = 0.0;
        for (Map.Entry<String, Integer> entry : basket.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();
            double price = prices.get(item);
            totalCost += price * quantity;
        }
        return totalCost;
    }

    public void displayBasket() {
        System.out.println("Shopping basket:");
        for (Map.Entry<String, Integer> entry : basket.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();
            double price = prices.get(item);
            System.out.println(item + " x " + quantity + ": " + price * quantity + "$");
        }
        System.out.println("Total cost: " + moneyFormat.format(getTotalCost()) + "$");
    }










}
