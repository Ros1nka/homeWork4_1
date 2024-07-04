public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 8");
        int salary = 29000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = sum + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();

        System.out.println("Задача 9");
        int salaryEx9 = 29000;
        double sumEx9 = 0;
        for (int i = 1; i <= 12; i++) {
            sumEx9 = sumEx9 + sumEx9 * 0.01;
            sumEx9 = sumEx9 + salaryEx9;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumEx9 + " рублей");
        }
        System.out.println();

        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}