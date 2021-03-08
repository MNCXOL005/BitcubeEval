import java.util.*;

interface Degrees{
	String DegreeName();
	List<Course> course();
	Lecturer lecturer();
	float duration();
}
class Degree implements Degrees
{
	// instance variables
	private String degreeName;   // DEGREE name
	private float Duration;      // duration in years
	List<Course> courses;            // courses in the degree
	Lecturer lecturer;           // lecturer of the degree
	public Degree(String degreeName, float Duration, Lecturer lecturer)
	{
		this.degreeName = degreeName;
		this.Duration = Duration;
		this.courses =new ArrayList<Course>();
		this.lecturer = lecturer;
		
	}
	public void addCourses(Course c)
	{
		courses.add(c);
	}
	public String DegreeName()
	{
		return degreeName;
	}
	public List<Course> course()
	{
		return courses;
	}
	public Lecturer lecturer()
	{
		return lecturer;
	}
	public float duration()
	{
		return Duration;
	}
}
