import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println("yes , perfect no.");
        }
        else{
            System.out.println("Not a perfect no.");
        }
    }
}
