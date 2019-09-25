public class MoveZeros {
    public static void main(String[] args) {
        // 배열 num을 감안할 때 0이 아닌 요소의 상대적인 순서를 유지하면서 모든 0을 끝으로 이동시키는 함수를 작성하십시오..
        int[] numbers = {0,1,0,3,12};
        solution(numbers);
    }

    public static int[] solution(int[] numbers){
        // 0 1 0 3 12
        // 인덱스 값을 기억할까..
        int[] result = new int[numbers.length];
        int n = 0;
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] != 0){
                result[n] = numbers[i];
                n++;
                //System.out.println(numbers[i]);
            }
        }
        
        for(int i=0; i<result.length; i++)
            System.out.println(result[i]);

        return result;
    }
}