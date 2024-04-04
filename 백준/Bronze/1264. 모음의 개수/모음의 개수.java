import java.util.Scanner;

public class Main{
    public static void main(String[] arga){
        Scanner in = new Scanner(System.in);
        
        String sentenceTotal;
        int count = 0;
        try{
            while(true){
               sentenceTotal = in.nextLine();
                
                if("#".equals(sentenceTotal)){// 입력값이 "#"인 경우
                    break; // 반복문 종료
                }
               
               String[] sentence = sentenceTotal.split("\\?|\\.");
               for(String str : sentence){ //각 문자열에 대해 반복
                   for(int i=0; i<str.length(); i++){
                       char ch = str.charAt(i);
                       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                          ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                           count++;
                       }
                   }
                   System.out.println(count); // 각 줄의 개수 출력
                   count = 0; //각 줄을 세기 위한 초기화
               }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}