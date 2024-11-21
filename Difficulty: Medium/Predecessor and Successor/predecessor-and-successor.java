//{ Driver Code Starts

// Initial Template for Java
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Gfg {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static void printInorder(Node root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            int k = Integer.parseInt(br.readLine());
            Node[] pre = new Node[1];
            Node[] suc = new Node[1];
            Solution.findPreSuc(root, pre, suc, k);
            if (pre[0] != null) {
                System.out.print(pre[0].data + " ");
            } else {
                System.out.print("-1 ");
            }
            if (suc[0] != null) {
                System.out.println(suc[0].data);
            } else {
                System.out.println("-1 ");
            }
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        pre[0] = null; // Initialize predecessor
        suc[0] = null; // Initialize successor
        
        while (root != null) {
            if (root.data == key) {
                // Find predecessor: Max in left subtree
                if (root.left != null) {
                    Node temp = root.left;
                    while (temp.right != null) {
                        temp = temp.right;
                    }
                    pre[0] = temp;
                }
                
                // Find successor: Min in right subtree
                if (root.right != null) {
                    Node temp = root.right;
                    while (temp.left != null) {
                        temp = temp.left;
                    }
                    suc[0] = temp;
                }
                return;
            } else if (key < root.data) {
                suc[0] = root; // Update successor
                root = root.left;
            } else {
                pre[0] = root; // Update predecessor
                root = root.right;
            }
        }
    }
}
