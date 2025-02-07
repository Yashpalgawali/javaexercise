package com.example.excercise.string;

public class ReverseWords {

	public static void main(String[] args) {
		
		 String s = " i like this program  very much ";
		 s = s.replaceAll("\\s+", " "); // this regular expression removes extra spaces and leaves string having one space between words
//		 String s = " i ";
		 s.stripTrailing();
		 s.stripLeading();
		 String[] arr = s.split("\\s+");
//		 String[] arr = s.split(" ");
//		  
// 
		 String newstr = "";
	 
		 for(int i=arr.length-1;i>=0;i--) {
			 newstr += " "+arr[i];
		 }
		 newstr = newstr.stripLeading();
		 newstr = newstr.stripTrailing();
		 System.err.println(newstr);
	}
}
