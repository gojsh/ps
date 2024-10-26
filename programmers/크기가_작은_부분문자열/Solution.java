package ps.programmers.크기가_작은_부분문자열;

import java.util.Scanner;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        long pLong = Long.parseLong(p);

        for (int i = 0; i < t.length() - len + 1; i++) {
            String str = t.substring(i, i + len);
            if (Long.parseLong(str) <= pLong) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String t = kb.next();
        String p = kb.next();
        System.out.println(s.solution(t, p));
    }
}
