public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        1.
        int myFavoriteNumber = 8;
        System.out.println(myFavoriteNumber);
//        2.
        String myString = "I am so lost.";
        System.out.println(myString);
//        3.
//        9.
        float myNumber = 3.14F;
        System.out.println(myNumber);
//        13.
//        int x = 4;
//        x = x + 5;
//        x += 5;
//        System.out.println(x);
        int x = 10;
        int y = 2;
//        x = x /y;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);
    }
}
