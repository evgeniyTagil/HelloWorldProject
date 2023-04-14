package lesson8.homework.ex1;

public class MainClass {
    public static void main(String[] args) {
        Phone iphone = new Phone("Татьяна", 375333333, "Iphone 14", 300);
        Phone samsung = new Phone("Евгений", 375777777, "Samsung Galaxy", 350);
        Phone pixel = new Phone("Ефрасим", 375000000, "Google Pixel 6Pro", 320);

        System.out.println(iphone.receiveCall() + '\n' + samsung.receiveCall() + '\n'
                + pixel.receiveCall());
        System.out.println("-------------------------------------");
        System.out.println("Перегруженный метод: ");
        System.out.println(iphone.receiveCall(iphone.getName(), iphone.getNumber()) +
                '\n' + samsung.receiveCall(samsung.getName(), samsung.getNumber()) + '\n'
                + pixel.receiveCall(pixel.getName(), pixel.getNumber()));
    }
}