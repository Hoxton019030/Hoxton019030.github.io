package List;

public class LinkedList {
    private Node first;
    private Node last;

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }

    public void printLinkedList(){
        Node current = first;
        while (current!=null){
            System.out.println("current.data = " + current.data);
            current = current.next;
        }
    }


    public void insert(String name){
        if(first==null){
            new Node()
        }
    }




}

class Node {
    /**
     * 這個節點的資料
     */
    String data;
    /**
     * 下一個節點的資訊
     */
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}


