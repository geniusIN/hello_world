package dataStructure;

public interface List {
	    // 데이터 추가
	    public void add(int data);

	    // 데이터 가져오기
	    public int get(int index);

	    // 데이터 삭제
	    public void remove(int index);

	    // 데이터 교체
	    public void set(int index, int data);

	    // 크기 반환
	    public int size();
	}

