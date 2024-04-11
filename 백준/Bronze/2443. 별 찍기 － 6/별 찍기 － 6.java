import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 2 * (count - i) - 1; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}