import java.util.*;

public class MeetingRooms {
    public static void main(String[] args) {
        System.out.println("테스트");    
        int[][] arr = {{7,10}, {2,4}, {11,18}, {19,20}};
        System.out.println(solution(arr));
    }

    public static boolean solution(int[][] arr){
        boolean answer = true;
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] entry1, int[] entry2){
                return Integer.compare(entry1[0],entry2[0]);
            }
        });

        for(int i=0; i<arr.length; i++){
            //int end = arr[i][1];
            //int start = arr[i][0];
            //System.out.println(start+" "+end);
            // 0, 1, 2
            if(arr.length - 1 == i) return true;

            if(arr[i][1] > arr[i+1][0])
                return false;
        }
        return answer;
    }
}