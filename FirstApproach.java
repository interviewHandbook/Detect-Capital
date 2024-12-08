package com.interviewprep.leetcode.easy.detectcapital;

public class FirstApproach {

	public static void main(String[] args) {
		
		FirstApproach fa =  new FirstApproach();
		Boolean isCapital = fa.detectCapitalUse("GooglE");
		
		System.out.println(isCapital);
	}

	 public boolean detectCapitalUse(String word) {
	        
		 Boolean isCapital = false;
		 
		 // check if all chars are lowercase
		 if(word.equals(word.toLowerCase())) {
			 
			 return true;
		 }
		 
		 // check if all chars are uppercase
		 else if(word.equals(word.toUpperCase())) {
			 
			 return true;
		 }
		 
		 // check if first char is uppercase and rest are lowercase
		 if(Character.isUpperCase(word.charAt(0)))  {
			 
			 String str = word.substring(1, word.length());
			
			 if(str.equals(str.toLowerCase())) {
				 
				 return true;
			 }
		 }
		 
		 
		 return isCapital;
	    }
	
}
