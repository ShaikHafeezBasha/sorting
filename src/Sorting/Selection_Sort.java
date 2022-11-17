package Sorting;

public class Selection_Sort {
    public void Selection_Sort(int []arr,int n){
        int i=0,j=0;
        for(i=0;i<n-1;i++){
            int min_index=i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
}
