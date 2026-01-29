package week4.day2;

import java.util.Arrays;

public class MettingRoom_I {
    public static void main(String[] args) {
//        int[][] intervals = {{1, 4}, {2, 5}, {3, 6}, {4, 7}, {10, 14}, {13, 16}};
        int[][] intervals = {{1, 4},{4,5},{10, 11}, {13, 16}};
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int[] prev = intervals[0];
        int c=intervals.length;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prev[1]) {
                c--;
            }
            else {
                prev = intervals[i];
            }
        }
        System.out.print(c);
    }
}
