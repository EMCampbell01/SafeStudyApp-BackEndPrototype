package hackathon_project;

public class Student 
{

	// Student Info
	String first_name; 
	String last_name;
	int matric;
	
	// List of group ID's of StudyGroups instance of student is in
	int[] groups;
	
	// Student Covid-19 Info
	boolean infected = false;
	boolean exposed = false;

	public Student(String f_name, String l_name, int mat)
	{
		first_name = f_name;
		last_name  = l_name;
		matric     = mat;
	}
}
