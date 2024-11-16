//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.checkRedundancy(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int checkRedundancy(String s) {
        // code here
        
        Stack <Character> st = new Stack <> ();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '+' || c == '-' || c == '*' || c == '/') {
               st.push(c);
            }
            else {
                if(c == ')') {
                    char top = st.peek();
                if(top == '(') {
                    return 1;
                }
                else{
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
                
                }
            }
        }
        return 0;
    }
}
        
