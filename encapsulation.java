class Person 
{
	private String fname;
	private String lname;
	private int id;
	
	public Person(String fname,String lname,int id)
	{
		this.fname=fname;
		this.lname=lname;
		this.id=id;
	}
	
	public void setDetails(String fn,String ln,int id)
	{
		this.fname=fn;
		this.lname=ln;
		this.id=id;
	}
	
	public String getDetails() {
        return "First Name: " + fname + ", Last Name: " + lname + ", ID: " + id;
    }
}



public class encapsulation {

	public static void main(String[] args) 
	{
		 Person person = new Person("Keerthana", "K J", 240014);

	    
	        System.out.println(person.getDetails());

	       
	        person.setDetails("Kirana", "K J", 67890);

	       
	        System.out.println(person.getDetails());

	}

} 