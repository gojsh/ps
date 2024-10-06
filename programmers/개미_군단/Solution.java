package ps.programmers.개미_군단;

import java.util.Scanner;

class Solution {
    public int solution(int hp) {
        int answer = 0;
        int captain = 5;
        int soldier = 3;

        if (hp % captain != 0) {
            answer += hp / captain;
            hp %= captain;
            if (hp % soldier != 0) {
                answer += hp / soldier;
                hp %= soldier;
                answer += hp;
            } else answer += hp / soldier;
        } else answer += hp / captain;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int hp = kb.nextInt();
        System.out.println(s.solution(hp));
    }
}
