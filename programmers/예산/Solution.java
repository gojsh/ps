package ps.programmers.예산;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++) {
            budget -= d[i];
            if(budget < 0) break;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] d = new int[n];
        int budget = kb.nextInt();
        for(int i=0; i<d.length; i++) d[i] = kb.nextInt();
        System.out.println(s.solution(d, budget));
    }
}
