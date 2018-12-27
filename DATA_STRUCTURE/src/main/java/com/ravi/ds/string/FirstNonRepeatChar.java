package com.ravi.ds.string;

class FirstNonRepeatChar
{
	public static void main(String args[])
	{
		firstnonrepaetchar("AASSEETfggA");
	}

	static void firstnonrepaetchar(String str)
	{   // if the input string is null then return the string
		if(str == null){
			System.out.println("input is null");
			return;			
		}
		int arr[]=new int[256];
		for(int i=0;i<str.length();i++)
		{
			int ind=str.charAt(i);  
			arr[ind]++;
		}
		// now we traverse from left to right if any char value is one in the arr
		for(int i=0;i<str.length();i++)
		{
			int ind=str.charAt(i);
			if(arr[ind]==1)
			{
		//		System.out.println("FirstNonRepaetChar is "+(char)ind);
				System.out.println("FirstNonRepaetChar is "+str.charAt(i));
				
				System.exit(0);
			}
		}

		System.out.println("all char are duplicate");
	}
}