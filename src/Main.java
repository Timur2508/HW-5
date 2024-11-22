import static java.time.LocalDate.ofYearDay;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");
        System.out.println("Задача №1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача №2");
        int clientOS1 = 0;
        int clientDeviceYear1 = 2013;
        if (clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear1 < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS1 == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
                if (clientDeviceYear1 < 2015) ;
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

            System.out.println("Задача №3");
            int year = 2024;
            boolean isLeapYear = ofYearDay(year, 1).isLeapYear();
            if (isLeapYear) {
                System.out.println(year + " год - високосный.");
            } else {
                System.out.println(year + " год - не високосный.");
            }

            System.out.println("Задача № 4");
            int deliveryDistance = 50;
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется один день для доставки");
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется два дня для доставки");
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется три дня для доставки");
            } else if (deliveryDistance > 100) {
                System.out.println("Доставка не осуществляется");
            }

            System.out.println("Задача № 5");
            int monthNumber = 12;
            switch (monthNumber) {
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                    System.out.println("Весна");
                    break;
                case 4:
                    System.out.println("Весна");
                    break;
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                    System.out.println("Лето");
                    break;
                case 7:
                    System.out.println("Лето");
                    break;
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                    System.out.println("Осень");
                    break;
                case 10:
                    System.out.println("Осень");
                    break;
                case 11:
                    System.out.println("Осень");
                    break;
                case 12:
                    System.out.println("Зима");
                    break;
                default:
                    System.out.println("Такого времени года  не существует");

            }

        }

    }
}