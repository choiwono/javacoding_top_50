import java.util.*;

public class solution01 {
    public static void main(String[] args){
        int[] goods = {1,2};
        int[] boxes = {2,3,1};
        int answer = solution(goods,boxes);
        System.out.println(answer);
    }

    public static int solution(int[] goods, int[] boxes){
        int answer = 0;
        PriorityQueue<Integer> goodsQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());
        PriorityQueue<Integer> boxQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());

        for(int i=0; i<goods.length; i++) goodsQueue.add(goods[i]);
        for(int i=0; i<boxes.length; i++) boxQueue.add(boxes[i]);

        while(!goodsQueue.isEmpty()){
            int goodsTemp = goodsQueue.peek();
            int boxTemp = boxQueue.peek();
            if(goodsTemp > boxTemp){
                // 만약 제일 큰 goods가 박스사이즈에서 제일큰 값보다 클 경우..
                goodsQueue.poll();
            } else if(goodsTemp <= boxTemp){
                // goods 보다 크거나 딱 맞는 박스가 있을경우 양쪽다 빼자..
                goodsQueue.poll();
                boxQueue.poll();
                answer++;
            }
        }

        return answer;
    }
}