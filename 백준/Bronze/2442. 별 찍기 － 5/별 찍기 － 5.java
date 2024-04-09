import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 1; i <= count; i++) {

            // 왼쪽 공백 출력
            for (int k = 0; k < count - i; k++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();
        }
    }
}
