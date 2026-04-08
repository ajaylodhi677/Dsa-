package lec7;

public class hello {
    public static void merge(int []arr,int low ,int mid,int h){
        int temp []=new int[h-low+1];
        int i = low;
        int j =mid+1;
        int k =
    }
    public static void mergeSort(int arr[],int low,int h){
        if(low<=h){
            return;
        }
        int mid =(low+h)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,h);
        merge(arr,low,mid,h);

    }
    public static void main(String[] args) {
        int [] arr ={6,2,9,4,6 };
        mergeSort(arr,0,arr.length-1);
    }
}
