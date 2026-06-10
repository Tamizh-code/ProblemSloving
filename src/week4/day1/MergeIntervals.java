package week4.day1;
import java.util.*;
public class MergeIntervals{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String []s=sc.nextLine().replaceAll("[\\[\\] ]","").split(",");//[[1,2],[2,4],[3,5],[6,7],[8,9]]
        System.out.println(Arrays.toString(s));
        int[][] intervals=new int[s.length/2][2];
        int j=0;
        for(int i=1;i<s.length;i+=2) {
            intervals[j][0] = Integer.parseInt(s[i-1]);
            intervals[j++][1] = Integer.parseInt(s[i]);
        }
//        int [][] intervals={{1,4},{2,5},{3,6},{4,7},{10,14},{13,16}};
//        int [][] intervals={{1,4},{2,5},{3,6},{7,10},{8,12}};
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
