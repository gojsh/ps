package ps.programmers.치킨_쿠폰;

import java.util.Scanner;

class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        while (coupon >= 10) {
            int restcoupon = coupon % 10;
            answer += coupon / 10;
            coupon = restcoupon + coupon / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int chicken = kb.nextInt();
        System.out.println(s.solution(chicken));
    }
}
