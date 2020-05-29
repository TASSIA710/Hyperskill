package machine;

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
        for (int i = 0; i < STEPS.length; i++) {
            System.out.println(STEPS[i]);
        }
    }

}
