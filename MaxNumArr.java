package com.developercorners;

// Find Max Values in Array

public class MaxNumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {4,2,7,1,9};
		
		int len =arr.length;
		
		int max = 0;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[j]>arr[i])
				{
					max = arr[j];
				}
			}
		}
		
		System.out.println("Max Number = "+ max);
	}

}
