package solver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
        double d = scanner.nextDouble(), e = scanner.nextDouble(), f = scanner.nextDouble();

        // (Taken from the task itself):
        // a*x + b*y = c
        // y = (f - c*d/a) / (e - b*d/a)

        double y = (f - c*d/a) / (e - b*d/a);
        double x = (c - b*y) / a;

        System.out.println(x + " " + y);
    }

}
