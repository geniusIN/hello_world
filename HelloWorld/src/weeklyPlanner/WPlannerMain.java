package weeklyPlanner;
import java.util.Scanner;

public class WPlannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean showMenu;
		showMenu = true;
		ScheduleManager manager = new ScheduleManager();
		
		while(showMenu) {
			System.out.println("1.요일별 조회  2.일정 추가  3.일정 수정  4.일정 삭제  5.전체 일정 조회");
			System.out.print("메뉴를 선택하세요>> ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			
			switch(menu) {
				case 1: 
					System.out.print("조회할 요일을 선택하세요(1.MON, 2.TUE, 3.WED, 4.THU, 5.FRI, 6.SAT, 7.SUN,  취소:9)>> ");
					int day = sc.nextInt();
					sc.nextLine();
					switch(day) {
						case 1:
							manager.viewScheduleItems("MON");
							break;
						case 2:
							manager.viewScheduleItems("TUE");
							break;
						case 3:
							manager.viewScheduleItems("WED");
							break;
						case 4:
							manager.viewScheduleItems("THU");
							break;
						case 5:
							manager.viewScheduleItems("FRI");
							break;
						case 6:
							manager.viewScheduleItems("SAT");
							break;
						case 7:
							manager.viewScheduleItems("SUN");
							break;
						case 9:
							break;
						
						default: break;
						
					}
					break;
					
				case 2:
					System.out.print("일정을 추가할 요일을 선택하세요(1.MON, 2.TUE, 3.WED, 4.THU, 5.FRI, 6.SAT, 7.SUN,  취소:9)>> ");
					day = sc.nextInt();
					sc.nextLine();
					System.out.print("제목을 입력해 주세요>> ");
					String title = sc.nextLine();
					System.out.print("일정의 내용을 입력해 주세요>> ");
					String description = sc.nextLine();
					
					switch(day) {
					case 1: 
						manager.addScheduleItem("MON", title, description);
						break;
					case 2:
						manager.addScheduleItem("TUE", title, description);
						break;
					case 3:
						manager.addScheduleItem("WED", title, description);
						break;
					case 4:
						manager.addScheduleItem("THU", title, description);
						break;
					case 5:
						manager.addScheduleItem("FRI", title, description);
						break;
					case 6:
						manager.addScheduleItem("SAT", title, description);
						break;
					case 7:
						manager.addScheduleItem("SUN", title, description);
						break;
					case 9:
						break;
						default: break;
					}
					break;
					
				case 3:
					System.out.print("일정을 수정할 요일을 선택하세요(1.MON, 2.TUE, 3.WED, 4.THU, 5.FRI, 6.SAT, 7.SUN,  취소:9)>> ");
					day = sc.nextInt();
					for(int i = 0; i < 7; i++) {
						if(day == Weekday.values()[i].ordinal()+1) {
							System.out.println("수정할 일정의 제목을 입력하세요");
							String titleOfNewSchedule = sc.nextLine();
						}
					}
				break;
				
				case 4:
					System.out.println("일정을 삭제할 요일을 선택하세요(1.MON, 2.TUE, 3.WED, 4.THU, 5.FRI, 6.SAT, 7.SUN,  취소:9)>> ");
					
					
			}
			
			
			
				
		}
	}

}
