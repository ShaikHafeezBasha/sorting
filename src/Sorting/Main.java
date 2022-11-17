package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 ={6,10,20,4,5,3};
        Selection_Sort sel=new Selection_Sort();
        sel.Selection_Sort(arr1,arr1.length);

        System.out.println("Selection Sort :- "+Arrays.toString(arr1));

        int[] A ={1,4,6,11,15};
        int[] B ={2,5,8,9,10,12,13,19};
        int []C=new int[A.length+B.length];
        Merge merge=new Merge();
        merge.Merge(A,A.length,B,B.length,C);

        System.out.println("Merge :- "+Arrays.toString(C));

        int[] a ={1,4,5,-3,8,13,7,9,-5,};
        int []res=new int[a.length];
        merge.Merge_Sort(a,res,0,a.length-1);

        System.out.println("Merge_Sort :- "+Arrays.toString(a));

        int []Q={4,7,6,5,2,9,8};
        Quick_Sort qs=new Quick_Sort();
        qs.Quick_Sort(Q,0,Q.length-1);

        System.out.println("Quick Sort :- "+Arrays.toString(Q));

        int []BS={5,7,9,4,3,2,-6,8};
        Bubble_Sort bs=new Bubble_Sort();
        bs.Bubble_Sort(BS,BS.length);

        System.out.println("Bubble Sort :- "+Arrays.toString(BS));

        int[] I ={12,45,23,51,19,8};
        Insertion_Sort is=new Insertion_Sort();
        is.Insertion_Sort(I,I.length);

        System.out.println("Insertion Sort :- "+Arrays.toString(I));
    }
}
