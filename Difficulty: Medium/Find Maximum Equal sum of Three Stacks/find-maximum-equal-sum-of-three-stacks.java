//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 3);
            
            
            int[] S1 = IntArray.input(br, a[0]);
            
            
            int[] S2 = IntArray.input(br, a[1]);
            
            
            int[] S3 = IntArray.input(br, a[2]);
            
            Solution obj = new Solution();
            int res = obj.maxEqualSum(a[0],a[1],a[2], S1, S2, S3);
            
            out.println(res);
            
        }
        out.close();
    }
}

// } Driver Code Ends

 
class Solution {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        // code here
        Stack <Integer> st1 = new Stack <> ();
        Stack <Integer> st2 = new Stack <> ();
        Stack <Integer> st3 = new Stack <> ();
        
        int sum1 = 0;
        for(int i = N1-1; i >= 0; i--){
            sum1 += S1[i];
            st1.push(S1[i]);
        }
        
        int sum2 = 0;
        for(int i = N2-1; i >= 0; i--){
            sum2 += S2[i];
            st2.push(S2[i]);
        }
        
        int sum3 = 0;
        for(int i = N3-1; i >= 0; i--){
            sum3 += S3[i];
            st3.push(S3[i]);
        }
        
        // while(!(sum1 == sum2 && sum2 == sum3)){
        //     if(sum1 > sum2 && sum1 > sum3){
        //         if (st1.isEmpty()) return 0;
        //         sum1 -= st1.pop();
        //     }
        //     else if(sum2 > sum1 && sum2 > sum3){
        //         if (st2.isEmpty()) return 0;
        //         sum2 -= st2.pop();
        //     }
        //     else if(sum3 > sum1 && sum3 > sum2){
        //         if (st3.isEmpty()) return 0;
        //         sum3 -= st3.pop();
        //     }
        // }
        
         while (!(sum1 == sum2 && sum2 == sum3)) {
            if (sum1 >= sum2 && sum1 >= sum3) {
                if (st1.isEmpty()) return 0; // If the stack is empty, return 0
                sum1 -= st1.pop();
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                if (st2.isEmpty()) return 0; // If the stack is empty, return 0
                sum2 -= st2.pop();
            } else if (sum3 >= sum1 && sum3 >= sum2) {
                if (st3.isEmpty()) return 0; // If the stack is empty, return 0
                sum3 -= st3.pop();
            }
        }
        
        return sum1;
    }
}
        
