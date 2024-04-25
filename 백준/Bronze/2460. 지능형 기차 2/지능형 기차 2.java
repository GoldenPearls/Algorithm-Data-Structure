import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        // 내린 사람
        int personGotOff = 0;
        // 탄 사람
        int personRide = 0;
        
        // 현재 기차에 있는 사람
        int personCurrently = 0;
        
        // 1개의 정류장 당 가장 많은 사람
        int maxPerson = 0;
        
        for(int i=0; i<10; i++){
            personGotOff = in.nextInt();
            personRide = in.nextInt();
            personCurrently += personRide;
            personCurrently -= personGotOff;
            
            if(personCurrently >= maxPerson ){
                maxPerson = personCurrently;
            }
        }
        System.out.print(maxPerson);
    }
}