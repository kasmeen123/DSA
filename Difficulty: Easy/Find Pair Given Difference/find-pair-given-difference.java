//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int x;
            x = Integer.parseInt(br.readLine());

            int[] arr = IntArray.input(br, n);

            Solution obj = new Solution();
            int res = obj.findPair(n, x, arr);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        //BRUTE FORCE
        // for(int i = 0; i < n; i++){
        //     for(int j = i+1; j < n; j++){
        //         if(Math.abs(arr[i]-arr[j]) == x ) return 1;
        //     }
        // }
        // return -1;
        
        //USNG HASHSET
        // HashSet <Integer> set = new HashSet <> ();
        // for(int i = 0; i < n; i++){
        //     set.add(arr[i]);
        // }
        // if(x == 0 && set.size() == n) return -1;
        // for(int i = 0; i < n; i++){
            
        //     if(set.contains(x+arr[i])) return 1;
        // }
        // return -1;
        
        //
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            if(binarySearch(arr, i+1, n-1, x+arr[i]) ||
            binarySearch(arr, i+1, n-1, -x+arr[i])) return 1;
        }
        return -1;
    }
    
    public boolean binarySearch(int [] arr, int low, int high, int target){
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target) return true;
            else if(arr[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return false;
    } 
}
