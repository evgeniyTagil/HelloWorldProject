package lesson6.homework.exersize1;

import java.util.Scanner;

import static lesson6.homework.exersize1.MainClass.menu;

public class CreditCard {
    private int accountNumber; //номер аккаунта
    private int sum; //сумма на счету
    private int paymentSum; //сумма введенная пользователем
    private int password; //пароль

    Scanner scanner = new Scanner(System.in);

    public CreditCard() {
    }

    public CreditCard(int password, int accountNumber, int sum) {
        this.accountNumber = accountNumber;
        this.sum = sum;
        this.password = password;
    }

    public void replenishment(Scanner scanner) { //метод пополнения счета #1
        System.out.println("Вы хотите пополнить счет?! 1 - да; 2 - вернутся назад");
        if (scanner.nextInt() == 1) {
            System.out.println("Введите сумму для пополения: ");
            paymentSum = scanner.nextInt();
            sum = sum + paymentSum;
            setSum(sum);
            System.out.println("Текущее состояние счета - " + getSum());
            System.out.println("---переход в меню---");
            menu();
        } else {
            System.out.println("---переход в меню---");
            menu();
        }
    }

    public void withdrawMoney() { //метод снятия денег #2
        System.out.println("Текущее состояние счета: " + getSum());
        System.out.println("Введите сумму которую хотите снять: ");
        paymentSum = scanner.nextInt();
        if (paymentSum <= sum) {
            System.out.println("Вы успешно сняли - " + paymentSum + "$");
            sum -= paymentSum;
        }
        System.out.println("Вы ввели не коректное значение");
        menu();
    }

    public void check() { //метод инфо о счете #3
        System.out.println("Ваш счет - " + getAccountNumber()+ "; Сумма на счету: " + getSum() + "$");
        menu();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getPassword() {
        return password;
    }
}
