package LinkedList;

import LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

        myLinkedList.append(2);

//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast());//null이라 value 값하면 에러남

        myLinkedList.prepend(1);
        myLinkedList.prepend(2);

        System.out.println(myLinkedList.removeFirst().value);

        myLinkedList.printList();


    }
}