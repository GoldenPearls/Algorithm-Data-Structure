import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int king = in.nextInt();
        int queen = in.nextInt();
        int look = in.nextInt();
        int bishop = in.nextInt();
        int night = in.nextInt();
        int phone = in.nextInt();
        
        System.out.printf("%d %d %d %d %d %d", 1-king, 1-queen, 2-look, 2-bishop, 2-night, 8-phone);
    }
}