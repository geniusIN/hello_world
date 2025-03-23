package weeklyPlanner;
import java.util.Scanner;

public class WPlannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean showMenu;
		while(showMenu = true) {
			System.out.println("1.요일별 조회  2.일정 추가  3.일정 수정  4.일정 삭제  5.전체 일정 조회");
			System.out.print("메뉴를 선택하세요>> ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
				case 1: System.out.print("조회할 요일을 선택하세요(MON, TUE, WED, THU, FRI, SAT, SUN,  취소:9)>> ");
				int day = sc.nextInt();
				sc.nextLine();
				switch(day) {
					case 1: 
		
			}
			}
			
			
			
				
		}
	}

}
