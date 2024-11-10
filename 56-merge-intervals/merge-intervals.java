import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]> output = new ArrayList<>();

        // Sort intervals by their start values
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Initialize start and end with the first interval values
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Iterate through each interval
        for (int[] pair : intervals) {
            // If the current interval overlaps with the previous, merge them
            if (pair[0] <= end) {
                end = Math.max(end, pair[1]);
            } else {
                // If they don't overlap, add the previous interval to output and reset start and end
                output.add(new int[]{start, end});
                start = pair[0];
                end = pair[1];
            }
        }
        // Add the last interval
        output.add(new int[]{start, end});

        // Convert output list to array
        return output.toArray(new int[output.size()][]);
    }
}
