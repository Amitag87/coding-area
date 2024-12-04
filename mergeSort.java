import java.util.*;
public class mergeSort {
    public static void main(String[] args) {


        int[] arr = {3, 5, 2, 9};

        mergesort(arr);
        for(int i=0 ;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void mergesort(int[] arr) {
        int n = arr.length;
        if(n<2){
            return;

        }
        int[] a = new int[n/2];
        int[] b = new int[n-(n/2)];

        for(int i = 0 ;i<n/2 ;i++){
            a[i] = arr[i];
        }
        for(int i=0 ;i<n-n/2 ;i++){
            b[i] = arr[i+n/2];
        }
        mergesort(a);
        mergesort(b);
        merge(a,b,arr);
        a= null;
        b=null;
    }

    public static void merge(int a[] , int b[] , int arr[]) {
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                arr[k++]=a[i++];
            }
            else {
                arr[k++]=b[j++];
            }
        }

        while (i<a.length){
            arr[k++]=a[i++];
        }
        while (j<b.length){
            arr[k++]=b[j++];
        }

    }
}
