//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int s = sc.nextInt();
            int d = sc.nextInt();

            Solution obj = new Solution();
            String res = obj.smallestNumber(s, d);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends

 

class Solution {
    public String smallestNumber(int s, int d) {
        // code here
        
        if (s > 9*d) return "-1";
        
        StringBuilder sb = new StringBuilder ();
        for(int i = d-1; i >= 0; i--) {
            if(s > 9) {
                sb.append(9);
                s -= 9;
            }
            else {
                if(i == 0) sb.append(s);
                else {
                    sb.append(s-1);
                    s = 1;
                }
                
            }
        }
        return sb.reverse().toString();
    }
}
