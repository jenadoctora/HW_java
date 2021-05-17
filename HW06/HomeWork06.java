package HW_java.git.HW06;

import HW_java.git.HW06.cat;
import HW_java.git.HW06.dog;

import java.util.Random;

public class HomeWork06 {

    private static Random random = new Random();

    public static void main (String[] args){

        cat cat = new cat("Бусинка");
        dog dog = new dog("Берта");


        cat.run (200);
        dog.run(300);

        cat.swim (200);
        dog.swim(300);

    }
}
