package Sorting;

import java.util.Arrays;

public class Merge {
    public void Merge(int []A,int Asize,int []B,int Bsize,int []C){
        int i=0,j=0,k=0;
        while(i<Asize && j<Bsize){
            if(A[i]<B[j]){
                C[k++]=A[i++];
            }
            else{
                C[k++]=B[j++];
            }
        }
        while(i<Asize){
            C[k++]=A[i++];
        }
        while(j<Bsize){
            C[k++]=B[j++];
        }
    }
    public void Merge_Sort(int []arr,int []temp,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            Merge_Sort(arr,temp,low,mid);
            Merge_Sort(arr,temp,mid+1,high);
            Merge(arr,low,mid,high,temp);
        }
    }
    public void Merge(int []a,int start,int mid,int end,int []temp){
        int i=start,j=mid+1,k=start;
        while(i<=mid && j<=end){
            if(a[i]<=a[j]){
                temp[k++]=a[i++];
            }
            else{
                temp[k++]=a[j++];
            }
        }
        while(i<=mid){
            temp[k++]=a[i++];
        }
        while(j<=end){
            temp[k++]=a[j++];
        }
        if (end + 1 >= 0) System.arraycopy(temp, 0, a, 0, end + 1);
    }
}
