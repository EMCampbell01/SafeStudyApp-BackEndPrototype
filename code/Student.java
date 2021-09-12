package safeStudy;

import java.util.ArrayList;

/** 
 * Student class for managing students using the app
 * Authors - Julia Swietochowska, Euan Campbell
 */
public class Student{

	// Student Info
	private String firstName; 
	private String lastName;
	private int matric;
	
	// List of StudyGroups the student is in
	private ArrayList<StudyGroup> groups = new ArrayList<>();

	/**
	 * Creates a student object
	 * @param fName	Student's first name
	 * @param lName	Student's last name
	 * @param mat	Student's matriculation number
	 */
	public Student(String fName, String lName, int mat){
		this.firstName = fName;
		this.lastName = lName;
		this.matric = mat;
	}
		
	/** 
	 * Returns the list of study groups the student is in
	 * @return	an ArrayList of StudyGroup objects
	 */
	public ArrayList<StudyGroup> getGroups(){
		return groups;
	}
		
	/**
	 * Adds a study group to the student's list
	 * @param group	Study group object to be added to student's group list
	 */
	public void addGroup(StudyGroup group){
		groups.add(group);
	}

	@Override
	public String toString() {
		return "\nStudent " + firstName + " " + lastName + " matric:" + matric;
	}
}
