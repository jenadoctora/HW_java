package HW_java.git.HW06;

public class cat extends pet {

    public cat (String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance >= 200)
        System.out.println(name + " пробежала " + distance + " м");
    }

    @Override
    public void swim( int distance) {
        if (distance > 0) {
            System.out.println(name + " не умеет плавать");
    }
}}
