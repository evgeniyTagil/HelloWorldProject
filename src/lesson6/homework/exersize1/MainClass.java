package lesson6.homework.exersize1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard creditCard = new CreditCard();
        creditCard.authorization();


        public static void authorization() {
            System.out.println("Введите номер счета для авторизации: ");
            CreditCard accountOne = new CreditCard(1111, 12345, 1000);
            CreditCard accountTwo = new CreditCard(2222, 54321, 2000);
            CreditCard accountTree = new CreditCard(3333, 24680, 5000);
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

        public static void menu() { //Меню
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
    }
}
