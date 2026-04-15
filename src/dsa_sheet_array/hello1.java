package dsa_sheet_array;

import java.util.Scanner;

public class hello1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter size of array");
        int size = sc.nextInt();

        int arr[] =new int[size];
        for(int i =0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for (int num:arr){
            System.out.print(num+" ");
        }
        int max =arr[0];
        int min =arr[0];

            for(int i =1;i< arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
                if(arr[i]<min){
                    min =arr[i] ;
                }
            }
        System.out.println();
        System.out.println("max ="+max);
        System.out.println("min ="+min);


    }

}

