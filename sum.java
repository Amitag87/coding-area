//import java.util.Scanner;
//
//public class sum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input sum of an array");
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        System.out.println("input elements of an array");
//        for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//        }
//        System.out.println("Input target number : ");
//        int target = sc.nextInt();
//        for(int i=0;i<n;i++){
//            int first=arr[i];
//            for (int j=i+1 ; j<n;j++){
//                if(arr[j]==(target-first)){
//                    int second=arr[j];
//                    System.out.println("first element : " +first+ "second element : "+second);
//                    return;
//                }
//            }
//        }
//    }
//}/


import java.util.HashMap;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(target-arr[i])){
                System.out.println("First element index: " + hm.get(target - arr[i]) +
                        ", Second element index: " + i);
                System.out.println("First element: " + arr[hm.get(target - arr[i])] +
                        ", Second element: " + arr[i]);

            }
            hm.put(arr[i],i);
        }

    }
}