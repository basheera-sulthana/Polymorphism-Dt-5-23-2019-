package project_23rd;
class Sports{
    String getName()
    {
        return "Generic Sports";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports
{
   
    String getName(){
        return "Soccer Class";
    }
}

public class OverrideSports 
{
	 public static void main(String args[])
     {
		 Sports  a1=new Sports();
		 System.out.println(a1.getName());
		 a1.getNumberOfTeamMembers();
         Sports b1=new Soccer();
         System.out.println(b1.getName());
         b1.getNumberOfTeamMembers();
		 
     }
}
