package ps.programmers.숫자_문자열과_영단어;

import java.util.Scanner;

class Solution {
    public int solution(String s) {
        int answer;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                s = s.replace(arr[i], Integer.toString(i));
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(s.solution(str));
    }
}
