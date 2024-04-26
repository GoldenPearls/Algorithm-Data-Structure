import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        // 시
        int hour = in.nextInt();
        // 분
        int minute = in.nextInt();
        
        // 시간을 분으로 
        int wakeTime = (hour * 60) + minute - 45;
        
        if(wakeTime >= 0){
            System.out.printf("%d %d", (int)wakeTime/60, wakeTime%60);
        }
        else{
            System.out.printf("23 %d", 60+wakeTime);
        }
    }
}