package ps.programmers.잘라서_배열로_저장하기;

import java.util.Scanner;

class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length() / n;
        if (my_str.length() % n != 0) {
            length++;
        }

        String[] answer = new String[length];

        for (int i = 0; i < answer.length - 1; i++) {
            String tmp = my_str.substring(0, n);
            answer[i] = tmp;
            my_str = my_str.substring(n);
        }
        answer[length - 1] = my_str;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String my_str = kb.next();
        int n = kb.nextInt();
        for (String i : s.solution(my_str, n)) System.out.println(i);
    }
}
