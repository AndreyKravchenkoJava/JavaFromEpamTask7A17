package project;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        SideIntr sideIntr = (int a, int b, int c) -> {
            if (a + b > c) {
                System.out.println("Triangle create");
            } else {
                System.out.println("Triangle not create");
            }
            return args.length;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side");
        int result = sideIntr.sideIntr(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(result);
    }
}
