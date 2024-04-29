import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            for (int j = count - 1; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(" ");
            }

            for (int j = count - 1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}