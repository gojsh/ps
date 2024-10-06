package ps.programmers.구슬을_나누는_경우의_수;

import java.util.Scanner;

class Solution {
    public int solution(int balls, int share) {
        return comb(balls, share);
    }

    public int comb(int n, int r) {
        r = Math.min(r, n - r);

        if (r == 0) return 1;
        else if (r == 1) return n;
        else return comb(n - 1, r) + comb(n - 1, r - 1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int balls = kb.nextInt();
        int share = kb.nextInt();
        System.out.println(s.solution(balls, share));
    }
}

//n-1 C r-1 + n-1 C r = nCr
//https://www.youtube.com/watch?v=42x7PSL0X7M