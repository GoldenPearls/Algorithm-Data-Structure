import java.util.Scanner;
import java.math.BigInteger;
import java.util.InputMismatchException;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n, m;
        
        BigInteger number1;
        BigInteger number2;
        BigInteger result;
        try{
            n = in.next();
            m = in.next();
            
            number1 = new BigInteger(n);
            number2 = new BigInteger(m);
            
            result = number1.subtract(number2).abs();
             
            System.out.println(result);
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
    }
   
}