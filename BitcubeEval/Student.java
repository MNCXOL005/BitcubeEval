
interface Students
{
	String getFullName();
	String getEmail();
	String getDegree();
}
class Student extends Person implements Students
{
	// instance variables
	Degree degree;    //degree
	private String fullName ;    // full name
	public Student (String forename, String surname, String email, String DateOfBirth, Degree degree){
		
		super(forename, surname, email, DateOfBirth);
		this.degree = degree;
		
	}
	public String getFullName()
	{
		return super.forename+" "+super.surname;
	}
	public String getEmail()
	{
		return super.email;
	}
	public String getDegree()
	{
		return degree.DegreeName();
	}
	public String toString(){
		return getFullName() +"\n"+getDegree()+"\n"+getEmail();
	}
	
}
