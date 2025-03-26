package weeklyPlannerWithSQL;
import java.util.*;

public class DayScheduleJdbc {

	// 일정을 저장할 ArrayList. 요일은 X !!!
	private List<String> tasks = new ArrayList<>();
	
	//추가
	public void addTask(String task) {
		tasks.add(task);
	}
	
	//삭제
	public void removeTask(int index) {
		if (index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		}
	}
	
	//수정
	public void editTask(int index, String newTask) {
		if (index >= 0 && index < tasks.size()) {
			tasks.set(index, newTask);
		}
	}
	
	//조회
	public List<String> getTasks() {
		return tasks;
	}
	
	//모든 일정 비우기
	public void clearTasks() {
        tasks.clear();
    }
	
}
