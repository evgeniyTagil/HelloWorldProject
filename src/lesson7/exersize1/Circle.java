package lesson7.exersize1;

public class Circle implements Figure{

    double pi = 3.14;
    ScannerMethod userData = new ScannerMethod();
    @Override
    public void square() {
        System.out.println("------------------------");
        System.out.println("Для расчета площади круга введите радиус (R) круга: ");
        int r = userData.scanner();
        System.out.println("Для расчета площади мы воспользуемся формулой: S = π * r2");
        double s = pi * (r * r);
        System.out.println("Площадь круга ровна - " + s);
    }

    @Override
    public void perimeter() {
        System.out.println("------------------------");
        System.out.println("Для расчета периметра круга введите радиус (R) круга: ");
        int r = userData.scanner();
        System.out.println("Для расчета периметра мы воспользуемся формулой: C = 2 * π * r");
        int two = 2;
        double c = two * pi * r;
        System.out.println("Периметр круга ровна - " + c);
    }
}
