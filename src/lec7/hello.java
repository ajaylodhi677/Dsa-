package lec7;

public class hello {
    public static void merge(int []arr,int low ,int mid,int h){
        int temp[]=new int[h-low+1];
        int i = low;
        int j =mid+1;
        int k = 0;

        while(i<=mid && j<=h){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while (i<=mid){
            temp[k++] =arr[i++];
        }
        while(j<=h){
            temp[k++]=arr[j++];
        }
        for(int x=0;x<temp.length;x++){
            arr[low+x]=temp[x];
        }
    }
    public static void mergeSort(int arr[],int low,int h){
        if(low>=h){
            return;
        }
        int mid =(low+h)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,h);
        merge(arr,low,mid,h);

    }
    public static void main(String[] args) {
        int [] arr ={5,2,9,4,6 };
        mergeSort(arr,0,arr.length-1);
        for(int x: arr){
        System.out.println(x);
        }
    }
}
