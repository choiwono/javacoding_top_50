import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] answer = solution(nums,13);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }

    public static int[] solution(int[] nums, int target){
        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target)
                    return new int[]{i+1,j+1};
            }
        }
        return arr;
    }

    public static int[] solution2(int[] nums, int target){
        int[] arr = new int[2];
        // 맵에 담자..
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int mapValue = map.get(nums[i]);
                arr[0] = mapValue + 1;
                arr[1] = i + 1;
            } else {
                map.put(target-nums[i], i);
            }
        }

        return arr;
    }
}