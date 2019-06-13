package project_23rd;
class Vehicle
{
	void func()
	{
		System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
			
	}
}
class Motorcycle extends Vehicle
{
	
	void func()
	{
		System.out.println("	Hello I am a motorcycle, I am a cycle with an engine.");
		super.func();
	}
}
public class Override 
{
     public static void main(String args[])
     {
    	 Motorcycle  obj1=new Motorcycle();
    	  obj1.func();
     }
}
