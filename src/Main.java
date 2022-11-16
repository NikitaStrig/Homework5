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
        int year = 2021;
        System.out.println("Задание 4");
        int deliveryDistance = 45;
        int deliveryDey = 0;
        if (deliveryDistance < 20) {
            deliveryDey = deliveryDey + 1;
            System.out.println("Потребуется дней: " + deliveryDey);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDey = deliveryDey + 2;
            System.out.println("Потребуется дней: " + deliveryDey);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDey = deliveryDey + 3;
            System.out.println("Потребуется дней: " + deliveryDey);
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
