package web.app.craigstroberg.twentytwenty.october.october25;

public class TestIntArray {

    public static void main(String[] args) {
        IntArray intArray = new IntArray("5 6 4 8 77 -1", ' ' );
        System.out.println("Before shuffle");
        System.out.println(intArray.toString());
        intArray.shuffle();
        System.out.println("After shuffle ");
        System.out.println(intArray.toString());
    }
}
