package ps.programmers.문자열_뒤집기;

import java.util.Scanner;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        str = s.solution(str);
        System.out.println(str);
    }
}
