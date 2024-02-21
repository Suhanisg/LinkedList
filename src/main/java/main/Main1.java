package main;

public class Main1 {
    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2,6);
        ll.print();
        System.out.println(ll.SearchKey(3));
        ll.print();             // print for SearchKey
        ll.removeFirst();
        ll.print();            // print for removing first element
        ll.removeLast();
        ll.print();           //print for removing last element
        ll.reverse();
        ll.print();



    }

}
