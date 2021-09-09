package hackathon_project;
import java.util.ArrayList;

public class StudyGroupSystem 
{

	ArrayList<StudyGroup> study_groups = new ArrayList<StudyGroup>();
	int[] students_matrics;
	
	
	public static void main(String[] args) 
	{
		// Students for testing
		Student s1 = new Student("Phoebe", "Buffay", 1);
		Student s2 = new Student("Monica", "Geller", 2);
		Student s3 = new Student("Joey", "Tribbiani", 3);
		Student s4 = new Student("Ross", "Geller", 4);
		Student s5 = new Student("Rachel", "Green", 5);
		Student s6 = new Student("Chandler", "Bing", 6);
		Student s7 = new Student("Elliot", "Alderson", 7);
		Student s8 = new Student("Josh", "Smith", 8);
		Student s9 = new Student("David", "Black", 9);
		Student s10 = new Student("Wendy", "Brick", 10);
		Student s11 = new Student("Pierre", "DuPont", 11);
		Student s12 = new Student("Alice", "Mustard", 12);
		Student s13 = new Student("Sally", "Gobbler", 13);
		Student s14 = new Student("Sam", "Costner", 14);
		Student s15 = new Student("Kevin", "Trolley", 15);
		Student s16 = new Student("Marcia", "Spencer", 16);
		
		// Groups for testing
		StudyGroup g1 = new StudyGroup(123, "Maths");
		StudyGroup g2 = new StudyGroup(456, "FSDD");
		StudyGroup g3 = new StudyGroup(789, "Computer Systems");
		StudyGroup g4 = new StudyGroup(101, "ISO");
		
		g1.addStudent(s1);
		g1.addStudent(s2);
		g1.addStudent(s3);
		g1.addStudent(s4);
		
		g2.addStudent(s5);
		g2.addStudent(s6);
		g2.addStudent(s7);
		g2.addStudent(s8);
		
		g3.addStudent(s9);
		g3.addStudent(s10);
		g3.addStudent(s11);
		g3.addStudent(s12);
		
		g4.addStudent(s13);
		g4.addStudent(s14);
		g4.addStudent(s15);
		g4.addStudent(s16);
		
		
		
		
		
		
			
	}
	
	public ArrayList<Student> getContacts(Student infected)
	{
		
	}

}
