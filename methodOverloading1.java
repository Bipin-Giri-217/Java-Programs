public class methodOverloading1 {
    static void height ( int h){
    System.out.println("Integer height is " + h);
    }
    static void height (double h){
    System.out.println("Double height is "+ h);
    }
    public static void main(String args[]){
    height(10);
    height(12.7);
    }
    }
    