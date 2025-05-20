import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a no. to be checked");
        int num=sc.nextInt();
        int result=0 , temp=num , rem=num;
        while(temp!=0){
            rem=temp%10;
            result=result*10+rem;
            temp/=10;
        }
        if(result==num){
            System.out.println("It is a palindrome no.");
        }
        else{
            System.out.println("It is not a palindrome no.");
        }
    }
}
