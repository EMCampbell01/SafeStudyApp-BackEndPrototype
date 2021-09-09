package hackathon_project;

public class Student 
{

	// Student Info
	private String first_name; 
	private String last_name;
	private int matric;
	
	// List of group ID's of StudyGroups instance of student is in
	private int[] groups;
	
	// Student Covid-19 Info
	private boolean infected = false;
	private boolean exposed = false;

	public Student(String f_name, String l_name, int mat)
	{
		first_name = f_name;
		last_name  = l_name;
		matric     = mat;
	}
}
