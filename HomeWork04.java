package HW_java.git;

import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {


    public static void main(String[] args) {

        createMap();
        showMap();


        while (true) {
            humanTurn();
            showMap();
            if (isWin(human)) {
                System.out.println("Human win!!!");
                break;
            }

            if (isDraw()) {
                System.out.println("Is Draw!!!");
                break;
            }

            aiTurn();
            showMap();

            if (isWin(ai)) {
                System.out.println("AI win!!!");
                break;
            }

            if (isDraw()) {
                System.out.println("Is Draw!!!");
                break;
            }
        }
        System.out.println("Game over!");
    }


    public static char[][] map;
    public static int mapSizeX;
    public static int mapSizeY;
    public static int  winLength = mapSizeX;

    public static char human = '0';
    public static char ai = 'X';
    public static char empty_field = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createMap() {
        System.out.println("Enter the size of the field" + ":");

        mapSizeY = scanner.nextInt();
        mapSizeX = scanner.nextInt();
        map = new char[mapSizeY][mapSizeX];

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                map[y][x] = empty_field;
            }
        }
    }

    public static void showMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("--------------");
    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Enter your turn coordinates from 1 before " + mapSizeX + ":");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        map[y][x] = human;
    }

    public static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(mapSizeX); //[0;mapSize)
            y = random.nextInt(mapSizeY);
        } while (!isEmptyCell(x, y));
        System.out.println("AI turn is [" + (y + 1) + ":" + (x + 1) + "]");
        map[y][x] = ai;
    }

    public static boolean isValidCell(int x, int y) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public static boolean isEmptyCell(int x, int y) {
        return map[y][x] == empty_field;
    }

    public static boolean isDraw() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[y][x] == empty_field) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


//    public static boolean isWin(char player) {
//        int z = 0;
//        if (z != mapSizeY) {
//            z = 0;
//            for (int y = 0; y < mapSizeY; y++) {
//                for (int x = 0; x < mapSizeX; x++) {
//                    if (map[y][x] == player) {
//                        z++;
//                        if (z == mapSizeY) return true;
//                    }
//                }
//            }
//        } else {
//            z = 0;
//            for (int y = 0; y < mapSizeY; y++) {
//                if (map[y][map.length - 1 - y] == player) {
//                    z++;
//                    if (z == mapSizeY) return true;
//                }
//            }
//        }
//        return false;
//    }


    // проверка на победу
    public static boolean isWin(int player) {
        for (int i = 0; i < mapSizeX; i++) {     // ползём по всему полю
            for (int j = 0; j < mapSizeY; j++) {
                if (checkVector(i, j, 1, 0, mapSizeX, player)) {
                    return true;    // проверим линию по х
                }
                if (checkVector(i, j, 1, 1, mapSizeX, player)) {
                    return true;    // проверим по диагонали х у
                }
                if (checkVector(i, j, 0, 1, mapSizeX, player)) {
                    return true;    // проверим линию по у
                }
                if (checkVector(i, j, 1, -1, mapSizeX, player)) {
                    return true;    // проверим по диагонали х -у
                }
            }
        }
        return false;
    }

    // проверка линии
    public static boolean checkVector(int x, int y, int vx, int vy, int len, int player) {
        int farX = x + (len - 1) * vx;    // посчитаем конец проверяемой линии
        int farY = y + (len - 1) * vy;
        if (!isValidCell(farX, farY)) {
            return false;    // проверим не выйдет-ли проверяемая линия за пределы поля
        }
        for (int i = 0; i < len; i++) {    // ползём по проверяемой линии
            if (map[y + i * vy][x + i * vx] != player) {
                return false;    // проверим одинаковые-ли символы в ячейках
            }
        }
        return true;
    }



//       if (map[0][0] == player && map[0][1] == player && map[0][2] == player) return true;
//        if (map[1][0] == player && map[1][1] == player && map[1][2] == player) return true;
//        if (map[2][0] == player && map[2][1] == player && map[2][2] == player) return true;
//
//        if (map[0][0] == player && map[1][0] == player && map[2][0] == player) return true;
//        if (map[0][1] == player && map[1][1] == player && map[2][1] == player) return true;
//        if (map[0][2] == player && map[1][2] == player && map[2][2] == player) return true;
//
//        if (map[0][0] == player && map[1][1] == player && map[2][2] == player) return true;
//        if (map[0][2] == player && map[1][1] == player && map[2][0] == player) return true;
//
//        return false;

//    public static void createMap(int sizeX, int sizeY) {
//        mapSizeX = sizeX;
//        mapSizeY = sizeY;
//        map = new char[mapSizeY][mapSizeX];
//    }

}