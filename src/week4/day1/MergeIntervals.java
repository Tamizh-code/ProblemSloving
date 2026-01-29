package week4.day1;
import java.util.*;
public class MergeIntervals{
    public static void main(String[] args){
//        int [][] intervals={{1,4},{2,5},{3,6},{4,7},{10,14},{13,16}};
        int [][] intervals={{1,4},{2,5},{3,6},{7,10},{8,12}};
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            List<int[]> merged = new ArrayList<>();
            int[] prev = intervals[0];

            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] < prev[1]) {
                    prev[1] = Math.max(prev[1], intervals[i][1]);
                } else {
                    merged.add(prev);
                    prev = intervals[i];
                }
            }

            merged.add(prev);
            for(int[] i:merged){
                System.out.print(Arrays.toString(i));
            }
        }
    }
