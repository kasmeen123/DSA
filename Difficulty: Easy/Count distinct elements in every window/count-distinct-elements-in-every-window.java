//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here 
        // ArrayList <Integer> list = new ArrayList <> ();
        // for(int i = 0; i <= n-k; i++){
        //     HashSet <Integer> set = new HashSet <> ();
        //     for(int j = i; j < i+k; j++){
        //         set.add(A[j]);
        //     }
        //     list.add(set.size());
        // }
        // return list;
        
        ArrayList <Integer> list = new ArrayList <> ();
        HashMap <Integer, Integer> map = new HashMap <> ();
        for(int i = 0; i < k; i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1);
            }
            else{
                map.put(A[i], 1);
            }
        }
        list.add(map.size());
        for(int j = 1; j <= n-k; j++){
            int removeElem = A[j-1];
            int addElem = A[j+k-1];
            int cnt = map.get(removeElem);
            if(cnt > 1){
                map.put(removeElem, cnt-1);
            }
            else{
                map.remove(removeElem);
            }
            map.put(addElem, map.getOrDefault(addElem, 0)+1);
            list.add(map.size());
        }
        return list;
    }
}

