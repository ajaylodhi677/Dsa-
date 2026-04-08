package lec5;

import java.util.Scanner;

//public class hello {
//    public static void main(String[] args) {
//        String str = "hello";
//        String str1= "hello";
//
//        if(str==str1){
//            System.out.println("true"); // true because== checks reference, and since string literals are stored in the pool, both variables point to the same object, so it returns true.
//        }else {
//            System.out.println("false");
//        }
//        StringBuilder str = new StringBuilder("hello");
//        str.append("world");
//        System.out.println(str);
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.next();
//        System.out.println(s1);
//        String s1 = sc.nextLine();
//        System.out.println(s1);
//          String str ="hello";
//          for(int i = 0; i<str.length();i++){
//              System.out.print(str.charAt(i));
//              }
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
//        System.out.println(str.subSequence(0,3));
//        System.out.println(str.toUpperCase());
//        System.out.println(str.concat("hoo"));
//        System.out.println(str);
//        String str1 = new String("hello");
//        System.out.println(str1);
//        if(str==str1){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
//    }
//}

//class hello{
//    public static void main(String[] args) {
//        String s1 ="hello";
//        for(int i =0;i<s1.length();i++){
//            char ch =s1.charAt(i);
//            int count = 0;
//            for(int j=0;j<s1.length();j++){
//                if(s1.charAt(j)==ch)
//                    count++;
//                }
//            if (count == 1) {
//                System.out.println(ch);
//                break;
//            }
//        }
//    }
//}
//class hello{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str =sc.nextLine();
//        String rev = "";
//        for(int i = str.length()-1;i>=0;i--){
//            rev = rev +str.charAt(i);
//        }
//        System.out.println(rev);
//        if(str.equals(rev)){
//            System.out.println("palindrome");
//        }else{
//            System.out.println("non palindrome");
//        }
//    }
//}
class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word ="";
        String [] words = new String[str.length()];
        int index =0;

        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);

            if(ch !=' '){
                word = word+ch;
            }else{
                words[index++] =word;
                word ="";
            }
        }
        words[index++] =word;
        for(int i = index -1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
    }
}