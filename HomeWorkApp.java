public class HomeWorkApp {

    public static void main(String[] args) {

  //      printThreeWords();
 //       checkSumSign();
 //       printColor();
 //       compareNumbers();

//        if (between10and20(5, 5)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//
//        System.out.println("*****************");
//
//        positiveOrNegative(0);
//
//        System.out.println("*****************");
//
//        System.out.println(negativeIntegerNumber (-5));
//
//        System.out.println("*****************");
//
//        someText ( "Я люблю учится новому", 10);




//  1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//  С помощью цикла и условия заменить 0 на 1, 1 на 0;

       invertArray();
       System.out.println("*************");
       fillArray();
       System.out.println("*************");
       changeArray();
        System.out.println("\t");
        fillDiagonal();




}

    public static void invertArray() {

        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};


        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1)
            {
                myArray[i] = 0;
            } else {
                myArray[i] = 1;
            }
            System.out.print(myArray[i] + " ");


        }

    }

//  2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;


    public static void fillArray(){

    int[] Array = new int[100];
     for (int x = 0; x < Array.length; x++) {

        System.out.print(x + 1 + Array[x]+ " ");
    }}



//     3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void changeArray(){

    int[] newArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < newArray.length; i++) {
        if (newArray[i] < 6)
        { newArray[i] = newArray[i] * 2;
        }
        System.out.print(newArray[i] + " ");
    }
}

//  4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//  и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//  Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];


    public static void fillDiagonal(){

        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j) { arr[i][j] = 1;
                } else {arr[i][j] = 0;}
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }




}










//    public static void printThreeWords(){
//
//        System.out.println("_Orange");
//        System.out.println("_Banana");
//        System.out.println("_Apple");
//    }

//    public static void checkSumSign(){
//
//        int a = 35;
//        int b = -147;
//        int result;
//        result = a + b;
//
//        if ( result >= 0) {
//            System.out.println("Сумма положительная");
//
//        } else {
//
//            System.out.println("Сумма отрицательная");
//
//        }
//
//    }
//
//    public static void printColor(){
//
//        int value = 100;
//
//        if (value <= 0) {
//
//            System.out.println("Красный");
//        }
//        if (value > 0 && value <= 100) {
//
//            System.out.println("Желтый");
//        }
//        if (value > 100) {
//
//            System.out.println("Зеленый");
//        }
//
//    }

//    public static void compareNumbers() {
//
//        int a = 15;
//        int b = 15;
//        if (a >= b) {
//
//            System.out.println("a >= b");
//    } else {
//            System.out.println("a < b");
//        }
//    }




//  1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
//     от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

//    public static boolean between10and20 (int a, int b) { return (a + b)>= 10 && (a + b) <= 20; }

//    2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

//    public static void positiveOrNegative (int a) {
//        if ( a >= 0) {
//            System.out.println("positive");
//        } else {
//            System.out.println("negative");
//        }
//    }

//    3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
//    отрицательное, и вернуть false если положительное.

//    public static boolean negativeIntegerNumber ( int a) {
//        if ( a < 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
//    указанную строку, указанное количество раз;

//    public static void someText (String text, int a ) {
//
//        for (int y = 1; y < a; y++) {
//                System.out.println(text + "\t");
//            }
//        }









