import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] freq = new int[256];
        StringBuilder sb = new StringBuilder();
        boolean hasDuplicate = false;

        for (char ch : s.toCharArray()) {

            if (ch == ' ') {
                sb.append(ch);
                continue;
            }

            if (freq[ch] == 1) {
                sb.append('?');
                hasDuplicate = true;
            } else {
                sb.append(ch);
            }

            freq[ch]++;
        }

        if (!hasDuplicate) {
            System.out.println("No duplicates present in the given string");
        } else {
            System.out.println(sb.toString());
        }
    }
}
