package com.developercorners;

public class MinArrayNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,3,7,2,9};
		
		int len = arr.length;
		
		int min = arr[0];
		
		for(int i=1;i<len;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("Minimun number = "+min);

	}

}
