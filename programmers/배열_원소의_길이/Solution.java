package ps.programmers.배열_원소의_길이;

import java.util.Scanner;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int i = 0;
        for (String str : strlist) {
            answer[i] = str.length();
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        int[] answer;
        System.out.println(str);
        String[] str2 = str.split(" ");
        answer = s.solution(str2);
        for (int i : answer) System.out.print(i);
    }
}
