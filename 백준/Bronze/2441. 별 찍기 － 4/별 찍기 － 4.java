import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for(int i = count; i > 0; i--) {
            // 공백 출력: 각 줄마다 점점 늘어나야 하므로 (count - i) 만큼 공백 출력
            for(int k = 0; k < count - i; k++) {
                System.out.print(" ");
            }
            
            // 별 출력: 줄 번호만큼 별 출력
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
           
            System.out.println(); // 줄바꿈
        }
    }
}