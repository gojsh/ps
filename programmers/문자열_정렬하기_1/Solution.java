package ps.programmers.문자열_정렬하기_1;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");
        int[] answer = new int[my_string.length()];
        int i = 0;

        for (char c : my_string.toCharArray()) {
            answer[i] = (int) c - 48;
            i++;
        }

        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String my_string = kb.next();
        int[] answer;
        answer = s.solution(my_string);
        for (int i : answer) System.out.println(i);

    }
}
