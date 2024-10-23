package ps.programmers.PCCE_LV1.PCCE_기출문제_10번_데이터_분석;

import java.util.HashMap;
import java.util.Scanner;

import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("code", 0);
        hm.put("date", 1);
        hm.put("maximum", 2);
        hm.put("remain", 3);

        int[][] filteredData = Arrays.stream(data).filter(x -> x[hm.get(ext)] < val_ext).toArray(int[][]::new);
        Arrays.sort(filteredData, Comparator.comparingInt(o -> o[hm.get(sort_by)]));

        return filteredData;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] data = new int[n][4];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = kb.nextInt();
            }
        }
        String ext = kb.next();
        int val_ext = kb.nextInt();
        String sort_by = kb.next();
        for (int[] arr : s.solution(data, ext, val_ext, sort_by)) {
            for (int i : arr) System.out.println(i);
        }
    }
}
