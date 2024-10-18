//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> primes  = ob.sieveOfEratosthenes(N);
            for(int prime : primes) {
                System.out.print(prime+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        ArrayList <Integer> ans = new ArrayList <> ();
        for(int i = 2; i <= N; i++) {
            if(isPrime(i)) ans.add(i);
        }
       return ans;
    }
     static boolean isPrime(int n) {
            for(int i = 2; i*i <= n; i++) {
                if(n % i == 0) return false;
            }
            return true;
        }
}