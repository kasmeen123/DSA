//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 

        // using hashing
        // HashSet <Integer> set1 = new HashSet <> ();
        //  HashSet <Integer> set2 = new HashSet <> ();
        //  HashSet <Integer> set3 = new HashSet <> ();
        //  ArrayList <Integer> list = new ArrayList <> ();
        // for(int i = 0; i < n1; i++){
        //     set1.add(A[i]);
        // }
        // for(int i = 0; i < n2; i++){
        //     if(set1.contains(B[i])) set2.add(B[i]);
        // }
        // for(int i = 0; i < n3; i++){
        //     if(set2.contains(C[i])) set3.add(C[i]);
        // }
        // for(int num : set3){
        // list.add(num);
        // }
        // Collections.sort(list);
        // return list;
        
        ArrayList <Integer> list = new ArrayList <> ();
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < A.length && j < B.length && k < C.length){
            if(A[i] == B[j] && B[j] == C[k]){
                if (list.isEmpty() || A[i] != list.get(list.size() - 1)) {
                    list.add(A[i]);
}
                i++;
                j++;
                k++;
            }
            else if(A[i] < B[j]) i++;
            else if(B[j] < C[k]) j++;
            else k++;
        }
        return list;
    }
}