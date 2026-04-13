import java.util.*;

public class CntLowers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt=0;
        for(char ch:str.toCharArray()){
            if(ch>='a' && ch<='z'){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}