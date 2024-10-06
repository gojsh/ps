package ps.programmers.가장_큰_수_찾기;

import java.util.Scanner;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                answer[0] = max;
                answer[1] = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = kb.nextInt();
        }

        array = s.solution(array);

        for(int i  : array) System.out.println(i);
    }
}
