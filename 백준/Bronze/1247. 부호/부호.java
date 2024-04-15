import java.util.Scanner;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
        // 배열의 크기 입력 받기
        int arrayAmount = in.nextInt();    
        in.nextLine(); // 정수 입력 후 남은 뉴라인 문자 소비

        // BigInteger 배열 생성
        BigInteger[] bigNumbers = new BigInteger[arrayAmount];

        // BigInteger 값 입력 및 합 계산
        BigInteger addResult = BigInteger.ZERO;
        for (int i = 0; i < arrayAmount; i++) {
            bigNumbers[i] = new BigInteger(in.nextLine());
            addResult = addResult.add(bigNumbers[i]); // 합 계산
        }

        // 합의 부호 출력
        if (addResult.compareTo(BigInteger.ZERO) > 0) {
            System.out.println("+");
        } else if (addResult.compareTo(BigInteger.ZERO) < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }

        // 다음을 위한 초기화
        arrayAmount = 0;
        addResult = BigInteger.ZERO;
        }
    }
}
