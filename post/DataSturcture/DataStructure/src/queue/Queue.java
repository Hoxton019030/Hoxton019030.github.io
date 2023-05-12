package queue;

import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {

        CircularLinearStackBetter linearStack = new CircularLinearStackBetter();
        Scanner scanner = new Scanner(System.in);
        Integer[] integer = new Integer[10];
        while (true) {
            int i = scanner.nextInt();
            if (i == 0) {
                linearStack.Dequeue(integer);
            }
            if (i != 0) {
                linearStack.Enqueue(integer, i);
            }
            for (int j = 0; j < integer.length; j++) {
                System.out.println("integer " + j + "= " + integer[j]);
            }
        }
    }
}


class LinearStack {

    /**
     * 佇列前端
     */
    int front = 0;
    /**
     * 佇列尾端
     */
    int rear = 0;

    public void Enqueue(Integer[] array, Integer item) {
        if (rear == 10) { //問題點
            System.out.println("Queue已滿");
        } else {
            rear = rear + 1;
            array[rear] = item;
        }
    }

    public Integer Dequeue(Integer[] array) {
        if (rear == front) {
            System.out.println("Queue為空");
            return null;
        } else {
            front = front + 1;
            Integer integer = array[front];
            array[front] = 0;
            return integer;
        }
    }
}

class CircularLinearStack {

    int queueSize = 10;
    /**
     * 佇列前端
     */
    int front = 0;
    /**
     * 佇列尾端
     */
    int rear = 0;


    public void Enqueue(Integer[] array, Integer item) {
        rear = (rear + 1) % queueSize;
        if (front == rear) {
            System.out.println("Queue已滿");
            rear = (rear - 1) % queueSize;
        } else {
            array[rear] = item;
        }
    }

    public Integer Dequeue(Integer[] array) {
        if (front == rear) {
            System.out.println("Queue為空");
            return null;
        } else {
            front = (front + 1) % queueSize;
            Integer integer = array[front];
            array[front] = 0;
            return integer;
        }
    }
}

class CircularLinearStackBetter {


    int queueSize = 10;
    Integer[] array = new Integer[]{queueSize};
    /**
     * 佇列前端
     */
    int front = 0;
    /**
     * 佇列尾端
     */
    int rear = 0;

    /**
     *
     */
    boolean tag = false;


    public void Enqueue(Integer[] array, Integer item) {
        if (front == rear & tag == true) {
            System.out.println("Queue已滿");
        } else {
            rear = (rear + 1) % queueSize;
            array[rear] = item;
            if (front == rear) {
                tag = true;
            }
        }
    }

    public Integer Dequeue(Integer[] array) {
        if (front == rear & tag == false) {
            System.out.println("Queue為空");
            return null;
        } else {
            front = (front + 1) % queueSize;
            Integer integer = array[front];
            array[front] = 0;
            if (front == rear) {
                tag = false;
            }
            return integer;
        }
    }


}

class LinkedList{

}

