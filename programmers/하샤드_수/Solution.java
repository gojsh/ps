package ps.programmers.하샤드_수;

import java.util.Scanner;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int o = x;
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        if (o % sum == 0) return answer;
        else answer = false;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        System.out.println(s.solution(x));
    }
}
