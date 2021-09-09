package hackathon_project;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class StudyGroup 
{

	private int id;      // unique StudyGroup id
	private String name; // StudyGroup name
	
	private ArrayList<Student> students = new ArrayList<Student>(); // List of Students in StudyGroup
	private ArrayList<Meeting> meetings = new ArrayList<Meeting>(); // List of meetings in StudyGroup

	public void addStudent(Student student)
	{
		students.add(student);
	}
	
	public void addMeeting(LocalDateTime time, int room)
	{
		meetings.add(new Meeting(time, room));
	}
}
