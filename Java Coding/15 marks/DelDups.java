import java.util.*;

public class DelDups{

    //USING ASCII

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     String s1 = sc.next();
    //     boolean[] seen = new boolean[256];
    //     StringBuilder ans = new StringBuilder();

    //     for(char ch:s1.toCharArray()){
    //         if(!seen[ch]){
    //             ans.append(ch);
    //             seen[ch]=true;
    //         }
    //     }
    //     System.out.print(ans);


    // }

    // USING SET
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        Set<Character> st1 = new HashSet<>();
        StringBuilder ans = new StringBuilder();

        for(char ch:s1.toCharArray()){
            if(!st1.contains(ch)){
                ans.append(ch);
                st1.add(ch);
            }
        }
        System.out.print(ans);
    }

}