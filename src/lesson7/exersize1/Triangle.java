package lesson7.exersize1;

public class Triangle implements Figure{

    ScannerMethod userData = new ScannerMethod();


    @Override
    public void square() {
        System.out.println("------------------------");
        System.out.println("Для выщета площади задайте Длинну и Ширину: ");
        System.out.println("Примем А за длинну, введите ее: ");
        int a = userData.scanner();
        System.out.println("Примем B за ширину, введите ее: ");
        int b = userData.scanner();
        int s = a * b;
        System.out.println("Площадь S ровна - " + s + "; Формула расчета - A * B = S .");
    }

    @Override
    public void perimeter() {
        System.out.println("------------------------");
        System.out.println("Для расчета периметра треугольника воспользуемся формулой: P = a + b + c");
        System.out.println("Где a, b, c - длина стороны");
        System.out.println("Введите а, b, c в такой последовательности - ");
        int a = userData.scanner();
        int b = userData.scanner();
        int c = userData.scanner();
        int p = a + b + c;
        System.out.println("Периметр треугольника равен - " + p);

    }
}
