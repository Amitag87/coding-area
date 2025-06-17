import java.util.Scanner;

public class matrixsum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        int s1=0,s2=0,s3=0,s4=0;
        for (int i=0 ;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0 ;i<m;i++){
            for(int j=0 ; j<n ;j++){
                if(i==j && (i+j)==n-1){
                   continue;
                }
                if(i<j && (i+j)<n){
                    s1+=arr[i][j];
                }
                if(i>j && (i+j)<n){
                    s2+=arr[i][j];
                }
                if(i<j && (i+j)>n){
                    s3+=arr[i][j];
                }
                if(i>j && (i+j)>n){
                    s4+=arr[i][j];
                }

            }
        }
        int totalsum = s1+s2+s3+s4 ;
        System.out.println("total sum : "+totalsum);
        System.out.println("sum 1 : "+s1);
        System.out.println("sum 2 : "+s2);
        System.out.println("sum 3 : "+s3);
        System.out.println("sum 4 : "+s4);
    }
}

