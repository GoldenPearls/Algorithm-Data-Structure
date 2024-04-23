import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String sentence = in.nextLine();
        StringBuilder modifiedSentence = new StringBuilder(); // 변경 가능한 문자열을 위한 StringBuilder
        
        for(int i = 0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(Character.isUpperCase(ch)){ //대문자인경우
                modifiedSentence.append(Character.toLowerCase(ch)); 
             }
            else{
               modifiedSentence.append(Character.toUpperCase(ch));
             }
        }
        System.out.print(modifiedSentence.toString());
    }
}