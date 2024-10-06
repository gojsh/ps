package ps.inflearn.학급_회장_해쉬;

import java.util.HashMap;
import java.util.Scanner;

class Main {
    public char solution(String s) {
        char answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);

        }
//        System.out.println(map.containsKey('F'));
//        System.out.println(map.size());
//        System.out.println(map.remove('A'));
//        System.out.println(map.size());
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
//            System.out.println(x+" "+map.get(x));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
