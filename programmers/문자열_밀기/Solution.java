package ps.programmers.문자열_밀기;

import java.util.Scanner;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        char[] c = A.toCharArray();
        int len = c.length;
        int cnt = 0;
        String tmp;
        if (A.equals(B)) return answer;
        while (cnt != len) {
            tmp = String.valueOf(c[len - 1]);

            for (int i = 0; i < len - 1; i++) {
                tmp += c[i];
            }

            answer++;

            if (tmp.equals(B)) return answer;

            c = tmp.toCharArray();
            cnt++;
        }
        answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String A = kb.next();
        String B = kb.next();
        System.out.println(s.solution(A, B));
    }
}
