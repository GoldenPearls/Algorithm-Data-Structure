import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        
        String m;
        String n;
        
        Scanner in = new Scanner(System.in);
        
        BigInteger number1;
        BigInteger number2;
        
        try{
            m = in.next();
            n = in.next();
            
            number1 = new BigInteger(m);
            number2 = new BigInteger(n);
            
            BigInteger result = number1.divide(number2);
            BigInteger remainder = number1.remainder(number2);
            
            System.out.println(result);
            System.out.println(remainder);
        }
        catch (NumberFormatException e) {
            System.out.println("올바른 숫자 형식이 아닙니다.");
        }
        catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        
    }
}