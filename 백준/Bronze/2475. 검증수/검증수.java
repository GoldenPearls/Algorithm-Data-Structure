import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int num1, num2, num3, num4, num5;
        int result;
        
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        num4 = in.nextInt();
        num5 = in.nextInt();
        
        num1 = square(num1);
        num2 = square(num2);
        num3 = square(num3);
        num4 = square(num4);
        num5 = square(num5);
        
        result = (num1 + num2 + num3 + num4 + num5)%10;
        
        System.out.print(result);
    }
    
    public static int square(int num){
        
        return (int) Math.pow(num, 2);
    }
}