package ps.programmers.한_번만_등장한_문자;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                answer += arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(s.solution(str));
    }
}
