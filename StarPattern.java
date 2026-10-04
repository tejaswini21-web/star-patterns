package Test;

public class StarPattern {

    public static void main(String[] args) {

        // Pattern 1: Increasing Triangle
        System.out.println("Pattern 1:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 2: Decreasing Triangle
        System.out.println("\nPattern 2:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 3: Increasing Pyramid
        System.out.println("\nPattern 3:");
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Pattern 4: Decreasing Pyramid
        System.out.println("\nPattern 4:");
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

