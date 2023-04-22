package lesson10;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Example: ");
        System.out.println(stringBuilder.toString());
        stringBuilder.append("first");
        System.out.println(stringBuilder.toString());
        stringBuilder.append("first").append(" ").append("example"); //правильная склейка в билдере
        System.out.println(stringBuilder.toString());
        stringBuilder.setCharAt(2, 'E');

        String result = stringBuilder.toString(); //2-й способ вывода
        System.out.println(result);
        System.out.println(stringBuilder.indexOf("First")); //поиск в строке
        System.out.println(stringBuilder.replace(0, 3, "abc")); //замена по позиции на значение

        //stringBuilder.reverse(); //пишет задом на перед строку
        System.out.println(stringBuilder);

        System.out.println("----------");
        String testCase = "This abba not";
        System.out.println(isPolindrome(1, testCase));
        System.out.println(isPolindrome(2, testCase));
        System.out.println(isPolindrome(10, testCase));
        System.out.println("----------");

    }

    private static boolean isPolindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return str.equals(stringBuilder.reverse().toString());
    }

    private static boolean isPolindrome(int number, String str) {
        String[] arr = str.split(" ");
        if (number > arr.length) {
            System.out.println("Number is too long");
            return false;
        }
        return isNewPolindrome(arr[number - 1]);
    }


    private static boolean isNewPolindrome(String str) {
        char[] arr = str.toCharArray();
        int size = arr.length / 2;
        for (int i = 0; i < size; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
