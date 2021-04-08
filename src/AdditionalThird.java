import java.util.Scanner;

public class AdditionalThird {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число : ");

        int s = scanner.nextInt();

        System.out.println("Результат : " + summation(s));
    }

    private static int summation(int s) {

        int sum;

        sum = (int)(Math.pow(10, s + 1) -
                10 - (9 * s)) / 81;
        return sum;
    }
}

//    Написать программу, которая бы подсчитывала сумму следующей цепочки 1 +11 + 111
//        +1111 + … n. Пользователь вводит количество элементов в цепочке.
//        Пример:
//        Введите количество элементов: 5
//        Результат:
//        1 + 11 + 111 + 1111 + 11111
//        Сумма: 1234



