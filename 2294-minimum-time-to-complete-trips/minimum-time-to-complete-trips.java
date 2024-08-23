class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        // Initialize the search range
        long low = findMinTime(time);
        long high = findMaxTime(time, totalTrips);
        
        // Binary search to find the minimum time required
        while (low < high) {
            long mid = (low + high) / 2;
            if (tripsCompletedByTime(time, mid) >= totalTrips) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
    
    // Helper method to calculate the total number of trips completed in T time units
    private long tripsCompletedByTime(int[] time, long T) {
        long totalTrips = 0;
        for (int t : time) {
            totalTrips += T / t;
        }
        return totalTrips;
    }

    // Helper method to find the minimum time based on the shortest bus trip time
    private long findMinTime(int[] time) {
        long minTime = Long.MAX_VALUE;
        for (int t : time) {
            minTime = Math.min(minTime, (long) t);
        }
        return minTime;
    }

    // Helper method to find the maximum time based on the longest bus trip time
    private long findMaxTime(int[] time, int totalTrips) {
        long maxTime = 0;
        for (int t : time) {
            maxTime = Math.max(maxTime, (long) t * totalTrips);
        }
        return maxTime;
    }
}
