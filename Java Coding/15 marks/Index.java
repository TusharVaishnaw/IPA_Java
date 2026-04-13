import java.util.*;

public class Index{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        // 
        System.out.print(str.indexOf(c));
        // int cnt =0;
        // for(char ch:str.toCharArray()){

        //     if(ch==c){
        //         System.out.print(cnt);
        //         break;
        //     }
        //     cnt++;
        // }
    }
} 