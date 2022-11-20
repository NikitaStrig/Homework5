public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 - 2");
        int clientOS = 0;
        int clientDeviceYear = 2003;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("Задание 3");
        int year = 2401;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является весокосным");
        } else {
            System.out.println(year + " не является весокосным");
        }
        System.out.println("Задание 4");
        int deliveryDistance = 160;
        int deliverTime = 1;
        if (deliveryDistance > 0) {
            deliverTime += (deliveryDistance + 20) / 40;
            System.out.println("Доставка займет " + deliverTime);
        } else {
            System.out.println("Доставка не возможна");
        }


        System.out.println("Задание 5");
        int monthNumber = 13;
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
            case 7:
                System.out.println("Лето");
            case 8:
                System.out.println("Лето");
            case 9:
                System.out.println("Осень");
            case 10:
                System.out.println("Осень");
            case 11:
                System.out.println("Осень");
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца нет");

        }

    }
}
