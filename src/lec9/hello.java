package lec9;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node (int data) {
        this.data=data;
        this.next=null;
    }
}           //     head
//|3|->next->null |4| -> next -> null
public class hello {
    Node head;
    void addAtFirst(int data){
        Node newNode= new Node(data);
        newNode.next =head;
        head = newNode;
    }
    //|4|->next->|5|next->null
    void addAtLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp =head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next= newNode;

    }
    void printList(){
      Node temp = head;
      while(temp!=null){
          System.out.print(temp.data+"->");
          temp = temp.next;
      }
        System.out.println("null");
    }
    boolean search(int key){
      Node temp = head;
      while( temp!= null){
          if(temp.data==key){
              return true;
          }
          temp = temp.next;
      }return  false;
    }
    void update(int oldata,int newData) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == oldata) {
                temp.data = newData;
                return;
            }
            temp = temp.next;
        }
    }
    int findMiddle(){

         if(head == null){
             return -1;
         }
         int count=0;
         Node temp = head;
         while (temp!=null){
             count++;
             temp=temp.next;
         }
         temp = head;
         int mid = count/2;
         for (int i =0;i<mid;i++) {
             temp = temp.next;

         }
         return temp.data;
    }
//    add at middle
void addAtMiddle(){
    Node newNode = new Node(16);

    if(head == null){
        head = newNode;   // agar list empty hai
        return;
    }

    int count = 0;
    Node temp = head;

    // count nodes
    while (temp != null){
        count++;
        temp = temp.next;
    }

    int mid = count / 2;

    temp = head;

    // go to middle-1 position
    for (int i = 0; i < mid - 1; i++){
        temp = temp.next;
    }

    // insert
    newNode.next = temp.next;
    temp.next = newNode;
}
//     slow pointer fast pointer
    int findMiddleSlowFast(){
        if(head==null){
            return -1;
        }
        Node slow = head;
        Node fast = head;
        while(fast!= null && slow!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
    hello list = new hello();
    Scanner sc = new Scanner(System .in);
    for(int i =0;i<6;i++){
      //  list.addAtFirst(sc.nextInt());
        list.addAtLast(sc.nextInt());
    }
    list.printList();
    list.update( 5,99);
    list.printList();
//        list.addAtFirst(3);
//        list.addAtFirst(5);
//        list.addAtFirst(4);
//        list.addAtFirst(6);
//        list.addAtFirst(7);
//        list.printList();
//        list.addAtLast(633);
//        list.printList();
        int key=2;
        if(list.search(key)){
            System.out.println("found");
        }else{
            System.out.println("nhi mila");
        }
        System.out.println("middle element "+list.findMiddle());
        list.printList();
        System.out.println("slow fast middle "+list.findMiddleSlowFast());
    }
}
