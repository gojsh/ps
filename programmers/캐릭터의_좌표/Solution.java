package ps.programmers.캐릭터의_좌표;

import java.util.Scanner;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for (String s : keyinput) {
            switch (s) {
                case "left" -> { answer[0]--;
                    if (Math.abs(answer[0]) > Math.abs(board[0] / 2)) answer[0]++;
                }
                case "right" -> { answer[0]++;
                    if (Math.abs(answer[0]) > Math.abs(board[0] / 2)) answer[0]--;
                }
                case "up" -> { answer[1]++;
                    if (Math.abs(answer[1]) > Math.abs(board[1] / 2)) answer[1]--;
                }
                default -> { answer[1]--;
                    if (Math.abs(answer[1]) > Math.abs(board[1] / 2)) answer[1]++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String[] keyinput = new String[kb.nextInt()];
        int[] board = new int[kb.nextInt()];

        for (int i = 0; i < keyinput.length; i++) {
            keyinput[i] = kb.next();
        }

        for (int i = 0; i < board.length; i++) {
            board[i] = kb.nextInt();
        }

        for (int i : s.solution(keyinput, board)) System.out.println(i);
    }
}