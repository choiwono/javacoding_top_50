import java.util.*;

class Interval{
    int start;
    int end;

    Interval(){
        this.start = 0;
        this.end = 0;
    }

    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

public class MeetingRoomsOrigin {
    public static void main(String[] args) {
        System.out.println("테스트");
        Interval in1 = new Interval(0,30);
        Interval in2 = new Interval(5,10);
        Interval in3 = new Interval(15,20);
        
        Interval[] intervals = {in1,in2,in3};

        System.out.println(solution(intervals));
    }

    public static boolean solution(Interval[] intervals) {
        if(intervals == null) return false;

        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval a, Interval b) {
                return Integer.compare(a.start,b.start);
            }
        });

        for (int i = 1; i < intervals.length; i++) {
           if(intervals[i - 1].end > intervals[i].start)
                return false; 
        }
        return true;
    }
}