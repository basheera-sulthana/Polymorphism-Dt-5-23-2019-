package project_23rd;
import java.util.*;
public class SubString 
{
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
	       Scanner in = new Scanner(System.in);
	       System.out.println("Enter String");
	      String S = in.nextLine();
	       int start = in.nextInt();
	       int end = in.nextInt();
	       
	       System.out.println(S.substring(start,end)+" "+start);
	   }


}



