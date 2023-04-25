package lesson10.homework;

public class MethodToImplement {

    public void digitalOutput(String string) {
        String firstBlock = string.substring(0, 4);
        String twoBlock = string.substring(9, 13);
        System.out.println(firstBlock + " " + twoBlock);
    }

    public static void replacement(String string) {
        System.out.println(string.replace("AAA", "***"));
    }

    public static void printLetters(String string) {
        System.out.println(string.substring(5, 8) + "/" + string.substring(14, 17) +
                "/" + string.substring(19, 20) + "/" + string.substring(21, 22));
    }

    public static void checkLetters(String string) {
        System.out.println(string.endsWith("adc") & (string.endsWith("ABC")));
    }

    public static void checkNumbers(String string) {
        System.out.println(string.startsWith("555"));
    }

    public static void checkEndString(String string) {
        System.out.println(string.endsWith("1a2b"));
    }
}
