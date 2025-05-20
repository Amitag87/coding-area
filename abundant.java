//A number is called an Abundant Number if the sum of its proper divisors (all positive divisors excluding the number itself) is greater than the number.
//CHECK ABUNDANT NUMBERS
import java.util.*;
public class abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input no. to be checked");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum+=i;
        }
        if(sum>num){
            System.out.println("abundant no.");
        }
        else{
            System.out.println("not abundant");
        }
    }
}