public class reverseUsingString {
    public static void main(String[] args) {
        String str = "Hello" ;
        String reversed = "";
        for(int i=0;i<str.length();i++){
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);
    }
}
