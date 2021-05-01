public class HW03 {

    public static void main(String[] args) {

        invertArray();
        System.out.println("*************");
        fillArray();
        System.out.println("*************");
        changeArray();
        System.out.println("\t");
        fillDiagonal();

    }

    public static void invertArray() {


        //  1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//  С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};


        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1) {
                myArray[i] = 0;
            } else {
                myArray[i] = 1;
            }
            System.out.print(myArray[i] + " ");


        }
        System.out.println();

    }

//  2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;


    public static void fillArray() {

        int[] Array = new int[100];
        for (int x = 0; x < Array.length; x++) {

            System.out.print(x + 1 + Array[x] + " ");
        }
        System.out.println();
    }


//     3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void changeArray() {

        int[] newArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < 6) {
                newArray[i] = newArray[i] * 2;
            }
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }

//  4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//  и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//  Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];


    public static void fillDiagonal() {

        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] Method(int len, int initValue) {
        int[] returnArray = new int[len];
        for (int i = 0; i < returnArray.length; i++) {
            returnArray[i] = initValue;
        }

        return returnArray;


    }

    public static int[] returnArray(int len, int initValue) {
        int[] tempArray = new int[len];

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initValue;
        }
        return tempArray;
    }
}

