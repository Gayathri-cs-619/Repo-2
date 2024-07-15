package assignments;

import java.util.Arrays;

public class StringReverse {
	String reversedstring;
	
	StringReverse(String a)
	{
		//first method=didnt work. mine with both src and dest as arrays.
		char b[]=a.toCharArray();
		
		//second method-works
		/*char b[]=a.toCharArray();
		String r="";
		int l=a.length();
		
		for(int i=l-1;i<=0;i++)
		{
			r+=b[i];//1.r=e 2.r=ee 3.r=eer
			
		}
		
		System.out.println("Original String is: "+a+" Reversed String is: "+r);*/
		
		/*String r="";
		int l=a.length();
		for(int i=0;i<l;i++)
		{
			r = a.charAt(i) + r;//1.r=T,2.r=rT
			
		}
		System.out.println("Original String is: "+a+" Reversed String is: "+r);
		*/
		
	}

	public static void main(String[] args) {
		StringReverse obj=new StringReverse("Tree");
		

	}

}
