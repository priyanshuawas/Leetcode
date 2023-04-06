//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int [] A = new int[N];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < N; i++)
				A[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			System.out.println(ob.equalSum(A, N));
		}
    }
}
// } Driver Code Ends

//User function Template for Java
class Solution{
	int equalSum(int [] A, int N) {
	    
	    if(N == 1){
	        return 1;
	    }
	    if(N == 2){
	        return -1;
	    }
		int lsum = A[0];
		int rsum = 0;
		
		for(int i=2;i<N;i++){
		    rsum = rsum + A[i];
		}
		
		int count = 1;
		while(count != N-1){
		      if(lsum == rsum){
		          return count+1;
		      }
		      lsum = lsum + A[count];
		      rsum = rsum - A[count+1];
		      count++;
		}
		return -1;
	}
}