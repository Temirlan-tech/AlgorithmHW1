import java.util.Scanner;

public class AdditionalThird {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число : ");

        int size = scanner.nextInt();
        int s = 0;
        int sum = 0;

        for (int i = 1; i <= size ; i++) {
            s = s*10+1;
            System.out.println(s + " ");
            sum = sum + s;
        }
        System.out.println("Результат " + sum);
    }
}

//    Написать программу, которая бы подсчитывала сумму следующей цепочки 1 +11 + 111
//        +1111 + … n. Пользователь вводит количество элементов в цепочке.
//        Пример:
//        Введите количество элементов: 5
//        Результат:
//        1 + 11 + 111 + 1111 + 11111
//        Сумма: 1234



