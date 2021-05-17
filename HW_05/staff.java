package HW_java.git.HW_05;

import java.util.Scanner;

public class staff {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        object_staff staff1 = new object_staff ( "Silvia", "tester", 89989898, 50000, 34);
        object_staff staff2 = new object_staff ( "Oleg", "tester", 89989898, 30000, 40);
        object_staff staff3 = new object_staff ( "Olga", "tester", 89989898, 25000, 56);
        object_staff staff4 = new object_staff ( "Vera", "tester", 89989898, 50000, 43);
        object_staff staff5 = new object_staff ( "Alex", "tester", 89989898, 50000, 20);


        System.out.println(staff1.getName());
        System.out.println(staff1.getPosition());
        System.out.println(staff1.getAge());
        System.out.println();

        System.out.println(staff2.getName());
        System.out.println(staff2.getPosition());
        System.out.println();



        object_staff[] myArray = new object_staff[5];
        myArray[0]=staff1;
        myArray[1]=staff2;
        myArray[2]=staff3;
        myArray[3]=staff4;
        myArray[4]=staff5;

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i].getAge()>40) {
                System.out.println("Имя:"+ myArray[i].getName());
                System.out.println("Должность:"+ myArray[i].getPosition());
                System.out.println("Телефон:"+ myArray[i].getPhoneNumber());
                System.out.println("Зарплата:"+ myArray[i].getSalary());
                System.out.println("Возраст:"+ myArray[i].getAge());
                System.out.println();
            }
        }

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i].getAge()>35) {
                int a = myArray[i].getSalary();
                a += 10000;
               myArray[i].setSalary(a);

                System.out.println("Имя:"+ myArray[i].getName());
                System.out.println("Должность:"+ myArray[i].getPosition());
                System.out.println("Телефон:"+ myArray[i].getPhoneNumber());
                System.out.println("Зарплата:"+ myArray[i].getSalary());
                System.out.println("Возраст:"+ myArray[i].getAge());
                System.out.println();
            }
        }


    }
}
