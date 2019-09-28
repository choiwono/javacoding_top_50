import java.util.*;

public class solution02 {
    public static void main(String[] args) {
        //solution();
        String[] bishops = {"D5","E8","G2"};
        int answer = solution(bishops);
        System.out.println(answer);
    }

    public static int solution(String[] bishops) {
        int answer = 0;
        int[][] chessboard = new int[8][8];
        String eng = "ABCDEFGH";
        String num = "87654321";

        for(int i=0; i<bishops.length; i++){
            String[] bishop = bishops[i].split("");
            for(int j=0; j<2; j++){
                int str = eng.indexOf(bishop[0]);
                int str2 = num.indexOf(bishop[1]);
                // 체스말을 먼저 배치하자..
                chessboard[str2][str] = 2;
            }
        }

        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                // 체스말로 위치를 탐색해보자..
                if(chessboard[i][j] == 2){
                    for(int x=0; x<8; x++){
                        // 대각선 왼쪽위로 이동..
                        // 상하좌우로 움직일수 있는 사이즈를 구해야한다..
                        // 대각선위부터..
                        if(chessboard[i-1][j-1] != 2){
                            chessboard[i-1][j-1] = 1;
                        }
                        if (chessboard[i + 1][j - 1] != 2) {
                            chessboard[i + 1][j - 1] = 1;
                        }
                        if (chessboard[i - 1][j + 1] != 2) {
                            chessboard[i - 1][j + 1] = 1;
                        }
                        if (chessboard[i + 1][j + 1] != 2) {
                            chessboard[i + 1][j + 1] = 1;
                        }
                    }
                }
            }
        }


        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(chessboard[i][j] == 0){
                    answer++;
                }
            }
        }

        return answer;
    }

}