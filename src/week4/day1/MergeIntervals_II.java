package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals_II {
    public static void main(String[] args) {
//        int[][] intervals = {{1, 4}, {2, 5}, {3, 6}, {4, 7}, {10, 14}, {13, 16}};
        int[][] intervals = {{1, 4}, {10, 11}, {13, 16}};
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= prev[1]) {
//                prev[1] = Math.max(prev[1], intervals[i][1]);
                System.out.print(false);
                return;
            }
            else {
                prev = intervals[i];
            }
        }
        System.out.print(true);
    }
}
