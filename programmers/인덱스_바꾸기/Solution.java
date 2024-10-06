package ps.programmers.인덱스_바꾸기;

import java.util.Scanner;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] c = my_string.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (i == num1) {
                answer += c[num2];
                continue;
            } else if (i == num2) {
                answer += c[num1];
                continue;
            }
            answer += c[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String my_string = kb.nextLine();
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        System.out.println(s.solution(my_string, num1, num2));
    }
}
