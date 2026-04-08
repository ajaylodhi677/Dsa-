package lec2;
import java.util.*;
//public class hello {
//    public static void main(String[] args) {
//        int arr[] = {2,7,11,15,3,6};
//        int target = 9;
//        for( int i = 0;i<arr.length;i++){
//            for(int j =i+1;j< arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    System.out.println(arr[i ]+ " " +arr[j]);
//                    System.out.println(i+ " " +j);
//                }
//            }
//        }
//    }
//}

//class hello{
//    public static int[] pairSum(int arr[],int target){
//        for(int i = 0; i<arr.length;i++){
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    return new int[]{arr[i],arr[j]};
//                }
//            }
//        }
//        return new int[]{ -1,-1};
//    }
//    public static void main(String[] args) {
//        int arr[] ={2,7,11,15,3,6};
//        int target =13;
//        int output[] = pairSum(arr ,target);
//        System.out.println(output[0] +" " +output[1]);
//
//    }
//}

//class hello{ // maximum form subarray form array
//    // brute force algorithm
//    public static void main(String[] args) {
//        int [] arr = { -1,-2,-3,5,-5};
//        int maxSum = Integer.MIN_VALUE;
//        for(int i=0;  i<arr.length; i++){
//           int sum =0;
//           for( int j = i;j< arr.length;j++){
//               sum = sum+arr[j];
//               if(sum>maxSum){
//                   maxSum = sum;
//
//               }
//           }
//        }
//        System.out.println(maxSum);
//    }
//}

//class hello{// kadanes algorithm
//    public static void main(String[] args) {
//        int arr[] = {-1,-2,-3,5,-4};
//        int maxSum =Integer.MIN_VALUE;
//        int currSum =0;
//        for(int i =0; i<arr.length;i++){
//            currSum=currSum+arr[i];
//            if(currSum>maxSum){
//                maxSum =currSum;
//            }
//            if(currSum <0){
//                currSum=0;
//            }
//        }
//        System.out.println(maxSum);
//    }
//}
class hello{//kadanes algorithm
    public static void main(String[] args) {
        int []arr = {-1 ,-2,-8,0,2,3};
        int maxSum = arr[0];
        int currSum =arr[0];
        for(int i=1;i<arr.length;i++){
            currSum =Math.max(arr[i],currSum+arr[i]);
            maxSum =Math.max(maxSum,currSum);
        }
        System.out.println(maxSum);
    }
}
