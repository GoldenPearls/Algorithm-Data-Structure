import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 1; i <= 2 * count - 1; i++) {
            if (i <= count) {
                for (int j = count - i; j > 0; j--) {
                    System.out.print(" ");
                }


                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= i - count; j++) {
                    System.out.print(" ");
                }


                for (int j = 1; j <= 2 * (2 * count - i) - 1; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}