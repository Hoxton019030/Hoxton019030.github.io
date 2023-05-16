package list;


public class LinkedList_Demo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert("Hoxton");
        linkedList.insert("Stasy");
        linkedList.insert("Esther");
        linkedList.printLinkedList();
//        linkedList.delete(new Node("Hoxton"));
//        System.out.println("刪除完後");
//        linkedList.printLinkedList();
//        System.out.println("新增Node");
//        linkedList.insert("Ian");
//        linkedList.printLinkedList();
    }

}

class LinkedList {
    private Node first;
    private Node last;

    public void insert(String name) {
        Node newNode = new Node(name); //近來後就變新的Node

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;     //  在第二個Node進來前，first與last實際上都是同一個物件(HashCode一樣)。
                                    // 但當執行到第32行last.next = newNode時，因為這兩個東西是一樣的，所以first的next跟last的next都會共同指向newNode
                                    // 執行完後，first與last已經是不同物件了(hashcode不同)
            last = newNode;
        }
    }

    public void delete(Node node){
        if(first.username.equals(node.username)){
            first = first.next;
        }
        if(last.username.equals(node.username)){
            Node currentNode =first;
            while (currentNode.next!=last){
                currentNode = currentNode.next;
            }
            currentNode.next=null;
            last=currentNode;
        }
        else {
            Node currentNode =first;
            while (currentNode.next.username.equals(node.username)){
                currentNode.next = currentNode.next.next;
            }
        }
    }

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

