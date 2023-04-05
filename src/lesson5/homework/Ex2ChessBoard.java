package lesson5.homework;

public class Ex2ChessBoard {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
