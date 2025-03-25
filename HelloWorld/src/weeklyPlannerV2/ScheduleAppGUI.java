package weeklyPlannerV2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class ScheduleAppGUI extends JFrame {
    private static final ScheduleManager manager = new ScheduleManager();
    private JTextArea textArea;

    public ScheduleAppGUI() {
        // 창 설정
        setTitle("주간 일정 관리 프로그램");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 레이아웃 설정
        setLayout(new BorderLayout());

        // 일정 출력할 텍스트 영역
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // 버튼 패널 설정
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // 일정 추가 버튼
        JButton addButton = new JButton("일정 추가");
        addButton.addActionListener(e -> addSchedule());
        buttonPanel.add(addButton);

        // 일정 조회 버튼
        JButton viewButton = new JButton("일정 조회");
        viewButton.addActionListener(e -> viewSchedule());
        buttonPanel.add(viewButton);

        // 일정 삭제 버튼
        JButton deleteButton = new JButton("일정 삭제");
        deleteButton.addActionListener(e -> deleteSchedule());
        buttonPanel.add(deleteButton);

        // 일정 수정 버튼
        JButton editButton = new JButton("일정 수정");
        editButton.addActionListener(e -> editSchedule());
        buttonPanel.add(editButton);

        // 전체 일정 조회 버튼
        JButton viewAllButton = new JButton("전체 일정 조회");
        viewAllButton.addActionListener(e -> viewAllSchedule());
        buttonPanel.add(viewAllButton);

        // 버튼 패널을 창에 추가
        add(buttonPanel, BorderLayout.SOUTH);
        
        // 화면에 표시
        setVisible(true);
    }

    // 일정 추가
    private void addSchedule() {
        String day = JOptionPane.showInputDialog("요일을 입력하세요 (월~일):");
        String task = JOptionPane.showInputDialog("추가할 일정을 입력하세요:");
        manager.addSchedule(day, task);
        JOptionPane.showMessageDialog(this, "일정이 추가되었습니다.");
    }

    // 일정 조회
    private void viewSchedule() {
        String day = JOptionPane.showInputDialog("요일을 입력하세요 (월~일):");
        textArea.setText(""); // 기존 텍스트 지우기
        manager.viewSchedule(day);  // 해당 요일의 일정 조회
        List<String> tasks = manager.schedule.get(day).getTasks();
        if (tasks.isEmpty()) {
            textArea.append("등록된 일정이 없습니다.\n");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                textArea.append((i + 1) + ". " + tasks.get(i) + "\n");
            }
        }
    }

    // 일정 삭제
    private void deleteSchedule() {
        String day = JOptionPane.showInputDialog("요일을 입력하세요 (월~일):");
        manager.viewSchedule(day);  // 일정 확인
        String indexStr = JOptionPane.showInputDialog("삭제할 일정 번호를 입력하세요:");
        int index = Integer.parseInt(indexStr) - 1;
        manager.deleteSchedule(day, index);
        JOptionPane.showMessageDialog(this, "일정이 삭제되었습니다.");
    }

    // 일정 수정
    private void editSchedule() {
        String day = JOptionPane.showInputDialog("요일을 입력하세요 (월~일):");
        manager.viewSchedule(day);  // 일정 확인
        String indexStr = JOptionPane.showInputDialog("수정할 일정 번호를 입력하세요:");
        int index = Integer.parseInt(indexStr) - 1;
        String newTask = JOptionPane.showInputDialog("새로운 일정을 입력하세요:");
        manager.editSchedule(day, index, newTask);
        JOptionPane.showMessageDialog(this, "일정이 수정되었습니다.");
    }

    // 전체 일정 조회
    private void viewAllSchedule() {
        textArea.setText(""); // 기존 텍스트 지우기
        for (String day : manager.schedule.keySet()) {
            textArea.append("-----[" + day + "요일 일정]-----\n");
            List<String> tasks = manager.schedule.get(day).getTasks();
            if (tasks.isEmpty()) {
                textArea.append("등록된 일정이 없습니다.\n");
            } else {
                for (int i = 0; i < tasks.size(); i++) {
                    textArea.append((i + 1) + ". " + tasks.get(i) + "\n");
                }
            }
            textArea.append("\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ScheduleAppGUI());
    }
}

class ScheduleManager {

    // 새로운 schedule 맵 생성
    public final Map<String, DaySchedule> schedule = new LinkedHashMap<>();

    public boolean containsDay(String day) {
        return schedule.containsKey(day);
    }

    // schedule 맵을 초기화
    public ScheduleManager() {
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        for (String day : days) {
            schedule.put(day, new DaySchedule());
        }
    }

    // 추가 기능 메소드
    public void addSchedule(String day, String task) {
        schedule.get(day).addTask(task);
    }

    // 조회 기능 메소드
    public void viewSchedule(String day) {
        List<String> tasks = schedule.get(day).getTasks();
        System.out.println("-----[" + day + "요일 일정]-----");

        if (tasks.isEmpty()) {
            System.out.println("등록된 일정이 없습니다.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // 삭제 기능 메소드
    public void deleteSchedule(String day, int index) {
        schedule.get(day).removeTask(index);
    }

    // 수정 기능 메소드
    public void editSchedule(String day, int index, String newTask) {
        schedule.get(day).editTask(index, newTask);
    }
}

class DaySchedule {

    // 일정을 저장할 ArrayList. 요일은 X !!!
    private List<String> tasks = new ArrayList<>();

    // 추가
    public void addTask(String task) {
        tasks.add(task);
    }

    // 삭제
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    // 수정
    public void editTask(int index, String newTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newTask);
        }
    }

    // 조회
    public List<String> getTasks() {
        return tasks;
    }
}
