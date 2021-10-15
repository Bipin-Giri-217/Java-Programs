public class methodOverloading2 {
        static void twoNOs (int a,int b){
        System.out.println("passing two parameters ");
        System.out.println("first no.: "+a+" second no. : "+b);
        System.out.println();
    }
    static void threeNOs (int a,int b, int c){
        System.out.println("passing three parameters ");
        System.out.println("first no.: "+a+" second no. : "+b +" third no. :"+c);
        }
        public static void main(String args[]){
        twoNOs(4,5);
        threeNOs(6,7,8);
        }     
}
