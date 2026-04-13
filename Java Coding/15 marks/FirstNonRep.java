import java.util.*;

public class FirstNonRep{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // SetCharacter st = new HashSet<>();
        int[] arr= new int[256];

        for(char ch:s.toCharArray()){
            arr[ch]++;
        }
        for(char ch:s.toCharArray()){
            if(arr[ch]==1){
                System.out.print(ch);
                break;
            }
        }
    }
}