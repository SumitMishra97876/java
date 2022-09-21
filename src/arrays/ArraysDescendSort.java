package arrays;

import java.util.Arrays;

public class ArraysDescendSort {

	public static void main(String[] args) {
		
		
		int arr[]= {3,8,9,8,0,15,89};
		disp(arr);
	}
	
	
	public static void disp(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");  
        }  
	}
	
	
	public static void disp1(int arr[])
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");  
        }  
	}

}
