import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class JewelsAndStones {
    public static void main(String[] args){
        int answer = solution("aAce", "aAAbbbbAACCDDEEbaAwce");
        System.out.println(answer);
    }

    public static int solution(String jewels, String stones){
        int answer = 0;
        HashMap<String,Integer> map = new HashMap<>();
        String[] stoneStr = stones.split("");
        String[] jewlsStr = jewels.split("");

        for(int i=0; i<stoneStr.length; i++){
            if(map.containsKey(stoneStr[i])){
                map.put(stoneStr[i],map.get(stoneStr[i])+1);
            } else {
                map.put(stoneStr[i],1);
            }
        }
        int i = 0;
        for(String key : map.keySet()){
            if(i == jewlsStr.length) return answer;
            
            if(key.equals(jewlsStr[i])){
                answer += map.get(jewlsStr[i]);
                i++;
            }
        }  

        return answer;        
    }
}