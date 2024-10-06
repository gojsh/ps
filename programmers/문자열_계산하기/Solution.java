package ps.programmers.문자열_계산하기;

import java.util.Scanner;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");

        answer += Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i].equals("+")) answer += Integer.parseInt(arr[i + 1]);
            else answer -= Integer.parseInt(arr[i + 1]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(s.solution(str));
    }
}