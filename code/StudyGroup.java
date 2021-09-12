package safeStudy;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/** 
 * StudyGroup class for managing the study groups
 * Authors - Julia Swietochowska, Euan Campbell
 */
public class StudyGroup {
	private int id;     
	private String name; 
	private ArrayList<Student> students = new ArrayList<Student>(); // List of enrolled students
	private ArrayList<Meeting> meetings = new ArrayList<Meeting>(); // List of meetings in StudyGroup
	
	/**
	 * Creates a StudyGroup object
	 * @param identifier	unique id of the group
	 * @param group_name	name of the study group
	 */
	public StudyGroup(int identifier, String group_name){
		id = identifier;
		name = group_name;
	}
	
	/**
	 * Adds a new student to study group
	 * Simultaneously adds the study group to the student's group list
	 * @param student	student to be added
	 */
	public void addStudent(Student student){
		students.add(student);
		student.addGroup(this);	// add the study group to the student's own list as well (by id)
	}
	
	/**
	 * Adds a new meeting to study group
	 * @param date	date of the meeting
	 * @param time	time of the meeting
	 * @param room	room for the meeting
	 */
	public void addMeeting(LocalDate date, LocalTime time, int room){
		meetings.add(new Meeting(date, time, room));
	}
	
	/**
	 * Returns a list of meeting for this study group
	 * Will be used for timetabling 
	 * @return	an ArrayList of Meeting objects
	 */
	public ArrayList<Meeting> getMeetings() {
		return meetings;
	}
	
	/**
	 * Returns a list of students who are members of the group
	 * @return	an ArrayList of Student objects
	 */
	public ArrayList<Student> getStudents() {
		return students;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + "";
	}
}
