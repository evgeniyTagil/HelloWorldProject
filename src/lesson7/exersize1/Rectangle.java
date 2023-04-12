package lesson7.exersize1;

import java.util.Scanner;

public class Rectangle implements Figure{
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
        System.out.println("Для расчета периметра прямоугольника воспользуемся формулой: P = 2 × (a + b)");
        System.out.println("a, b - стороны прямоугольника");
        System.out.println("Введите а, b в такой последовательности - ");
        int a = userData.scanner();
        int b = userData.scanner();
        int two = 2;
        int p = two * (a + b);
        System.out.println("Периметр P равен - " + p);

    }
}
