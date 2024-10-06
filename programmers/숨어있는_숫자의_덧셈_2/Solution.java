package ps.programmers.숨어있는_숫자의_덧셈_2;

import java.util.Scanner;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] s = my_string.replaceAll("[A-Za-z]", " ").split(" ");
        //my_string = my_string.replaceAll("[^\\d]", " ");
        for (String i : s) {
            if (!i.isEmpty()) answer += Integer.parseInt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String my_string = kb.next();
        System.out.println(s.solution(my_string));
    }
}
