class driver
{
	public static void main(String[] args)
	{
		
		Lecturer l = new Lecturer("Hussein", "Suleman", "hussein@cs.uca.ac.za", "1970-05-05");
		Degree d = new Degree("Bachelor of Science", 4, l);
		Degree d1 = new Degree("Engineering", 5, l);
		Course c = new Course("Computer Science", 6, d);
		Course c1 = new Course("Computer Engineering", 6, d);
		//System.out.println(c.CourseNAme());
		d.addCourses(c);
		d.addCourses(c1);
		//Degree ds[] = {d};
		for (Course deg : d.course()){
			System.out.println(deg.CourseNAme());
		}
		l.addDegree(d);
		l.addDegree(d1);
		for (Degree deg : l.getDegree()){
			System.out.println(deg.lecturer());
		}
		Student s = new Student("Xola", "Manciya", "Xolamanciya@gmail.com", "1998/06/06",d);
		System.out.println(s.toString());
	}

}
