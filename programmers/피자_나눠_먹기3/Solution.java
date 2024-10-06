package ps.programmers.피자_나눠_먹기3;

import java.util.Scanner;

class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if (n / slice != 0) {
            if (n % slice == 0) answer = n / slice;
            else answer = n / slice + 1;
        } else {
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int slice = kb.nextInt();
        int n = kb.nextInt();
        System.out.println(s.solution(slice, n));
    }
}