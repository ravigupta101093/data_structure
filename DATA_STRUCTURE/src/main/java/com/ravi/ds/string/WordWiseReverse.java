package com.ravi.ds.string;

public class WordWiseReverse {

	public static void main(String[] args) {
		 

    String str = "this is an java test";
    //            i=0           j=n-1
    String strArr[] = str.split(" "); 	
    
    for (int i = 0,j=strArr.length-1; i<j; i++,j--) {
		 
	  String temp = strArr[i];
	  strArr[i] = strArr[j];
	  strArr[j] = temp;
    	
    }
    
     System.out.println("after reversing \n");
     
     for (int i = 0;i<strArr.length ; i++) {
		 
   	  System.out.println(strArr[i]);
       }
     
		
	}

}
