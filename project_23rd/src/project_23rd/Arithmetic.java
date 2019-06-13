package project_23rd;
class Arth
{
	
	int add(int a,int b)
	{
		return a+b;
	}
}
class Adder extends Arth
{
	 //System.out.println(c);

}
public class Arithmetic
{
	 public static void main(String args[])
     {
		 Arth a=new Adder();
		 int c=a.add(2,3);
		 System.out.println(c);
     }
}
