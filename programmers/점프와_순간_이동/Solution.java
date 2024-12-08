package ps.programmers.점프와_순간_이동;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while (n != 0) {
            if(n % 2 == 0) n /=2;
            else {
                n--;
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(s.solution(n));
    }
}
