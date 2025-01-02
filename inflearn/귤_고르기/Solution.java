package ps.inflearn.귤_고르기;

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList, Collections.reverseOrder());

        for (int v : valueList) System.out.println(v);

        for (int v : valueList) {
            if (sum + v >= k) {
                answer++;
                break;
            } else {
                sum += v;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int k = kb.nextInt();
        int[] tangerine = new int[kb.nextInt()];
        for (int i = 0; i < tangerine.length; i++) tangerine[i] = kb.nextInt();
        System.out.println(s.solution(k, tangerine));
    }
}
