package weeklyPlanner;
import java.util.*;
public class ScheduleApp {
	private static final Scanner scn = new Scanner(System.in);
	private static final ScheduleManager manager = new ScheduleManager();
	public static void main(String[] args) {
		while(true) {
			System.out.println("\n[주간 일정 관리 프로그램]");
			System.out.println("1. 일정 추가");
			System.out.println("2. 일정 조회");
			System.out.println("3. 일정 삭제");
			System.out.println("4. 일정 수정");
			System.out.println("5. 전체 일정 조회");
			System.out.println("9. 종료");
			System.out.print("원하는 기능을 선택하세요>> ");
			
			int choice = scn.nextInt();
			scn.nextLine();
			
			switch(choice) {
			case 1 -> addSchedule();
			case 2 -> viewSchedule();
			case 3 -> deleteSchedule();
			case 4 -> editSchedule();
			case 5 -> viewAllSchedule();
			case 9 -> {
				System.out.println("프로그램 종료");
				return;
			}
			default -> System.out.println("올바른 숫자를 입력하세요.");
			}
		}
	}
	
	private static String getDayInput() {
		while (true) {
			System.out.print("요일을 입력하세요 (월~일): ");
			String day = scn.nextLine().trim();
			if ( manager != null && manager.containsDay(day)) {
				return day;
			}
			System.out.println("올바른 요일을 입력하세요.");
		}
	}
	
	private static void addSchedule() {
		String day = getDayInput();
		System.out.println("추가할 일정을 입력하세요");
		String task = scn.nextLine();
		manager.addSchedule(day, task);
		System.out.println("일정이 추가되었습니다.");
	}
	
	private static void viewSchedule() {
		String day = getDayInput();
		manager.viewSchedule(day);
	}
	
	private static void deleteSchedule() {
		String day = getDayInput();
		manager.viewSchedule(day);
		System.out.print("삭제할 일정 번호를 입력하세요: ");
		int index = scn.nextInt() - 1;
		scn.nextLine();
		manager.deleteSchedule(day, index);
		System.out.println("일정이 삭제되었습니다.");
	}
	
	private static void editSchedule() {
		String day = getDayInput();
		manager.viewSchedule(day);
		System.out.print("수정할 일정 번호를 입력하세요.");
		int index = scn.nextInt() - 1;
		scn.nextLine();
		System.out.println("새로운 일정을 입력하세요.");
		String newTask = scn.nextLine();
		manager.editSchedule(day, index, newTask);
		System.out.println("일정이 수정되었습니다.");
	}
	
	private static void viewAllSchedule() {
	    manager.viewAllSchedules();
	}

}
