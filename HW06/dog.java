package HW_java.git.HW06;

public class dog extends pet {

    public dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 500)
            System.out.println(name + " пробежала " + distance + " м");
    }


    @Override
    public void swim(int distance) {
        System.out.println(name + " проплыла " + distance + " м");
    }




}
