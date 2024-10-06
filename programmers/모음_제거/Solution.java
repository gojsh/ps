package ps.programmers.모음_제거;

import java.util.Scanner;

class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] replace = {"a", "e", "i", "o", "u"};

        for (String d : replace) {
            answer = answer.replaceAll(d, "");
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String my_String = kb.nextLine();
        String answer = s.solution(my_String);
        System.out.print(answer);
    }
}
