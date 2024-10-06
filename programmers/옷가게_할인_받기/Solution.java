package ps.programmers.옷가게_할인_받기;

import java.util.Scanner;

class Solution {
    public int solution(int price) {
        int answer;
        if (price >= 100000 && price < 300000) {
            answer = (int) (price - price * 0.05);
            return answer;
        } else if (price >= 300000 && price < 500000) {
            answer = (int) (price - price * 0.1);
            return answer;
        } else if (price >= 500000) {
            answer = (int) (price - price * 0.2);
            return answer;
        } else return price;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int price = kb.nextInt();
        System.out.println(s.solution(price));
    }
}