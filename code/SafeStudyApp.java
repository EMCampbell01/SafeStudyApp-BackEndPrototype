package safeStudy;

import java.time.LocalTime;
import java.util.ArrayList;
import java.time.LocalDate;

/** 
 * Class for testing if SafeStudy app works as planned
 * Authors - Julia Swietochowska, Euan Campbell
 */
public class SafeStudyApp {

	public static void main(String[] args) {
		
		// Generate students for testing
		Student s1 = new Student("Phoebe", "Buffay", 123);
		Student s2 = new Student("Monica", "Geller", 234);
		Student s3 = new Student("Joey", "Tribbiani", 345);
		Student s4 = new Student("Ross", "Geller", 456);
		Student s5 = new Student("Rachel", "Green", 567);
		Student s6 = new Student("Chandler", "Bing", 678);
		Student s7 = new Student("Elliot", "Alderson", 789);
		Student s8 = new Student("Josh", "Smith", 891);
		Student s9 = new Student("David", "Black", 910);
		Student s10 = new Student("Wendy", "Brick", 101);
		Student s11 = new Student("Pierre", "DuPont", 112);
		Student s12 = new Student("Alice", "Mustard", 121);
		
		// Generate study groups for testing
		StudyGroup g1 = new StudyGroup(123, "Maths");
		StudyGroup g2 = new StudyGroup(456, "FSDD");
		StudyGroup g3 = new StudyGroup(789, "Computer Systems");

		// Add students to study groups
		g1.addStudent(s1); 
		g1.addStudent(s2);
		g1.addStudent(s3);
		g1.addStudent(s4);
		g1.addStudent(s5);

		g2.addStudent(s5);
		g2.addStudent(s6);
		g2.addStudent(s7);
		g2.addStudent(s8);
		g2.addStudent(s1); 

		g3.addStudent(s9);
		g3.addStudent(s10);
		g3.addStudent(s11);
		g3.addStudent(s12);
		
		// Test the app on a student who belongs to 2 groups
		System.out.println("Test for a student in 2 groups:");
		System.out.println(getCloseContacts(s1));
		
		// Test the app on a student who is in just 1 group
		System.out.println("\nTest for a student in 1 group:");
		System.out.println(getCloseContacts(s10));
		
		// Schedule a meeting for a study group
		g1.addMeeting(LocalDate.of(2021, 9, 9), LocalTime.of(21, 30), 3);
		System.out.println("\nGroup's meetings:" + g1.getMeetings());
	}
	
	/**
	 * Returns a list of students who have been in contact with the infected one
	 * @param infected	The infected Student
	 * @return	a list of all close contacts of the student 
	 */
	public static ArrayList<Student> getCloseContacts(Student infected){
		ArrayList<Student> closeContacts = new ArrayList<>();
		// get all groups that the infected student is in
		ArrayList<StudyGroup> infectedGroups = infected.getGroups();
		
		// get all students from all groups of the infected student
		for(int i = 0; i < infectedGroups.size(); i++) {
			closeContacts.addAll(infectedGroups.get(i).getStudents());
		}
		
		// remove the infected student from the close contact list 
		for(int i = 0; i < closeContacts.size(); i++) {
			if(closeContacts.get(i).equals(infected)) {
				closeContacts.remove(i);
			}
		}
		return closeContacts;
	}
}
