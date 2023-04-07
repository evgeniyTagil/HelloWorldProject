package lesson6.homework;

import java.util.Scanner;

public class CredicCard {
    private int accountNumber; //номер аккаунта
    private int sum; //сумма на счету
    private int userGetMoney; //сумма введенная пользователем
    private int password; //пароль

    Scanner scanner = new Scanner(System.in);

    public CredicCard() {
    }

    public CredicCard(int password, int accountNumber, int sum) {
        this.accountNumber = accountNumber;
        this.sum = sum;
        this.password = password;
    }

    public void authorization() {
        System.out.println("Введите номер счета для авторизации: ");
        CredicCard accountOne = new CredicCard(1111, 12345, 1000);
        CredicCard accountTwo = new CredicCard(2222, 54321, 2000);
        CredicCard accountTree = new CredicCard(3333, 24680, 5000);
        switch (scanner.nextInt()) {
            case 12345:
                System.out.println("Счет найден, пожалуйста введите пороль для авторизации: ");
                if (scanner.nextInt() == 1111) {
                    System.out.println("Вход выполнен успешно!");
                    accountOne.menu();
                }
                break;
            case 54321:
                System.out.println("Счет найден, пожалуйста введите пороль для авторизации: ");
                if (scanner.nextInt() == 2222) {
                    System.out.println("Вход выполнен успешно!");
                    accountOne.menu();
                    accountTwo.menu();
                }
                break;
            case 24680:
                System.out.println("Счет найден, пожалуйста введите пороль для авторизации: ");
                if (scanner.nextInt() == 3333) {
                    System.out.println("Вход выполнен успешно!");
                    accountOne.menu();
                    accountTree.menu();
                    break;
                }
            default:
                System.out.println("----------------------------------------------------");
                System.out.println("Не корректно введен номер счета, хотите продолжить?!");
                System.out.println("Что-бы повторить ввод нажмите - 1;");
                System.out.println("Что-бы завершить работу нажмите - 2;");
                System.out.println("----------------------------------------------------");
                if (scanner.nextInt() == 1) {
                    authorization();
                } else {
                    System.out.println("До новых встреч!");
                    break;
                }
        }
    }

    public void menu() { //Меню
        System.out.println("------------------------------------------------");
        System.out.println("Добрый день, веберете интересующий вас вариант: ");
        System.out.println("1 - что-бы пополнить счет");
        System.out.println("2 - снятие денег со счета");
        System.out.println("3 - чтобы просмотреть текущее состояние счета");
        System.out.println("4 - чтобы завершить работу");
        System.out.println("------------------------------------------------");
        switch (scanner.nextInt()) {
            case 1:
                replenishment(scanner);
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                check();
                break;
            case 4:
                System.out.println("Всего хорошего!");
                break;
            default: {
                System.out.println("Что-то пошло не так :( , попробуйте еще раз!");
                System.out.println("Wait...");
                menu();
            }
        }
    }

    public void replenishment(Scanner scanner) { //метод пополнения счета
        System.out.println("Вы хотите пополнить счет?! 1 - да; 2 - вернутся назад");
        if (scanner.nextInt() == 1) {
            System.out.println("Введите сумму для пополения: ");
            userGetMoney = scanner.nextInt();
            sum = sum + userGetMoney;
            setSum(sum);
            System.out.println("Текущее состояние счета - " + getSum());
            System.out.println("---переход в меню---");
            menu();
        } else {
            System.out.println("---переход в меню---");
            menu();
        }
    }

    public void check() {
        System.out.println("Ваш счет - " + getAccountNumber() + "; Сумма на счету: " + getSum() + "$");
        menu();
    }

    public void withdrawMoney() { //метод снятия денег
        System.out.println("Текущее состояние счета: " + getSum());
        System.out.println("Введите сумму которую хотите снять: ");
        userGetMoney = scanner.nextInt();
        if (userGetMoney <= sum) {
            System.out.println("Вы успешно сняли - " + userGetMoney + "$");
            sum -= userGetMoney;
        }
        System.out.println("Вы ввели не коректное значение");
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
}
