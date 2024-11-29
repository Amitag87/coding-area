public class printPath {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int c=0;
        print(1,1,rows,cols ,c, "");

//        System.out.printprint(count);
    }

    private static void print(int sr, int sc, int er, int ec , int c,String s ) {
         if(sr>er || sc>ec) { return;}
         if(sr==er && sc==ec){
             System.out.print(s+"\n");

             return;
         }

         //go down
        print(sr+1,sc,er,ec,c,s+"D");
//         go right
        print(sr, sc+1, er, ec, c,s + "R");
    }
}
