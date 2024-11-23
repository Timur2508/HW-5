public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");

        System.out.println("Задача №1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача №2 ");
        int clientOS1 = 1;
        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015 && clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание №3 ");
        int year = 2016;
        boolean isLeapYear = year % 400 == 0 || year % 4 == 0;

        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задание № 4");
        int deliveryDistance = 115;
        int numberDays = deliveryDistance / 20;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + numberDays + " для доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + numberDays + " для доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + numberDays + " для доставки");
        } else {
            System.out.println("Доставка не осуществляется");
        }

        System.out.println("Задание № 5");
        int monthNumber = 7;

        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого времени года  не существует");

        }
    }
}




