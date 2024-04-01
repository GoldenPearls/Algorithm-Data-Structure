import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String number1, number2;
        
        BigInteger bigNumber1;
        BigInteger bigNumber2;
        try{
            number1 = in.nextLine();
            number2 = in.nextLine();
            
            bigNumber1 = new BigInteger(number1);
            bigNumber2 = new BigInteger(number2);
            
            BigInteger add = bigNumber1.add(bigNumber2);
            BigInteger minus = bigNumber1.subtract(bigNumber2);
            BigInteger multiply = bigNumber1.multiply(bigNumber2);
            
            System.out.println(add);
            System.out.println(minus);
            System.out.println(multiply);
            
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}