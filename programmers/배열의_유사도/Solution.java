package ps.programmers.배열의_유사도;

import java.util.Scanner;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        String[] bigger, smaller;
        if (s1.length >= s2.length) {
            bigger = s1;
            smaller = s2;
        } else {
            bigger = s2;
            smaller = s1;
        }

        for (String i : bigger) {
            for (String j : smaller) {
                if (i.equals(j)) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int l1 = kb.nextInt();
        int l2 = kb.nextInt();
        String[] arr1 = new String[l1];
        String[] arr2 = new String[l2];
        for (int i = 0; i < arr1.length; i++) arr1[i] = kb.next();
        for (int i = 0; i < arr2.length; i++) arr2[i] = kb.next();

        System.out.println(s.solution(arr1, arr2));
    }
}
