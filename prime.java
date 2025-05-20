import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int num=sc.nextInt();

        for (int i=2 ; i<num/2 ;i++){
            if(num%i==0){
                System.out.println("not a Prime no.");
                return;
            }
        }
        System.out.println("prime no.");
    }
}
