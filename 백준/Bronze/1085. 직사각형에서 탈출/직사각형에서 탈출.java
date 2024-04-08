import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
        
        int[] array = new int[]{w-x, h-y, x, y};
        
        int min = array[0];
        for(int i =1; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        
        System.out.print(min);
        
        
    }
}