package arrays;

import java.util.Arrays;

public class ShiftZeroesLeft1 {

	public static void main(String[] args) {
		int[] arr= {3,0,2,7,9,0,1,0,1,0,0,0,1};
		
		
		System.out.println(Arrays.toString(shiftLeft(arr)));
		
		
		

	}
	
	public static int[] shiftLeft(int[] arr)
	{
		int[] arr1=new int[arr.length];
		
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr1[count]=arr[i];
				count++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr1[count]=arr[i];
				count++;
			}
		}
		return arr1;
	}
 
	public static void disp(int[] arr)
	{
		
	}
}
