import java.util.Scanner;

public class AdditionalFirst {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Еnter the amount :");

        int n = input.nextInt();

        double percent50 = 0.5;
        double percent30 = 0.3;
        double percent20 = 0.2;

        calc(n, percent50, percent30, percent20);
    }

    private static void calc(int n, double percent50, double percent30, double percent20) {
        if (n > 0) {
            double result;
            result = n * percent50;
            System.out.println("50% of salary :" + " " + result);

            double bonus = result * 0.05;
            System.out.println("your 5% bonus :" + " " + bonus);

            double result2;
            result2 = n * percent30;
            System.out.println("30% of salary :" + " " + result2);

            double bonus2 = result2 * 0.08;
            System.out.println("your 8% bonus :" + " " + bonus2);

            double result3;
            result3 = n * percent20;
            System.out.println("20% of salary :" + " " + result3);

            double bonus3 = result3 * 0.10;
            System.out.println("your 10% bonus :" + " " + bonus3);

            double total;
            total = (n + bonus + bonus2 + bonus3);

            System.out.println("Total your salary with bonuses :" + " " + total);
        } else
            System.out.println("Please enter the amount : ");
    }
}

//    Написать программу-калькулятор годового бонуса к зарплате по следующей формуле:
//        Сотрудник зарабатывает X сомов в год. Компания прибавляет бонус 5 процентов от 50
//        процентов годовой зарплаты, 8 процентов бонуса от 30 процентов годовой зарплаты и 10
//        процентов от 20 процентов годовой зарплаты. Необходимо чтоб ваша программа
//        просчитывала сумму годового бонуса от любой введенной юзером годовой заработной
//        платы.
