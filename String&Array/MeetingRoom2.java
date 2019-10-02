public class MeetingRoom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P[][] = new int[N][2]; // 몸무게, 키
        for (int i = 0; i < N; i++) {
            P[i][0] = sc.nextInt(); // 몸무게
            P[i][1] = sc.nextInt(); // 키
        }
        int[] ans = solution(N, P);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    /*public static int[] solution(int n, int[][] p) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (p[i][0] > p[j][0] && p[i][1] > p[j][1]) {
                    answer[j]++;
                }
            }
        }
        return answer;
    }*/
}