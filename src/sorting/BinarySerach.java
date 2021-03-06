package sorting;

import java.util.Arrays;

public class BinarySerach {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,90,99,676,87,56,45,65};  
        int key = 87;  
        int last=arr.length-1;  
        search(arr,0,last,key);
	}
	
	public static void search(int[] arr,int first,int last,int key)
	{
		Arrays.sort(arr);
		int mid=(first+last)/2;
		
		while(first<=last)
		{
			if(arr[mid]<key)
			{
				first=mid+1;
			}
			else if(arr[mid]==key)
			{
				 System.out.println("Element is found at index: " + mid);  
				 break;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last)
		{
			System.out.println("Element is not found!");  
		}
	}

}
