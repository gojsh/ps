package ps.programmers.아이스_아메리카노;

import java.util.Scanner;

class Solution {
    public int[] solution(int money) {
        int cnt = money / 5500;
        int ex = money - cnt * 5500;
        return new int[]{cnt, ex};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int money = kb.nextInt();
        int[] answer;
        answer = s.solution(money);

        for (int i : answer) System.out.println(i);
    }
}
