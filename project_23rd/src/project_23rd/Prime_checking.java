package project_23rd;
import java.util.Scanner;
public class Prime_checking {

public static void main(String[] args) {
// TODO Auto-generated method stub
 int arr[]=new int[5];
     int n,i,j,k,l,count,count1;
     @SuppressWarnings("resource")
     Scanner sc=new Scanner(System.in);
     System.out.println("enter 5 numbers ");
     for(i=0;i<5;i++)
     {
     arr[i]=sc.nextInt();
     }
     for(k=0;k<5;k++)
     {
     n=arr[k];
     count=0;
     for(i=1;i<=n;i++)
     {
      if(n%i==0)
      {
      count++;
      }
     
     }
     if(count==2) {
     for(j=1;j<=n;j++)
    {
             
     count1=0;
       for(l=1;l<=j;l++)
       {
        if(j%l==0)
        {
        count1++;
        }
       
       }
       if(count1==2) {
        System.out.println(j+"prime");
       }
       
    }
     
     }
   
     else {
      System.out.println();
     }
}
}}

	
	
	
