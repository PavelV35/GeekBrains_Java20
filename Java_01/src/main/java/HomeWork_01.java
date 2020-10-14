import java.util.Scanner;

public class HomeWork_01 {
    public static void main(String[] args) {
        //TODO задание 2
        byte b_max = Byte.MAX_VALUE;
        short s_max = Short.MAX_VALUE;
        int i_max = Integer.MAX_VALUE;
        long l_max = Long.MAX_VALUE;
        float f_max = Float.MAX_VALUE;
        double d_max = Double.MAX_VALUE;
        System.out.println(b_max + " " + s_max + " " + i_max + " " + l_max + " " + f_max + " " + d_max);

        char sym = 'a';
        boolean bool = true;

        //TODO задание 3
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа a,b,c,d");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        System.out.println("a*(b+(c/(d)) = " + calculate(a, b, c, d));
        //

        //TODO задание 4
        System.out.println("Введите числа a1,b1");
        int a1 = in.nextInt(), b1 = in.nextInt();
        System.out.println("Удовлетворяет условию 10<=(a1+b1)<=20) ? " + compare(a1, b1));

        //TODO задание 5
        System.out.println("Введите число a2");
        int a2 = in.nextInt();
        posOrNeg(a2);

        //TODO задание 6
        System.out.println("Число а2 отрицательное? " + isNeg(a2));

        //TODO задание 7
        stroka("Павел");

        //TODO задание 8
        System.out.println("Введите год для проверки");
        int myear = in.nextInt();
        vYear(myear);
    }

    public static double calculate(int a, int b, int c, int d) {
        return a * (b + (c / (double) d));
    }

    public static boolean compare(int a1, int b1) {
        return (a1 + b1) >= 10 && (a1 + b1) <= 20;
    }

    public static void posOrNeg(int a2) {
        if (a2 >= 0) {
            System.out.println("Число " + a2 + " - положитнельное");
        } else {
            System.out.println("Число " + a2 + " - отрицательное");
        }
    }

    public static boolean isNeg(int a2) {
        return a2 < 0;
    }

    public static void stroka(String st) {
        System.out.println("\"Привет, " + st + "!\"");
    }

    public static void vYear(int myear) {
        if ((myear % 4 == 0) && !(myear % 100 == 0) || (myear % 400 == 0)) {
            System.out.println("ГОД Високосный");
        } else {
            System.out.println("ГОД НЕ Високосный");
        }
    }
}
