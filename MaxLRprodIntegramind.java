import java.util.*;
public class MaxLRprodIntegramind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n ;i++){
            arr[i]=sc.nextInt();
        }
        int[] L=new int[n];
        int[] R=new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                L[i]=0;
            }
            else{
                L[i]=st.peek();
            }
            st.push(i);

        }
        st.clear();
        for(int i=n-1 ; i>=0 ; i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                R[i]=n;
            }
            else{
                R[i]=st.peek();
            }
            st.push(i);
        }


        int maxProduct = 0;
        for(int i=0 ; i<n ;i++){
            int product = L[i]*R[i];
            if(product>maxProduct){
                maxProduct=product;
            }
        }
        System.out.println(maxProduct);


    }
}
