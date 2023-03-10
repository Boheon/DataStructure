package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public class Node {//inner class, nested class
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){//head부터 null 값 될때까지 값읽음
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head : "+ head.value);
    }

    public void getTail(){
        System.out.println("Tail : "+ tail.value);
    }

    public void getLength(){
        System.out.println("Length : "+ length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;

        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;

        if(length == 0){//length--했으므로 length가 1인 경우를 거르는 것이다.
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if(length == 0){
            tail = null;//head=head.next라 head는 어차피 null이므로 안적어도 됨
        }

        return temp;

    }

}
