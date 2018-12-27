package com.ravi.string;

public class Testing {

	public static void main(String[] args) {
		 
		String[] s = {"aavi", "pravi" ,"mohan" ,"ram"};
		 for (int i = 0; i < s.length; i++) {
		        for (int j =0; j < s.length; j++) {
		        	if (s[i].charAt(0) < s[j].charAt(0)) {
		                String temp = s[i];
		                s[i] = s[j];
		                s[j] = temp;
		            }
		        }
		    } 
		    // print the sorted array
		    for(int i=0 ; i<s.length ;i++){
				System.out.print(s[i]+" ");
			}
		    
		 

	}

}
