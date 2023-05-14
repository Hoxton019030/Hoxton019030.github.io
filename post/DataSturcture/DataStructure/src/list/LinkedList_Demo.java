package list;


public class LinkedList_Demo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert("Hoxton");
        linkedList.insert("Stasy");
        linkedList.printLinkedList();
        System.out.println("linkedList.isEmpty() = " + linkedList.isEmpty());
    }

}

class LinkedList {
    private Node first;
    private Node last;

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }

    public void printLinkedList() {
        Node current = first;
        while (current != null) {
            System.out.println("current.data = " + current.username);
            current = current.next;
        }
    }


    public void insert(String name) {
        Node insertNode = new Node(name);

        if (first == null) {
            first = insertNode;
            last = insertNode;
        } else {
            last.next = insertNode;
            last = insertNode;
        }
    }


}

class Node {
    /**
     * 這個節點的資料
     */
    String username;
    /**
     * 下一個節點的資訊
     */
    Node next;

    public Node(String username) {
        this.username = username;
        this.next = null;
    }
}

