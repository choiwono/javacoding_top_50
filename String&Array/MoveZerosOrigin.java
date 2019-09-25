public class MoveZerosOrigin {
    public static void main(String[] args) {
        // 배열 num을 감안할 때 0이 아닌 요소의 상대적인 순서를 유지하면서 모든 0을 끝으로 이동시키는 함수를 작성하십시오..
        int[] numbers = { 0, 3, 2, 0, 8, 5 };
        solution(numbers);
    }

    public static void solution(int[] numbers){
        int currentIndex = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] != 0) {
                numbers[currentIndex] = numbers[i];
                currentIndex++;
            }
        }

        while(currentIndex < numbers.length) {
            numbers[currentIndex] = 0;
            currentIndex++;
        }

        for(int i = 0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}