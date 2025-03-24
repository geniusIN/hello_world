package weeklyPlanner;
import java.util.*;

public class ScheduleItem {
	// 필드
	private String title;
	private String description;
	int id = 1;
	
	// 생성자
	public ScheduleItem(String title, String description) {
		this.id = id++;
		this.title = title;
		this.description = description;
	}
		
	// 메소드
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return title + " - " + description;
	}
	
}
