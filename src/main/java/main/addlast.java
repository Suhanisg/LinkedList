package main;

public class addlast {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static addlast.Node head;
    public static addlast.Node tail;
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;

        }
        tail.next=newNode;
        tail=newNode;
    }
    public void Print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "  ");
            temp=temp.next;
        }
        System.out.println("null");
    }

}
