//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*Complete the function below*/
// class GfG {
//     public Stack<Integer> sort(Stack<Integer> s) {
//         // add code here.
//         int n = s.size();
//         int [] arr = new int [n];
//         int i = 0;
//             while (!s.isEmpty()){
//                 arr[i] = s.peek();
//                 s.pop();
//                 i++;
//             }
        
//         Arrays.sort(arr);
//         Stack <Integer> ans = new Stack <> ();
//         for(int j = n-1; j >= 0; j--) {
//             ans.push(arr[j]);
//         }
//         return ans;
//     }
// }


class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        int n = s.size();
        int[] arr = new int[n];
        int i = 0;

        // Transfer elements from stack to array
        while (!s.isEmpty()) {
            arr[i++] = s.pop();
        }

        // Sort the array in descending order
        Arrays.sort(arr);
        Stack<Integer> sortedStack = new Stack<>();

        // Push elements back to the stack in descending order
        for (int j = 0; j < n; j++) {
            sortedStack.push(arr[j]);
        }

        return sortedStack;
    }
}

