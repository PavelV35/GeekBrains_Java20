import java.util.Arrays;

public class HomeWork_02 {
    public static void main(String[] args) {
        //TODO Задание 1
        int [] ar1 = {1,1,0,0,1,0,1,1,0,0};
        System.out.println("Первоночальный массив 1 " + Arrays.toString(ar1));

        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] ==1) {
                ar1[i]=0;
            }
            else {
                ar1[i] = 1;
            }
        }
        System.out.println("Измененный массив 1     " + Arrays.toString(ar1));

        //TODO Задание 2
        System.out.println(" ----------- ");
        int [] ar2 = new int[8];
        for (int i = 1; i < ar2.length; i++) {
            ar2[i]=ar2[i-1]+3;
        }
        System.out.println("Массив 2     " + Arrays.toString(ar2));

        //TODO Задание 3
        System.out.println(" ----------- ");
        int [] ar3 =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Первоночальный массив 3 " + Arrays.toString(ar3));
        for (int i = 0; i < ar3.length; i++) {
            if(ar3[i]<6) {
                ar3[i]*=2;
            }
        }
        System.out.println("Измененный массив 3     " + Arrays.toString(ar3));

        //TODO Задание 4
        System.out.println(" ----------- ");
        int kol = 9;
        int [][] ar4= new int[kol][kol];
        for (int i = 0; i < ar4.length; i++) {
            ar4[i][i] =1;
            ar4[i][ar4.length - 1 - i] = 1;
        }
        System.out.println("Массив 4");
        for (int[] i : ar4) System.out.println(Arrays.toString(i));

        //TODO Задание 5
        System.out.println(" ----------- ");

        int[] ar5 = new int[15];
        for (int i = 0; i < ar5.length; i++) ar5[i] = (int) (Math.random() * 1000);
        System.out.println("Массив 5  " + Arrays.toString(ar5));

        Arrays.sort(ar5);
        int max = ar5[ar5.length - 1];
        int min = ar5[0];

        System.out.println("Max  " + max);
        System.out.println("Min  " + min);

        //TODO Задание 6
        System.out.println(" ----------- ");

        int[] ar6 = {2, 2, 2, 1, 2, 2, 10, 1}; //true

        if (check(ar6)) {
            System.out.println("Cумма левой и правой части массива равны");
        } else {
            System.out.println("Cумма левой и правой части массива НЕ равны");
        }

        //TODO Задание 7
        System.out.println(" ----------- ");

        int[] ar8 = {1, 2, 3, 4,5,6,7};
        System.out.println("Первоночальный массив  " + Arrays.toString(ar8));
        shift(ar8, -1);
        System.out.println("Измененный массив      " + Arrays.toString(ar8));

    }

    public static boolean check(int[] ar7) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < ar7.length - 1; i++) {
            sum1 += ar7[i];
            for (int j = i + 1; j < ar7.length; j++) {
                sum2 += ar7[j];
            }
            if (sum1 == sum2) {
                return true;
            }
            sum2 = 0;
        }
        return false;
    }

    public static void shift(int[] ar9, int a) {
        if (a > 0) {
            for (int n = 0; n < a; n++) {
                int temp = ar9[0];
                ar9[0] = ar9[ar9.length - 1];
                for (int j = 1; j < ar9.length - 1; j++) {
                    ar9[ar9.length - j] = ar9[ar9.length - j - 1];
                }
                ar9[1] = temp;
            }
        } else {
            for (int n = 0; n > a; n--) {
                int temp = ar9[ar9.length - 1];
                ar9[ar9.length - 1] = ar9[0];
                for (int j = 1; j < ar9.length - 1; j++) {
                    ar9[j - 1] = ar9[j];
                }
                ar9[ar9.length - 2] = temp;
            }
        }
    }
}
