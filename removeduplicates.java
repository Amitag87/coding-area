import java.util.*;
public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<Integer> uniqueEle = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            if((i == 0 || (arr[i] != arr[i - 1]))){
                uniqueEle.add(arr[i]);
            }
        }
        for(int i=0;i<uniqueEle.size();i++){
            System.out.println(uniqueEle.get(i));
        }
    }
}
