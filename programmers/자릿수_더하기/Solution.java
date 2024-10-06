package ps.programmers.자릿수_더하기;

import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            answer += s.charAt(i) - 48;
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(s.solution(n));
        System.out.println(s.solution2(n));
    }
}
