package HW_java.git.HW06;

import Lection05.online.Hero;

public abstract class pet {


    public String name;

    public pet(String name) {
        this.name = name;
    }


    public abstract void run(int distance);

    public abstract void swim(int distance);

}
