package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static final int COFFEE_ESPRESSO = 0;
    private static final int COFFEE_LATTE = 1;
    private static final int COFFEE_CAPPUCCINO = 2;
    private static final int[][] INGREDIENTS_MATRIX = {
            //  COST,   WATER,  MILK,   BEANS }
            {   4,      250,    0,      16 },
            {   7,      350,    75,     20 },
            {   6,      200,    100,    12 }
    };

    public static void main(String[] args) {
        new CoffeeMachine(550, 400, 540, 120, 9);
    }

    private final Scanner scanner;
    private int money, water, milk, beans, cups;

    public CoffeeMachine(int money, int water, int milk, int beans, int cups) {
        this.scanner = new Scanner(System.in);
        this.money = money;
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;

        executeAsk();
    }

    protected void printInfo() {
        System.out.println("The coffee machine has:");
        System.out.format("%s of water\n", water);
        System.out.format("%s of milk\n", milk);
        System.out.format("%s of coffee beans\n", beans);
        System.out.format("%s of disposable cups\n", cups);
        System.out.format("%s of money\n", money); // weird phrasing, but I'll take it
    }

    protected void executeAsk() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.nextLine();
        switch (action.toLowerCase()) {
            case "buy":
                executeBuy();
                break;
            case "fill":
                executeFill();
                break;
            case "take":
                executeTake();
                break;
            case "remaining":
                printInfo();
                break;
            case "exit":
                return;
            default:
                System.out.println("Unknown action. Try again.");
                executeAsk();
                return;
        }
        System.out.println();
        executeAsk();
    }

    protected void executeBuy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffee = scanner.nextLine(); // We could also just take this - 1 and use that as the ID

        if (coffee.equals("1")) {
            executeBuyCoffee(COFFEE_ESPRESSO, "Espresso");
        } else if (coffee.equals("2")) {
            executeBuyCoffee(COFFEE_LATTE, "Latte");
        } else if (coffee.equals("3")) {
            executeBuyCoffee(COFFEE_CAPPUCCINO, "Cappuccino");
        } else if (coffee.equalsIgnoreCase("back")) {
            return;
        } else {
            System.out.println("Unknown coffee. Try again.");
            executeBuy();
        }
    }

    protected void executeBuyCoffee(int coffee, String name) {
        int[] matrix = INGREDIENTS_MATRIX[coffee];

        if (water < matrix[1] || milk < matrix[2] || beans < matrix[3] || cups < 1) {
            System.out.println("Sorry, I am out of stock.");
            return;
        }
        System.out.format("Making a %s...\n", name);

        money += matrix[0];
        water -= matrix[1];
        milk -= matrix[2];
        beans -= matrix[3];
        cups--;
    }

    protected void executeFill() {
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans += scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += scanner.nextInt();
    }

    protected void executeTake() {
        System.out.format("I gave you $%s", money);
        money = 0;
    }

}
