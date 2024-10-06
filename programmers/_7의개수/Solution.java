package ps.programmers._7의개수;

import java.util.Scanner;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String s = "";
        for (int i : array) s += i;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '7') answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int[] array = new int[kb.nextInt()];
        for (int i = 0; i < array.length; i++) array[i] = kb.nextInt();
        System.out.println(s.solution(array));
    }
}
