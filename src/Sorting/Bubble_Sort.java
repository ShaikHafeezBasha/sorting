package Sorting;

public class Bubble_Sort {
    public void Bubble_Sort(int []arr,int n) {
        for(int pass=0;pass<n-1;pass++){
            for(int j=0;j<n-1-pass;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
