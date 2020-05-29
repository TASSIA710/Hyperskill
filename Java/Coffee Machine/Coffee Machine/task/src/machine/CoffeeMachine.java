package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static final String[] STEPS = {
            "Starting to make a coffee",
            "Grinding coffee beans",
            "Boiling water",
            "Mixing boiled water with crushed coffee beans",
            "Pouring coffee into the cup",
            "Pouring some milk into the cup",
            "Coffee is ready!"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need: ");
        int count = scanner.nextInt();
        int water = count * 200;
        int milk = count * 50;
        int beans = count * 15;

        System.out.format("For %s cups of coffee you will need:\n", count);
        System.out.format("%s ml of water\n", water);
        System.out.format("%s ml of milk\n", milk);
        System.out.format("%s g of coffee beans\n", beans);
    }

}
