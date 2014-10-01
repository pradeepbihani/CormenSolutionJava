import java.util.*;

class Main{
    public static void main(String Args[])
    {
	char[] A = {1,2,3,4};
	String s  = "this is a string";
	String s1 = "THIS IS A STRING";
	String s2 = "aaaaa";
	
	s.charAt(1); //h

	s.compareTo(s1);  //32 

	s.compareToIgnoreCase(s1);  //0

	s.concat(s1);    //this is a stringTHIS IS A STRING
	
	s.contains("this");  //true
	
	s.contentEquals("this is a string"); //true
	s.equals("this is a string");
	s.equalsIgnoreCase("this is a string");
	s.endsWith("string");
	s.startsWith("this");
	
	String.copyValueOf(A); //1234
	
	//s.getChars(0,s.length()-1,A,0);   //ublic void getChars(int srcBegin,int srcEnd,char[] dst,int dstBegin)
	//lly for getBytes
	s.toCharArray();

	s.indexOf('s');      //3
	s.indexOf('s',4);      //6  
	s.indexOf("this");    //0
	
	s.lastIndexOf('s');  //lastIndexOf(int ch, int fromIndex)
	
	s2.matches("a*");
	/*
	replace(char oldChar, char newChar) Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
	
	String	replace(CharSequence target, CharSequence replacement)
	Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.

	String	replaceAll(String regex, String replacement)
	Replaces each substring of this string that matches the given regular expression with the given replacement.

	String	replaceFirst(String regex, String replacement)
	Replaces the first substring of this string that matches the given regular expression with the given replacement.

	String[]	split(String regex)
	Splits this string around matches of the given regular expression.

	String[]	split(String regex, int limit)
	Splits this string around matches of the given regular expression.
	*/
	
	s.subSequence(0,10);
	s.substring(0);

	s.toLowerCase();
	s.toUpperCase();
	s.trim();
	String.valueOf(1.232);
	
	System.out.println();
	
	
    }
}
