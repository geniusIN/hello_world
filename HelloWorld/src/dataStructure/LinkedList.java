package dataStructure;

//단방향 연결 리스트(Singly Linked List)
//데이터를 추가하려면 노드를 새로 만들어서 뒤에 연결해줘야해요!
class Node {
 private int data; // 현재 노드에 저장된 데이터
 private Node nextNode; // 현재 노드의 다음 노드

 // 아래 메소드들은 수정하실 필요가 없어요!

 public Node(int data) {
     this.data = data;
 }

 // 노드에 저장된 데이터를 변경!
 public void updateData(int data) {
     this.data = data;
 }

 // 노드에 저장된 데이터 가져오기!
 public int getData() {
     return data;
 }

 // 현재 노드의 다음 노드 지정하기!
 public void setNextNode(Node node) {
     nextNode = node;
 }

 // 현재 노드의 다음 노드 가져오기!
 public Node getNextNode() {
     return nextNode;
 }
}

public class LinkedList implements List {
 private Node firstNode; // LinkedList의 첫 번째 노드
 private int listSize;   // LinkedList의 현재 크기 = 노드의 수

 // LinkedList의 마지막에 데이터를 추가!
 // 힌트) 마지막 노드는 nextNode의 값이 null이에요!
 @Override
 public void add(int data) {
     // 여기를 완성해주세요!
	 Node node = new Node(data);
	 
	 if(firstNode == null) {
		 firstNode = node;
	 } else {
		 Node current = firstNode;
		 while(current.getNextNode() != null) {
			 current = current.getNextNode();
		 }
		 current.setNextNode(node);
	 }
	 listSize++;
 }

 // LinkedList의 특정 위치에 있는 데이터를 가져오기!
 // 힌트) 여기서 index는 index + 1번째 노드라는 뜻이에요!
 @Override
 public int get(int index) {
     // 여기를 완성해주세요!
	 Node current = firstNode;
	 for(int i = 0; i < index; i++) {
		 current = current.getNextNode();
	 }
     return current.getData();
 }

 // LinkedList의 특정 위치에 있는 데이터를 삭제하기!
 // 힌트) index + 1번째 노드의 다음 노드들이 있을 수도 있어요! 이 노드들과 연결이 돼야해요!
 @Override
 public void remove(int index) {
     // 여기를 완성해주세요!
	 Node current = firstNode;
	 Node preRemoveNode = firstNode;
	 if(index == 0) {
		 firstNode = firstNode.getNextNode();
	 } else {
			 for(int i = 0; i < index; i++) {
				 preRemoveNode = current;
				 current = current.getNextNode();
			 }
			 
			 preRemoveNode.setNextNode(current.getNextNode());
	 	}
	 listSize--;
 }

 // LinkedList의 특정 위치에 있는 데이터를 수정하기!
 @Override
 public void set(int index, int data) {
     // 여기를 완성해주세요!
	 Node current = firstNode;
	 
	 for(int i = 0; i < index; i++) {
		 current = current.getNextNode();
	 }
	 current.updateData(data);
 }
 
 // LinkedList의 현재 크기 가져오기!
 @Override
 public int size() {
     // 여기를 완성해주세요!
     return listSize;
 }
 
 // 아래의 main 메소드는 실제로 메소드를 잘 구현했는지를 확인하는 부분이에요!
 public static void main(String[] args) {
     List list = new LinkedList();
     
     list.add(10);
     list.add(20);
     list.add(30);
     
     for (int i = 0; i < list.size(); i++) {
         System.out.println(list.get(i)); // 10 20 30
     }
     
     list.set(1, 25);
     list.remove(0);
 
     for (int i = 0; i < list.size(); i++) {
         System.out.println(list.get(i)); // 25 30
     }
 }
}