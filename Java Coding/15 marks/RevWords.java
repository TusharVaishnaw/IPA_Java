import java.util.*;

public class RevWords{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        StringBuilder ans=new  StringBuilder();
        for(int i=line.length-1;i>=0;i--){
            ans.append(line[i]);
            if(i>0) ans.append(" ");
        }
        System.out.print(ans);

    }
}