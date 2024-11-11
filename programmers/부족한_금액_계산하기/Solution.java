package ps.programmers.부족한_금액_계산하기;

import java.util.Scanner;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for (int i = 1; i <= count; i++) sum += (long) price * i;
        if (sum > money) answer = sum - money;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int price = kb.nextInt();
        int money = kb.nextInt();
        int count = kb.nextInt();
        System.out.println(s.solution(price, money, count));
    }
}
