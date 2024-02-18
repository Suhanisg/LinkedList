package main;

public class Main1 {
    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,6);
        ll.print();
        ll.removeFirst();     // print for removing first element
        ll.print();
        ll.removeLast();
        ll.print();           //print for removing last element

    }

}
