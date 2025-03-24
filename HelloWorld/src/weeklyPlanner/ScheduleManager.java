package weeklyPlanner;
import java.util.*;

public class ScheduleManager {

	//새로운 schedule 맵 생성
	private final Map<String, DaySchedule> schedule = new HashMap<>();
	
	//schedule 맵을 초기화
	public ScheduleManager() {
		String[] days = {"월", "화", "수", "목", "금", "토", "일"};
		for (String day : days) {
			schedule.put(day, new DaySchedule());
		}
	}
	
	//추가 기능 메소드
	public void addSchedule(String day, String task) {
		schedule.get(day).addTask(task);
	}
	
	//조회 기능 메소드
	public void viewSchedule(String day) {
		List<String> tasks = schedule.get(day).getTasks();
		System.out.println("[" + day + "요일 일정]");
		if(tasks.isEmpty()) {
			System.out.println("등록된 일정이 없습니다.");
		} else {
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println((i + 1) + ". " + tasks.get(i));
			}
		}
	}
	
	//삭제 기능 메소드
	public void deleteSchedule(String day, int index) {
		schedule.get(day).removeTask(index);
	}
	
	//수정 기능 메소드
	public void editSchedule(String day, int index, String newTask) {
		schedule.get(day).editTask(index, newTask);
	}
	
}
