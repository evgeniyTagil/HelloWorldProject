public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");

        byte a = 3;
        short b = 4;
        int c = 6;
        long d = 77;

        byte newByte = (byte) d; // <-- work because explicit cast
        // byte newBute2 = c; <--don't work

        char ch = 'a';

        float flo = 1.4f;
        double dd = 1.5;

        boolean isTrue = true;
        boolean isFalse = false;

        int minValue = 3;
        int maxValue = 5;
        System.out.println(3 == 5);
        System.out.println(minValue == maxValue);
        System.out.println(minValue != maxValue);

    }
}