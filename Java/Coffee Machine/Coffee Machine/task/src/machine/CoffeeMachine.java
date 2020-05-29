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

        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        int can = (int) water / 200;
        can = Math.min(can, milk / 50);
        can = Math.min(can, beans / 15);

        if (can == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (can > cups) {
            System.out.format("Yes, I can make that amount of coffee (and even %s more than that)\n", can - cups);
        } else {
            System.out.format("No, I can make only %s cup(s) of coffee\n", can);
        }
    }

}
