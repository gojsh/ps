package ps.programmers.대문자와_소문자;

import java.util.Scanner;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (char c : my_string.toCharArray()) {
            if (Character.isLowerCase(c)) answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(s.solution(str));
    }
}
