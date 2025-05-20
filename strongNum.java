import java.util.Scanner;

public class strongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input the no. to be checked");
        int num = sc.nextInt();int n=num,i,fact,rem,sum=0;
        while(n!=0){
            i=1 ;fact=1;
             rem=n%10;
            while(i<=rem){
                fact*=i;
                i++;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==num){
            System.out.println("Strong number");
        }
    }
}
