package ps.programmers.약수_구하기;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer.add(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(s.solution(n));
    }
}
