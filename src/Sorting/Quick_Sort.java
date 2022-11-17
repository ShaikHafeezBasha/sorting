package Sorting;

public class Quick_Sort {
    public void Quick_Sort(int []arr,int start,int end){
        if(start>=end){
            return;
        }
        int pivot_index=Partition(arr,start,end);
        Quick_Sort(arr,start,pivot_index-1);
        Quick_Sort(arr,pivot_index+1,end);
    }
    public int Partition(int []arr,int start,int end){
        int pivot=arr[start];
        int i=start,j=end;
        while(i<j){
            while(i<=end && arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        arr[start]=arr[j];
        arr[j]=pivot;
        return j;
    }
}
