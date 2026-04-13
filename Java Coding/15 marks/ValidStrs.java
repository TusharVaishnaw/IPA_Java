import java.util.*;

public class ValidStrs{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        String[] arr=s1.split(" ");
        StringBuilder ans= new StringBuilder();
        for(int i =0;i<arr.length;i++){
            char ch=arr[i].charAt(arr[i].length()-1);
            if(Character.isDigit(ch)){
                continue;
            } else{
                ans+=ch;
            }
        }
        System.out.print(ans);
    }
}