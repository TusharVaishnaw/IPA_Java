import java.util.*;

public class CntChars{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sp=0,cnt=0;
        for(char ch:str.toCharArray()){
            if(ch==' '){
                sp++;
            }
            if(Character.isLetter(ch)){
                cnt++;
            }
        }
        System.out.println("spaces count: " +sp);
        System.out.println("chars count: " + cnt);
    }
}