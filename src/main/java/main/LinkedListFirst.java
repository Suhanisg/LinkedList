package main;

public class LinkedListFirst {

        public static class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }

        }
        public static Node head;
        public static Node tail;
        public void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head= tail= newNode ;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;

            }
            tail.next=newNode;
            tail=newNode;
        }
        public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+ "  ");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public void add(int idx,int data){
            Node newNode=new Node(data);
            Node temp=head;
            int i=0;
            while(i< idx-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }

        public static void main(String[] args) {
            LinkedListFirst ll=new LinkedListFirst();
            ll.addFirst(1);
            ll.addFirst(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.add(2,6);
            ll.print();
        }
}