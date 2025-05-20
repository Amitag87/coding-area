/* Program to check whether the given number is Armstrong or not is discussed here. A number is an Armstrong number when the sum of nth power of
each digit is equal to the number itself. */

// C program to check whether the given number is Armstrong or not


import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , temp , n=0 , rem , result=0;
        System.out.println("Input no.");
        num=sc.nextInt();
        temp=num;
//        no. of digits
        while(temp!=0){
            temp/=10;
            n++;
        }

//        checking of armsttrong
        temp=num;
        while(temp!=0){
            rem=temp%10;
            result +=Math.pow(rem, n);
            temp/=10;

        }
        if(result==num){
            System.out.println("apna no."+ num+ " is a Armstrong no." );
        }
        else {
            System.out.println("apna no."+ num+ " is not a Armstrong no." );
        }

    }
}
