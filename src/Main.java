//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int clientOS = 0; //задача 1
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientDeviceYear = 2016;  // задача 2
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        int year = 2021;  //задача 3
        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        int deliveryDistance = 95; //задача 4
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        } else {
            System.out.println("Доставки нет");
        }

        int monthNumber = 12; //задача 5
        if (monthNumber > 12) {
            System.out.println("Такого месяца не существует, попробуйте ввести заново");
        } else {
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Это зимний месяц");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Это весенний месяц");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Это летний месяц");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Это весенний месяц");
                    break;
                default:
                    System.out.println("Такого месяца не существует");
            }
        }
    }
}