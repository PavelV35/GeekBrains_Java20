package lesson4;

import java.util.Scanner;

public class XO {
    public static char[][] MAP;
    private static boolean isInGame;
    private static int SIZE;
    private static final char USER = 'X';
    private static final char PC = 'O';
    private static final char DEFAULT = '_';

    static void fillMap(int size) {
        isInGame = true;
        MAP = new char[size][size];
        SIZE = size;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DEFAULT;
            }
        }
    }

    static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + "|");
            }
            System.out.println();
        }
    }

    static boolean move(int x, int y, char player) {
        try {
            if (MAP[x][y] == DEFAULT) {
                MAP[x][y] = player;
                return true;
            } else {
                return false;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    private static void moveAI() {

        int x = 0, y = 0;
        boolean pcWin = false;
        boolean playerWin = false;

        //Player
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (!isBusy(i, j)) {
                        MAP[i][j] = USER;
                        if (isVictory(USER)) {
                            x = i;
                            y = j;
                            playerWin = true;
                        }
                        MAP[i][j] = DEFAULT;
                    }
                }
            }

        //  PC
        if (!playerWin) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (!isBusy(i, j)) {
                    MAP[i][j] = PC;
                    if (isVictory(PC)) {
                        x = i;
                        y = j;
                        pcWin = true;
                    }
                    MAP[i][j] = DEFAULT;
                }
            }
        }
        }

        if (!pcWin && !playerWin) {
            for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        if (MAP[i][j] == DEFAULT) {
                            MAP[i][j] = PC;
                            return;
                        }
                    }
                }
        } else{
                MAP[x][y] = PC;
                return;
            }
            throw new IllegalArgumentException();
        }

        static boolean isBusy(int x, int y) {
            return MAP[x][y] != DEFAULT;
        }

        static boolean isRowVictory(char player) {
            int a;
            for (int i = 0; i < SIZE; i++) {
                a = 0;
                for (int j = 0; j < SIZE; j++) {
                    if (MAP[i][j] == player) {
                        a++;
                    }
                }
                if (a == SIZE) {
                    return true;
                }
            }
            return false;
        }

        static boolean isColumnVictory(char player) {
            int a;
            for (int i = 0; i < SIZE; i++) {
                a = 0;
                for (int j = 0; j < SIZE; j++) {
                    if (MAP[j][i] == player) {
                        a++;
                    }
                }
                if (a == SIZE) {
                    return true;
                }
            }
            return false;
        }

        static boolean isDiagonalVictory(char player) {
            int a1 = 0;
            int a2 = 0;
            for (int i = 0; i < SIZE; i++) {
                if (MAP[i][i] == player) {
                    a1++;
                }
                if (MAP[i][SIZE - 1 - i] == player) {
                    a2++;
                }
            }
            return (a1 == SIZE) || (a2 == SIZE);
        }

        static boolean isVictory(char player) {
            return isRowVictory(player) || isColumnVictory(player) || isDiagonalVictory(player);
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            fillMap(3);
            printMap();
            System.out.println("Игра крестики-нолики! Вы играете за Х Для того, чтобы совершить ход: введите номер строки и номер столбца");
            while (isInGame) {
                System.out.println("Ваш ход:");
                int x, y;
                try {
                    x = in.nextInt();
                    y = in.nextInt();
                } catch (Exception e) {
                    System.out.println("Введите корректные данные");
                    in.nextLine();
                    continue;
                }
                x--;
                y--;
                if (move(x, y, USER)) {
                    printMap();
                    if (isVictory(USER)) {
                        System.out.println("Вы победили!");
                        break;
                    }
                    try {
                        System.out.println("Ходит компьютер");
                        moveAI();
                        printMap();
                    } catch (Exception e) {
                        System.out.println("Ничья");
                        break;
                    }
                    if (isVictory(PC)) {
                        System.out.println("Вы проиграли!");
                        break;
                    }
                } else {
                    System.out.println("Введите корректные данные");
                }
            }

        }
    }
