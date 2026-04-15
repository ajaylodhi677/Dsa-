package lec12;

import java.util.Scanner;
//----------- STACK---------------//
//public class hello {
//    int arr[];
//    int size;
//    int top;
//    public hello(int size){
//        this.size = size;
//        arr = new int[size];
//        top =-1;
//    }
//    void push(int val){
//        if (top==size-1){
//            System.out.println("stack overflow");
//            return;
//        }
//        arr[++top] =val;
//    }
//    int pop(){
//        if(top==-1){
//            System.out.println("stack empty");
//            return -1;
//        }
//      return  arr[top--];
//    }
//    int peek(){
//        if (top==-1){
//            return -1;
//        }
//        return arr[top];
//    }
//    void display(){
//        for(int i=top;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        hello list = new hello();
//        for(int i= 0;i<5;i++){
//            list.push(sc.nextInt());
//        }
//        list.display();
//        list.pop();
//        list.pop();
//        list.pop();
//        list.pop();
//        list.pop();
//        list.pop();
//        System.out.println();
//        list.display();
//        System.out.println();
//        System.out.println(list.peek());
//    }
//}

// ----------QUEUE-----------------------//
class Queue {
    int arr[];
    int size;
    int front;
    int rear;

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int val) {
        if (rear == size - 1) {
            System.out.println("queue over flow");
        }
        arr[++rear] = val;
    }
    int dequeue(){
        if (front>rear){
            System.out.println(" queue khali hai");
            return -1;
        }
        return arr[front++];
    }
    int peak(){
        if (front>rear){
            System.out.println(" queue khali hai");
            return -1;
        }
        return arr[front];
    }
    void display(){
      if(front>rear){
          System.out.println("queue khali hai");
          return;
      }
        for(int i = front; i<=rear;i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        Queue list = new Queue(3);
        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);
        list.display();
        list.dequeue();
        list.display();

    }
}