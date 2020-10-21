import java.util.Scanner;

public class HomeWork_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //TODO Задание 1
        int trycount = 3;

        while (true) {
            boolean wincode = false;
            int usernumb = randomNumber(0, 10);
            System.out.println("------------------------------");
            System.out.println("------------ИГРА1-------------");
            System.out.println("Загаданное число = " + usernumb);

            for (int i = 0; i < trycount; i++) {
                System.out.println("Попытка №" + (i + 1));
                System.out.println("Вввдеите число от 0 до 10");
                int a2 = in.nextInt();

                if (a2 == usernumb) {
                    wincode = true;
                }
                if (wincode) {
                    break;
                } else if (a2 < usernumb) {
                    System.out.println("Рандомное число больше");
                } else System.out.println("Рандомное число меньше");
            }
            if (wincode) {
                System.out.println("Ты Выйграл, УРА!");
            } else System.out.println("ЛУЗЕР, правильное число = " + usernumb);


            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int a3 = in.nextInt();
            if (a3 == 0) {
                System.out.println("УДАЧИ");
                break;
            }
        }

        //TODO Задание 2

        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int randWord = (int) (Math.random() * words.length);
        System.out.println("------------------------------");
        System.out.println("------------ИГРА2-------------");
        System.out.println("Загаданное слово  " + words[randWord]);

        StringBuilder answerWord = new StringBuilder("###############");
        while (true) {
            System.out.println("Введите слово:");
            String userWord = in.next();
            userWord = userWord.toLowerCase();

            if (userWord.equals(words[randWord])) {
                System.out.println("Ты Выйграл, УРА!");
                break;
            }

            int minl = Math.min(userWord.length(), words[randWord].length());

            for (int i = 0; i < minl; i++) {
                if (userWord.charAt(i) == words[randWord].charAt(i)) {
                    answerWord.setCharAt(i, words[randWord].charAt(i));
                }
            }

            System.out.println("Ваш ответ: " + answerWord);
        }

    }

    static int randomNumber(int from, int to) {
        int number = (int) (from + Math.random() * (to - from));
        return number;
    }

}