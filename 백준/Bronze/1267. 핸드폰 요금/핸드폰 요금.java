import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int totalCallCount = in.nextInt(); // 총 전화 횟수
        in.nextLine(); // 숫자 입력 후 남은 줄바꿈 문자 제거
        
        int yFee = 0; // 영식 요금
        int mFee = 0; // 민식 요금
        
        for (int i = 0; i < totalCallCount; i++) {
            int callTime = in.nextInt();
            // 영식 요금 계산: 30초마다 10원
            yFee += (callTime / 30 + 1) * 10;
            // 민식 요금 계산: 60초마다 15원
            mFee += (callTime / 60 + 1) * 15;
        }
        
        // 결과 출력
        if (yFee < mFee) {
            System.out.printf("Y %d\n", yFee);
        } else if (mFee < yFee) {
            System.out.printf("M %d\n", mFee);
        } else { // 요금이 같은 경우
            System.out.printf("Y M %d\n", yFee);
        }
        
        in.close();
    }
}