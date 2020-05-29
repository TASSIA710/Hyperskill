package solver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble();

        double x;
        // a * x = b;
        // x = b / a
        x = b / a;

        System.out.println(x);
    }

}
