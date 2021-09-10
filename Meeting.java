package safeStudy;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Meeting class for managing meetings of study groups
 * Authors - Julia Swietochowska, Euan Campbell
 */
public class Meeting {
	private LocalDate date;
	private LocalTime time;
	private int room;
	
	/**
	 * Creates a Meeting object
	 * @param date	date of the meeting
	 * @param time	time of the meeting
	 * @param room	room for the meeting
	 */
	public Meeting(LocalDate date, LocalTime time, int room){
		this.date = date;
		this.time = time;
		this.room = room;
	}

	@Override
	public String toString() {
		return "Meeting [date=" + date + ", time=" + time + ", room=" + room + "]";
	}
}
