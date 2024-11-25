//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;

    Job(int x, int y, int z) {
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

class GfG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // testcases
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");

            // size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");

            // adding id, deadline, profit
            for (int i = 0, k = 0; i < n; i++) {
                arr[i] = new Job(Integer.parseInt(inputLine[k++]),
                                 Integer.parseInt(inputLine[k++]),
                                 Integer.parseInt(inputLine[k++]));
            }

            Solution ob = new Solution();

            // function call
            ArrayList<Integer> res = ob.JobScheduling(arr, n);
            System.out.println(res.get(0) + " " + res.get(1));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}
*/

// class Job {
//     int id, deadline, profit;
//         Job(int id, int deadline, int profit) {
//             this.id = id;
//             this.deadline = deadline;
//             this.profit = profit;
//     }
// }

class Solution {
    // Function to find the maximum profit and the number of jobs done.
    ArrayList<Integer> JobScheduling(Job jobs[], int n) {
        // Your code here
    
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        int maxDeadline = 0;
        for(Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }
        boolean [] slots = new boolean [maxDeadline+1]; 
        Arrays.fill(slots, false);
        
        int cnt = 0;
        int maxProfit = 0;
        
        for(Job job : jobs) {
            
            for(int j = Math.min(maxDeadline, job.deadline); j > 0; j--) {
                if(!slots[j]) {
                    slots[j] = true;
                    cnt++;
                    maxProfit += job.profit;
                    break; 
                }
            }
        }  
            ArrayList <Integer> ans = new ArrayList <> ();
          
                ans.add(cnt);
                ans.add(maxProfit);

            return ans;
    
   }
}
