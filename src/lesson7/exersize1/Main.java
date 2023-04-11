package lesson7.exersize1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добрый день, следуйте инструкции: ");
        Figure[] figures = getPerimeter();
        for (Figure figure: figures){
            figure.perimeter();
        }
    }
    public static Figure[] getPerimeter(){
        Figure[] figures = new Figure[3];
        figures[0] = new Triangle();
        figures[1] = new Rectangle();
        figures[2] = new Circle();
        return figures;
    }
}
