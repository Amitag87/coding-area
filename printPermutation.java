import java.util.ArrayList;
import java.util.List;

public class printPermutation {
    public static void main(String[] args) {
        String str = "abc" ;
        List<String> l = new ArrayList<>();
        printp(str,"" , l);
        for(int i=0 ;i<l.size();i++){
            System.out.println(l.get(i));
        }
        for(String s : l){
            System.out.println(s);
        }
    }

    private static void printp(String str, String s, List<String> l) {
        if(str.equals("")){
            System.out.println(s);
            l.add(s);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i); //b
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String rem = left+right;
            printp(rem , s+ch , l) ;

        }
    }



}
