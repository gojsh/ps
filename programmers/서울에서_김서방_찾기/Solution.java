package ps.programmers.서울에서_김서방_찾기;

import java.util.Scanner;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int pos = 0;
        for (int i = 0; i < seoul.length; i++) if (seoul[i].equals("Kim")) pos = i;
        answer = "김서방은 " + pos + "에 있다";
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] seoul = new String[n];
        for (int i = 0; i < n; i++) seoul[i] = kb.next();
        System.out.println(s.solution(seoul));
    }
}
