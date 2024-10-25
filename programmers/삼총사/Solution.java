package ps.programmers.삼총사;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    static int answer = 0;

    public int solution(int[] number) {
        int[] ch = new int[3];
        dfs(number, 0, ch, 0);
        return answer;
    }

    public void dfs(int[] number, int count, int[] ch, int startIndex) {
        if (count == 3) {
            int sum = Arrays.stream(ch).sum();
            if (sum == 0) answer++;
            return;
        }

        for (int i = startIndex; i < number.length; i++) {
            ch[count] = number[i];
            dfs(number, count + 1, ch, i + 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) number[i] = kb.nextInt();
        System.out.println(s.solution(number));
    }
}
