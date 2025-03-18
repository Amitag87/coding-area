import java.util.*;
public class DecimalTORoman {
    public static void main(String[] args) {
        int[] decimal = {1000 , 500 , 100,50,10,5,1};
        String[] roman = {"M" , "D" , "C" ,"L", "X" , "V" ,"I"};
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<1 && number>3999){
            System.out.println("invalid");
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<decimal.length;i++){
            while(number>=decimal[i]){
                result.append(roman[i]);
                number=number-decimal[i];

            }

        }
        System.out.println(result.toString());


    }
}
