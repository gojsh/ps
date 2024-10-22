package ps.programmers.PCCE_LV1.PCCE_기출문제_9번_지폐_접기;

import java.util.Scanner;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int bill_min = Math.min(bill[0], bill[1]);
        int wallet_min = Math.min(wallet[0], wallet[1]);
        int bill_max = Math.max(bill[0], bill[1]);
        int wallet_max = Math.max(wallet[0], wallet[1]);

        while (true) {
            if (wallet_min < bill_min || wallet_max < bill_max) {
                bill_max /= 2;
                answer++;
            }
            if (bill_max < bill_min) {
                int tmp = bill_max;
                bill_max = bill_min;
                bill_min = tmp;
            }
            if (bill_max <= wallet_max && bill_min <= wallet_min) break;
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] wallet = new int[n];
        int[] bill = new int[n];
        for (int i = 0; i < wallet.length; i++) wallet[i] = kb.nextInt();
        for (int i = 0; i < bill.length; i++) bill[i] = kb.nextInt();
        System.out.println(s.solution(wallet, bill));
    }
}
