//{ Driver Code Starts
import java.util.*;


class First_Circular_tour
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			String arr[] = str.split(" ");
			int p[] = new int[n];
			int d[] = new int[n];
			int j=0;
			int k=0;
			for(int i=0; i<2*n; i++)
			{
				if(i%2 == 0)
				{
					p[j]= Integer.parseInt(arr[i]);
					j++;
				}
				else
				{
					d[k] = Integer.parseInt(arr[i]);
					k++;
				}
			}
			
			System.out.println(new Solution().tour(p,d));
		t--;
		
System.out.println("~");
}
	}
}
// } Driver Code Ends


// In java function tour() takes two arguments array of petrol
// and array of distance

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	// Your code here
	
	   //   int n = petrol.length;
	   //         for(int i = 0; i < n; i++) {
	   //             int bal = 0;
	   //             boolean isPossible = true;
	   //             for(int j = 0; j < n; j++) {
	   //                 int index = (i+j) % n;
	   //                 bal += petrol[index] - distance[index];
	   //                 if (bal < 0) {
    //                 isPossible = false;
    //                 break;
    //             }
	   //             }
	   //             if (isPossible) {
    //             return i;
    //         }
	   //         }
	   //     return -1;
	   
	   int start = 0;
	   int reqFuel = 0;
	   int exFuel = 0;
	   for(int i = 0; i < petrol.length; i++) {
	       exFuel += petrol[i] - distance[i];
	       if(exFuel < 0) {
	           start = i+1;
	           reqFuel += exFuel;
	           exFuel = 0;
	       }
	   }
	   if(reqFuel + exFuel >= 0) return start;
	   return -1;
    }
}