//package weeklyPlanner;
//
//import java.util.*;
//
////요일별 일정 관리를 위한 클래스
//class DaySchedule {
// private List<String> tasks = new ArrayList<>();
//
// public void addTask(String task) {
//     tasks.add(task);
// }
//
// public void removeTask(int index) {
//     if (index >= 0 && index < tasks.size()) {
//         tasks.remove(index);
//     }
// }
//
// public void editTask(int index, String newTask) {
//     if (index >= 0 && index < tasks.size()) {
//         tasks.set(index, newTask);
//     }
// }
//
// public List<String> getTasks() {
//     return tasks;
// }
//}
//
////일정 관리 클래스
//class ScheduleManager {
// private final Map<String, DaySchedule> schedule = new HashMap<>();
//
// public ScheduleManager() {
//     String[] days = {"월", "화", "수", "목", "금", "토", "일"};
//     for (String day : days) {
//         schedule.put(day, new DaySchedule());
//     }
// }
//
// public void addSchedule(String day, String task) {
//     schedule.get(day).addTask(task);
// }
//
// public void viewSchedule(String day) {
//     List<String> tasks = schedule.get(day).getTasks();
//     System.out.println("[ " + day + "요일 일정 ]");
//     if (tasks.isEmpty()) {
//         System.out.println("등록된 일정이 없습니다.");
//     } else {
//         for (int i = 0; i < tasks.size(); i++) {
//             System.out.println((i + 1) + ". " + tasks.get(i));
//         }
//     }
// }
//
// public void deleteSchedule(String day, int index) {
//     schedule.get(day).removeTask(index);
// }
//
// public void editSchedule(String day, int index, String newTask) {
//     schedule.get(day).editTask(index, newTask);
// }
//
//public Map<String, DaySchedule> getSchedule() {
//	return schedule;
//}
// 
// 
//}
//
////실행 클래스
//public class ScheduleApp {
// private static final Scanner scanner = new Scanner(System.in);
// private static final ScheduleManager manager = new ScheduleManager();
//
// public static void main(String[] args) {
//     while (true) {
//         System.out.println("\n[ 주간 일정 관리 프로그램 ]");
//         System.out.println("1. 일정 추가");
//         System.out.println("2. 일정 조회");
//         System.out.println("3. 일정 삭제");
//         System.out.println("4. 일정 수정");
//         System.out.println("5. 종료");
//         System.out.print("원하는 기능을 선택하세요: ");
//         
//         int choice = scanner.nextInt();
//         scanner.nextLine();
//         
//         switch (choice) {
//             case 1 -> addSchedule();
//             case 2 -> viewSchedule();
//             case 3 -> deleteSchedule();
//             case 4 -> editSchedule();
//             case 5 -> {
//                 System.out.println("프로그램을 종료합니다.");
//                 return;
//             }
//             default -> System.out.println("올바른 숫자를 입력하세요.");
//         }
//     }
// }
//
// private static void addSchedule() {
//     String day = getDayInput();
//     System.out.print("추가할 일정을 입력하세요: ");
//     String task = scanner.nextLine();
//     manager.addSchedule(day, task);
//     System.out.println("일정이 추가되었습니다.");
// }
//
// private static void viewSchedule() {
//     String day = getDayInput();
//     manager.viewSchedule(day);
// }
//
// private static void deleteSchedule() {
//     String day = getDayInput();
//     manager.viewSchedule(day);
//     System.out.print("삭제할 일정 번호를 입력하세요: ");
//     int index = scanner.nextInt() - 1;
//     scanner.nextLine();
//     manager.deleteSchedule(day, index);
//     System.out.println("일정이 삭제되었습니다.");
// }
//
// private static void editSchedule() {
//     String day = getDayInput();
//     manager.viewSchedule(day);
//     System.out.print("수정할 일정 번호를 입력하세요: ");
//     int index = scanner.nextInt() - 1;
//     scanner.nextLine();
//     System.out.print("새로운 일정을 입력하세요: ");
//     String newTask = scanner.nextLine();
//     manager.editSchedule(day, index, newTask);
//     System.out.println("일정이 수정되었습니다.");
// }
// 
// private static String getDayInput() {
//     while (true) {
//         System.out.print("요일을 입력하세요 (월~일): ");
//         String day = scanner.nextLine().trim();
//         if (manager != null && manager.getSchedule().containsKey(day)) {
//             return day;
//         }
//         System.out.println("올바른 요일을 입력하세요.");
//     }
// }
//}
