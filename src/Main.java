public class Main {
    public static void main(String[] args) {

        // Задание №1, №2
        byte clientOS = 0;
        int clientDeviceYear = 2016;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченую версию приложения для iOS по ссылке");
            }
            else
                System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченую версию приложения для Android по ссылке");
            }
            else
                System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание №3
        int year = 2022;
        int yearDevide4 = year % 4;         //Является високосным
        int yearDevide100 = year % 100;     //Не является високосным, исключение х1000
        int yearDevide1000 = year % 1000;   //Является високосным

        if (yearDevide100 == 0 && yearDevide1000 != 0) {
            System.out.println(year + " не является високосным");
        }
        else if (yearDevide1000 == 0 || yearDevide4 == 0) {
            System.out.println(year + " является високосным");
        }
        else {
            System.out.println(year + " не является високосным");
        }

        //Задание №4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: 1");
        }
        else if (deliveryDistance < 60){
            System.out.println("Потребуется дней: 2");
        }
        else {
            System.out.println("Потребуется дней: 3");
        }

        //Задание №5
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }

        //Задание №6
        int age = 19;
        float salary = 48_000f;
        int creditAge = 1;
        float creditSalary = 1f;

        if (age < 23) {
            creditAge = 2;
        } else {
            creditAge = 3;
        }

        if (salary >= 80_000) {
            creditSalary = 1.5f;
        } else if (salary >= 50_000) {
            creditSalary = 1.2f;
        } else {
            creditSalary = 1f;
        }

        float limit = salary * creditAge * creditSalary;
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");

        //Задание №7
        age = 25;
        salary = 60_000f;
        int wantedSum = 330_000;
        float baseRate = 10f;
        float rate;
        float rateSum;
        float paymentMax = salary * 0.5f;

        if (age < 23) {
            rate = baseRate + 1f;
        } else if (age < 30) {
            rate = baseRate + 0.5f;
        } else {
            rate = baseRate;
        }

        if (salary > 80_000) {
            rate = rate - 0.7f;
        } else {
            rate = rate;
        }

        rateSum = wantedSum * (1 + rate/100f);
        float payment = rateSum/12f;
        String approval;

        if (payment <= paymentMax) {
            approval = "Одобрено.";
        } else {
            approval = "Отказано.";
        }

        System.out.println("Максимальный платеж при зарплате " + salary + " равен " + paymentMax + " рублей.");
        System.out.println("Платеж по кредиту " + payment + " рублей. " + approval);

    }
}