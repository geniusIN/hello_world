package weeklyPlannerWithSQL;

import java.sql.*;
import java.util.*;

public class ScheduleManagerJdbc {

    private final Map<String, DayScheduleJdbc> schedule = new LinkedHashMap<>();
    private final Connection conn;

    // 데이터베이스 연결
    public ScheduleManagerJdbc(Connection conn) {
        this.conn = conn;
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        for (String day : days) {
            schedule.put(day, new DayScheduleJdbc());
        }
        loadSchedulesFromDatabase();
    }

    // 데이터베이스에서 일정 불러오기
    public void loadSchedulesFromDatabase() {
        try (Statement stmt = conn.createStatement()) {
            String sql = "SELECT * FROM SCHEDULE";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String day = rs.getString("day");
                String task = rs.getString("task");

                schedule.get(day).addTask(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 일정 추가
    public void addSchedule(String day, String task) {
        String sql = "INSERT INTO SCHEDULE (ID, DAY, TASK) VALUES (SCHEDULE_SEQ.NEXTVAL, ?, ?)";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, day);
            stmt.setString(2, task);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        schedule.get(day).addTask(task);
    }


    // 일정 조회
    public void viewSchedule(String day) {
        List<String> tasks = schedule.get(day).getTasks();
        System.out.println("┌──────[" + day + "요일 일정]──────┐\n");

        if (tasks.isEmpty()) {
            System.out.println("등록된 일정이 없습니다.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("    " + (i + 1) + ". " + tasks.get(i));
            }
            System.out.println();
            System.out.println("└──────────────────────┘");
        }
    }

    // 일정 삭제
    public void deleteSchedule(String day, int index) {
        try (PreparedStatement stmt = conn.prepareStatement("DELETE FROM SCHEDULE WHERE day = ? AND task = ?")) {
            String task = schedule.get(day).getTasks().get(index);
            stmt.setString(1, day);
            stmt.setString(2, task);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        schedule.get(day).removeTask(index);
    }

    // 일정 수정
    public void editSchedule(String day, int index, String newTask) {
        try (PreparedStatement stmt = conn.prepareStatement("UPDATE SCHEDULE SET task = ? WHERE day = ? AND task = ?")) {
            String oldTask = schedule.get(day).getTasks().get(index);
            stmt.setString(1, newTask);
            stmt.setString(2, day);
            stmt.setString(3, oldTask);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        schedule.get(day).editTask(index, newTask);
    }
    
    //모든 일정 삭제
    public void deleteAllSchedules() {
        try (PreparedStatement stmt = conn.prepareStatement("DELETE FROM SCHEDULE")) {
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected + "개의 일정이 삭제되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        // 메모리에서 일정도 삭제
        for (String day : schedule.keySet()) {
            schedule.get(day).clearTasks();  // 각 요일의 일정도 비우기
        }
    }



    // 전체 일정 조회
    public void viewAllSchedules() {
        System.out.println("─────── 전체 일정 ───────");
        
        for (String day : schedule.keySet()) {
            List<String> tasks = schedule.get(day).getTasks();
            System.out.println("[ " + day + "요일 ]");
            
            if (tasks.isEmpty()) {
                System.out.println("등록된 일정이 없습니다.");
            } else {
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            }
            System.out.println();
        }
    }
    
    public boolean containsDay(String day) {
        return schedule.containsKey(day);
    }
}
