public class IslandConnect {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Solution s = new Solution();
        int[][] routes = { { -20, -15 }, { -14, -5 }, { -18, -13 }, { -5, -3 } };

        int answer = solution(routes);
        System.out.println(answer);

    }

    public static int solution(int[][] routes) {
        int answer = 0;

        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
                // 두 번째 항목을 기준으로 오름차순 정렬
                // 첫 번째 항목으로 저장하려면 o1[0]과 o2[0]을 비교해 주면 된다.
            }
        });

        int cameraPos = -30001;
        for (int i = 0; i < routes.length; i++) {
            if (cameraPos < routes[i][0]) {
                answer++;
                cameraPos = routes[i][1];
            }
        }
        return answer;
    }
}