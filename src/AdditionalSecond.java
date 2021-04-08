import java.util.Scanner;

public class AdditionalSecond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово : ");

        String s = scanner.next();

        int size = s.length();

        if (size % 2 == 1) {

            int middle = (size + 1) / 2;  // middle = 3

            for (int i = middle - 2; i <= middle; i++)  // i = 4

                System.out.print(s.charAt(i));
        } else {

            for (int i = 0; i < size - 2; i++) {

                System.out.print(s.charAt(i));
            }
        }
    }

}




//    Написать программу, которая должна считывать введенное юзером слово и если длинна
//    слова состоит из нечетного количества букв, то программа должна распечатать только 3
//        буквы из середины слова. Если слово состоит из четного количества букв то необходимо
//        распечатать введенное слово без последних двух букв.
//        Примеры:
//        I. Введите слово:
//        test
//        Результат:
//        te
//        II. Введите слово:
//        Chicago
//        Результат:
//        Ica
