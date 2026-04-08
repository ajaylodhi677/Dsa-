package Lec6;

//public class hello {
//    public static int linearSearch(int arr[],int key){
//        for(int i =0;i< arr.length;i++){
//            if(arr[i]==key){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int [] arr = {10,20,30,40,50};
//        int key = 40;
//    int res = linearSearch(arr,key);
//    if(res!=-1){
//        System.out.println(res);
//    }else{
//        System.out.println("Result not found");
//    }
//
//    }
//}
// class hello{
//    public static int binarysearch(int arr[],int key){
//        int low = 0;
//        int high = arr.length -1;
//        while(low<=high){
//            int mid = (high+low)/2;
//            if(arr[mid]==key){
//                return mid;
//            }else if (arr[mid]<key){
//                low =mid+1;
//            }else{
//                high=mid-1;
//            }
//        }return -1;
//    }
//    public static void main(String[] args) {// in binary search array always sorted hi milega
//        int [] arr ={10,20,30,40,50};
//        int key= 70;
//       int res= binarysearch(arr,key);
//        System.out.println(res);
//    }
//}

//class hello{
//    public static void bubbleSort(int arr[]){
//        int n = arr.length;
//        for(int i =0;i<n-1;i++){
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                  int temp =arr[j];
//                  arr [j]  =arr[j+1];
//                  arr[j+1]=temp;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int [] arr={5,2,9,1,6};
//        bubbleSort(arr);
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
//    }
//}
class hello{
    public static int binarySearch(int arr[],int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }

            if(arr[low]<=arr[mid]){
                if(key>=arr[low] && key<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }else{
                if(key>arr[mid] && key<=arr[high]) low=mid+1;
                else high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[]={4,5,6,7,0,1,2};
        int key=0;
        int res =binarySearch(arr,key);
        System.out.println(res);
    }
}