import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        // count 줄까지 돌림
        for (int i = 0; i < count; i++) {
            //왼쪽 별 출력
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // 공백출력
            for (int j = 2 * count - 2; j > 2*i; j --) {
                System.out.print(" ");
            }

            // 오른쪽 별 출력
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // count 줄보다 초과했을때
        for (int i = count-1; i > 0; i--) {
            //왼쪽 별 출력
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }

            //공백 출력
            for (int j = 2*i-1; j <= 2 * count - 2; j++) {
                System.out.print(" ");
            }

            //오른쪽 별 출력
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}