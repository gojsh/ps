package ps.programmers.PCCE_기출문제_6번_물부족;

import java.util.Scanner;

class Solution {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for (int i = 0; i < change.length; i++) {
            usage += usage * change[i] / 100;
            total_usage += usage;
            if (total_usage > storage) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int storage = kb.nextInt();
        int usage = kb.nextInt();
        int n = kb.nextInt();
        int[] change = new int[n];
        for (int i = 0; i < change.length; i++) {
            change[i] = kb.nextInt();
        }
        System.out.println(s.solution(storage, usage, change));
    }
}