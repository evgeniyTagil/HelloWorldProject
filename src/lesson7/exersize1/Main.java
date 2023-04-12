package lesson7.exersize1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Добрый день, следуйте инструкции: ");
        Figure[] figures = getFigure();
        for (Figure figure: figures){
            figure.perimeter();
        }
    }
    public static Figure[] getFigure(){
        Figure[] figures = new Figure[3];
        figures[0] = new Triangle();
        figures[1] = new Rectangle();
        figures[2] = new Circle();
        return figures;
    }
}
