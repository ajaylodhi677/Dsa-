package lec1;
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(20);
//        list.add(10);
//        list.add(30);
//        System.out.println(list);
        System.out.println("enter size of arrraylist");
        int n = sc.nextInt();
        System.out.println("enter element");
        for(int i =0; i<n;i++){
            int x = sc.nextInt();
            list.add(x);
        }
        System.out.println(list);
        int max = list.get(0);
        for(int i=0; i< list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
//        System.out.println(max);
//        list.add(1 ,23);
//        System.out.println(list.get(2));
//        System.out.println(list.size());
 // /       list.set( 1, 45);
        System.out.println(list);
        list.remove(0);
        list.clear();
        System.out.println(list);
    }
}
