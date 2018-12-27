package com.ravi.ds.string;

public class Anagram {

	public static void main(String[] args) {

		boolean res = isanagram("ab++c","+acba"); 
		System.out.println("are these string anagram ?? "+res);
	}

	public static boolean isanagram(String s1,String s2)
	{
		if(s1==null && s2==null)
		{
			return true;
		}
		if(s1==null ||s2==null)
		{
			return false;
		}
		if(s1.length() != s2.length())
		{
			return false;
		}

  
		int[] arr=new int[256];

		for(int i=0;i<s1.length();i++)
		{

			int ind1 = s1.charAt(i);
			int ind2 = s2.charAt(i);

			
			
			arr[ind1]++ ;
			arr[ind2]--;

		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0){
				return false;
			}
		}
		
		
		return true;
	}

}