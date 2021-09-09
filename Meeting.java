package hackathon_project;
import java.time.LocalDateTime;

public class Meeting 
{

	LocalDateTime local_time;
	int local_room;
	
	public Meeting(LocalDateTime time, int room)
	{
		local_time = time;
		local_room = room;
	}

}
