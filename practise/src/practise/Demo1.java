package practise;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int[] states = new int[]{1,0,0};
		int[] distances = new int[]{1,5,6};
		

		int total = 0;
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		for(int i =0;i<n;i++)
		{
			if(states[i]==0)
			{
				if(i>0)
					a = distances[i]-distances[i-1];
				if(i+1<n)
					b = distances[i+1]-distances[i];
				total+=Math.min(a,b);
			}
		}
		if(states[2]==0)
			total+=distances[1]-distances[0];
			
		System.out.println(total);
	}

}
