import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int count = in.nextInt();
        
        try {
            for (int i = 1; i <= count; i++) {
                // 각 줄마다 공백 출력
                for (int j = 1; j <= count - i; j++) {
                    System.out.print(" ");
                }
                // 이어서 별 출력
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                // 한 줄 완성 후 개행
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}