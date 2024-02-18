package main;

public class Main {
    public static void main(String[] args) {
        LinkedListFirst ll=new LinkedListFirst();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,6);
        ll.print();
        ll.removeFirst();
        ll.print();            //print for removing first element
        ll.removeLast();
        ll.print();            //print for removing last element
    }
}

