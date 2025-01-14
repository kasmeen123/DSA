//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import ArrayList
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // Get the result as an ArrayList<Integer>
            ArrayList<Integer> ans = new Solution().findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

 class Solution {

    ArrayList<Integer> findTwoElement(int arr[]) {

        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSumOfSquares = (long) n * (n + 1) * (2 * n + 1) / 6;

        // Calculate the actual sum and sum of squares from the array
        long actualSum = 0;
        long actualSumOfSquares = 0;

        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
            actualSumOfSquares += (long) arr[i] * arr[i];
        }

        // Calculate the differences
        long sumDifference = expectedSum - actualSum; // missing - repeating
        long squareSumDifference = expectedSumOfSquares - actualSumOfSquares; // missing^2 - repeating^2

        // Solve for missing and repeating using the equations
        long sumPlusDifference = squareSumDifference / sumDifference; // missing + repeating

        int missing = (int) (sumDifference + sumPlusDifference) / 2;
        int repeating = (int) (sumPlusDifference - missing);

        // Add the results to the ArrayList
        result.add(repeating);
        result.add(missing);

        return result;
    }
}
