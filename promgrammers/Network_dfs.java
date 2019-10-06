public class Network_dfs {
    
    static int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
    static int n, m;
    public static void main(String[] args){
        int[][] grid = {{1,1,0},{1,1,1},{0,1,1}}; // 2
        int answer = solution(3,grid);
        System.out.println(answer);
    }

    public static int solution(int x, int[][] computers){
        int answer = 0;
        boolean[] chk = new boolean[x];

        for(int i=0; i<computers.length; i++){
            if(!chk[i]){
                dfs(computers, chk, i);
                answer++;
            }
        }

        return answer;
    }

    public static void dfs(int[][] grid, boolean[] chk, int i){
        //if (i < 0 || i >= m || !chk[i]) return;
        chk[i] = true;
        
        for(int j=0; j<grid.length; j++){
            if(grid[i][j] == 1 && !chk[j]){ 
                dfs(grid, chk, j);
            }
        }
    }
}