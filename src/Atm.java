import java.util.Scanner;

public class Atm {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int[] money = new int[5001];

            money[1] = 10;  // инициализация суммы имеющих денег
            money[3] = 5;
            money[5] = 5;
            money[10] = 3;
            money[20] = 2;
            money[50] = 1;
            money[100] = 2;
            money[200] = 3;
            money[500] = 3;
            money[1000] = 2;
            money[5000] = 2;

            int[] output = new int[5001];

            System.out.println("Enter the amount : ");

            int n = input.nextInt();
            int n1 = n;
            int ans = check(money, output, n);

            if(ans == 0) {

                for (int i = 5000; i >= 1; i--) {

                    if (output[i] > 0)
                        System.out.println("You received : " + (i + " x " + output[i] + " "));
                }

                System.out.println(".");
            } else
                System.out.println("You can only cash out : " + (n1 - ans));
        }

        private static int check(int[] money,int [] output, int n) {

            for (int i = 5000; i >= 1; i--) {

                if (money[i] > 0) {

                    while (n >= i && money[i] > 0)
                    {
                        n -= i;
                        money[i]--;
                        output[i]++;
                    }
                }
            }
            return n;
        }
}

//    Написать программу на псевдокоде и перевести ее в код, которая бы выдавала доступную
//        запрашиваемую юзером сумму любой сомовой банкнотой включая монеты.
//        Количество купюр в банкомате → 1 сом - 10 монет, 3 - 5, 5 - 5, 10 - 3, 20 - 2, 50 - 1, 100 - 2, 200 - 3,
//        500 - 3, 1000 - 2, 2000 - 0, 5000 сомов - 2 купюры
//        Примеры:
//        I. Введите желаемую сумму: 7060
//        a. Вы получили 1 x 5000 2 x 1000 1 x 50 1 x 10.
//        b. Всего = 7060
//        II. Введите желаемую сумму: 9800
//        a. Вы можете снять только 9470
