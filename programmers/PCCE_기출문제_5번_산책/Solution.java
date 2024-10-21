package ps.programmers.PCCE_기출문제_5번_산책;

import javax.xml.transform.Source;
import java.util.Scanner;

class Solution {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int[2];
        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String route = kb.next();
        System.out.print("[");
        for (int i : s.solution(route)) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}
