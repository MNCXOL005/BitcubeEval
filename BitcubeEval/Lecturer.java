
import java.util.*;
class Lecturer extends Person {
	
	// instance variables
	List<Degree> degrees;   // degrees 
	private String fullName ;    // full name
	
	public Lecturer(String forename, String surname, String email, String DateOfBirth)
	{
		super(forename, surname, email, DateOfBirth);
		this.degrees =new ArrayList<Degree>();
	}
	public void addDegree(Degree d){
		this.degrees.add(d);
	}
	public String getFullName()
	{
		return forename+" "+surname;
	}
	public String getEmail()
	{
		return super.email;
	}
	
	public List<Degree> getDegree()
	{
		return degrees;
	}
	public String toString(){
		return getFullName()+"\n"+getEmail();
	}

}
