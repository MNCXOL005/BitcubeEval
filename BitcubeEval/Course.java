
import java.util.*;

class Course
{
	// instance variables
	private String coursename;    // name of the course
	private int duration;         // duration in months
	Degree degree;                //degree assosiated with the course.
		
	public Course(String coursename, int duration, Degree degree)
	{
		this.coursename = coursename;
		this.duration = duration;
		this.degree = degree;
		
	}
	public String CourseNAme()
	{
		return coursename;
	}
	public int Duration()
	{
		return duration;
	}
	public String ofDegree()
	{
		return degree.DegreeName();
	}
	
}
