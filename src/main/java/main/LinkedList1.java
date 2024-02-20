package main;

public class LinkedList1 {
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
    public static int size;
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

    public void addMiddle(int idx,int data){
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
    //To remove first element in LinkedList

    public int removeFirst() {
        if (size == 0) {
            System.out.println("UnderFlow");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //To remove last element in linkedlist

    public int removeLast() {
        if (size == 0) {
            System.out.println("List Is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
            head = prev;
        }
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "  ");
            temp=temp.next;
        }
        System.out.println("null");
    }




}