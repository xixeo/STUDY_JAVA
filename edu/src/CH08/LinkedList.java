package CH08;

public class LinkedList {
	
	// Node 클래스 사용.
	// 참고 https://catch-me-java.tistory.com/37
	// 참고(2) https://compmath.korea.ac.kr/indust/InnerClass.html
    private Node head;

    public LinkedList() {
        head = null;
    }

    private class Node {
        private String data;
        private Node link;

        public Node(String data) {
            this.data = data;
        }
    }
    
    // insert만 https://12716.tistory.com/entry/JDBC-insert%EB%8D%B0%EC%9D%B4%ED%84%B0-%EC%82%BD%EC%9E%85
    // 참고 자료 https://chobopark.tistory.com/306#google_vignette
    // 참고 자료(2) https://k3068.tistory.com/24
    public void insert(String data) {
        // 새로운 노드 생성
        Node newNode = new Node(data);
        
        // 리스트가 비어있거나 새로운 데이터가 리스트의 첫 번째 데이터보다 작을 때
        if (head == null || head.data.compareTo(data) > 0) {
            // 새로운 노드를 리스트의 맨 앞에 삽입
            newNode.link = head;
            head = newNode;
        } else {
            // 리스트가 비어있지 않고, 새로운 데이터가 첫 번째 데이터보다 큰 경우
            // 현재 노드를 사용하여 위치를 찾음
            Node current = head;
            while (current.link != null && current.link.data.compareTo(data) < 0) {
                current = current.link;
            }
            // 새로운 노드를 현재 위치에 삽입
            newNode.link = current.link;
            current.link = newNode;
        }
    }

    // 리스트 출력
    public void printList() {
        if (head == null) {
            // 리스트가 비어있을 때
            System.out.println("List is empty");
            return;
        }
        // 리스트가 비어있지 않을 때
        Node current = head;
        while (current != null) {
            // 각 노드의 데이터를 출력
            System.out.print(current.data + " -> ");
            current = current.link;
        }
        // 리스트의 끝을 나타내는 null 출력
        System.out.println("null");
    }

    // 데이터 삭제
    public void delete(String data) {
        if (head == null) {
            // 리스트가 비어있을 때
            System.out.println("List is empty");
            return;
        }
        if (head.data.equals(data)) {
            // 삭제할 데이터가 첫 번째 데이터인 경우
            head = head.link;
            return;
        }
        // 삭제할 데이터가 첫 번째 데이터가 아닌 경우
        Node current = head;
        while (current.link != null && !current.link.data.equals(data)) {
            // 삭제할 데이터를 찾음
            current = current.link;
        }
        if (current.link == null) {
            // 데이터가 존재하지 않을 때
            System.out.println("Data not found");
        } else {
            // 데이터를 삭제
            current.link = current.link.link;
        }
    }
    
    
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        LinkedList myList = new LinkedList();
        myList.printList();

        myList.insert("JAVA");
        myList.insert("HTML");
        myList.insert("CSS");
        myList.insert("Javascript");
        myList.printList();
        myList.delete("CSS");
        myList.printList();
    }
}