package lesson10.homework;

public class MethodToImplement {

    public void digitalOutput(String string) throws CharacterSequenceException {
        String firstBlock = string.substring(0, 4);
        String twoBlock = string.substring(9, 13);
        System.out.println(firstBlock + " " + twoBlock);
    }

    public void replacement(String string) throws CharacterSequenceException {
        System.out.println(string.replace("AAA", "***"));
    }

    public void printLetters(String string) throws CharacterSequenceException {
        System.out.println(string.substring(5, 8) + "/" + string.substring(14, 17) +
                "/" + string.substring(19, 20) + "/" + string.substring(21, 22));
    }

    public void printInStringBuilder(String string) throws CharacterSequenceException {
        String result = string.toUpperCase();
        String[] arr = result.split("-");
        StringBuilder builder = new StringBuilder("Letters: ");
        builder.append(arr[1]).append(arr[3]).append(arr[4].charAt(1)).append(arr[4].charAt(3));
        String row = arr[1] + "/" + arr[3] + "/" + arr[4].charAt(1) + "/" + arr[4].charAt(3);
        System.out.println(row);
    }

    public void checkLetters(String string) throws CharacterSequenceException {
        System.out.println(string.endsWith("adc") & (string.endsWith("ABC")));
    }

    public void checkNumbers(String string) throws CharacterSequenceException {
        System.out.println(string.startsWith("555"));
    }

    public void checkEndString(String string) throws CharacterSequenceException {
        System.out.println(string.endsWith("1a2b"));
    }

    public void checkInSymbols(String string) throws CharacterSequenceException {
        String sample = "ABC";
        if (string.substring(5, 8).equals(sample)) {
            System.out.println("Совпало");
        } else {
            System.out.println("Не совпало");
        }
    }
}
