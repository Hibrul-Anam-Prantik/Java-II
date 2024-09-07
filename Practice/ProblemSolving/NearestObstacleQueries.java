package Practice.ProblemSolving;
import java.util.*;
public class NearestObstacleQueries {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[][] a = {{1,2}, {3,4}, {2,3}, {3,0}};
        int k = 2;
        int[] results = s1.resultsArray(a, k);
        
        for(int i = 0; i < results.length; i++) 
        {
            System.out.println(results[i] + " ");
        }
    }
}

class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        int[] results = new int[queries.length];
        int[] distances = new int[queries.length];
        int count = 0;
        for(int i = 0; i < queries.length; i++) 
        {
            int distance = Math.abs(queries[i][0]) + Math.abs(queries[i][1]);

            distances[count] = distance;  
            count++;
            
            Arrays.sort(distances, 0, count);
            if(count < k) {
                results[i] = -1;
            } else {
                results[i] = distances[k - 1];
            }
        }
        return results;
    }
}
