package com.ravi.string;

public class ASCII_TEST {

	public static void main(String[] args) {
		 
		
     String str = "ABYZ abyz #*!)";
     
     char[] charArr = str.toCharArray();
     
     // ASCII value integer representation of a char 
     
     for(int i =0;i<charArr.length;i++){
    	 
    	System.out.print(charArr[i]); 
    	int temp = charArr[i];
        System.out.println(" "+temp);
    	
    	
     }
     
		int a = 'A';
    System.out.println(a); 
		
		
	}

}
