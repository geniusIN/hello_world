package weeklyPlanner;

import java.util.*;

public class ScheduleManager {
    private LinkedHashMap<String, List<ScheduleItem>> scheduleMap;

    // 생성자
    public ScheduleManager() {
        this.scheduleMap = new LinkedHashMap<>();
        // 요일 초기화
        scheduleMap.put("MON", new ArrayList<>());
        scheduleMap.put("TUE", new ArrayList<>());
        scheduleMap.put("WED", new ArrayList<>());
        scheduleMap.put("THU", new ArrayList<>());
        scheduleMap.put("FRI", new ArrayList<>());
        scheduleMap.put("SAT", new ArrayList<>());
        scheduleMap.put("SUN", new ArrayList<>());
    }

    // 일정 추가
    public void addScheduleItem(String day, String title, String description) {
        if (!scheduleMap.containsKey(day)) {
            System.out.println("유효하지 않은 요일입니다.");
            return;
        }
        ScheduleItem newItem = new ScheduleItem(title, description);
        scheduleMap.get(day).add(newItem);
        System.out.println("일정이 추가되었습니다: " + newItem + " (" + day + ")");
    }

    // 일정 조회
    public void viewScheduleItems(String day) {
        if (!scheduleMap.containsKey(day)) {
            System.out.println("유효하지 않은 요일입니다.");
            return;
        }
        List<ScheduleItem> items = scheduleMap.get(day);
        if (items.isEmpty()) {
            System.out.println(day + " 일정이 없습니다.");
        } else {
            System.out.println(day + " 일정 목록:");
            for (ScheduleItem item : items) {
                System.out.println(item);
            }
        }
    }

    // 일정 수정
    public void updateScheduleItem(String day, String title, String newDescription) {
        if (!scheduleMap.containsKey(day)) {
            System.out.println("유효하지 않은 요일입니다.");
            return;
        }
        List<ScheduleItem> items = scheduleMap.get(day);
        Optional<ScheduleItem> itemToUpdate = items.stream()
                .filter(item -> item.getTitle().equals(title))
                .findFirst();

        if (itemToUpdate.isPresent()) {
            itemToUpdate.get().setDescription(newDescription);
            System.out.println("일정이 수정되었습니다: " + itemToUpdate.get() + " (" + day + ")");
        } else {
            System.out.println("해당 제목의 일정이 없습니다.");
        }
    }

    // 일정 삭제
    public void deleteScheduleItem(String day, String title) {
        if (!scheduleMap.containsKey(day)) {
            System.out.println("유효하지 않은 요일입니다.");
            return;
        }
        List<ScheduleItem> items = scheduleMap.get(day);
        boolean removed = items.removeIf(item -> item.getTitle().equals(title));
        if (removed) {
            System.out.println("일정이 삭제되었습니다: " + title + " (" + day + ")");
        } else {
            System.out.println("해당 제목의 일정이 없습니다.");
        }
    }
}
