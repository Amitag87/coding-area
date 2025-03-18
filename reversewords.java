import java.util.*;
public class reversewords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String words[]  =input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i = words.length-1 ; i>=0 ; i--){
            result.append(words[i]);
            if(i>0){
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }
}
