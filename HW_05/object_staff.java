package HW_java.git.HW_05;


import Lection05.online.Hero;

public class object_staff {

     private String name;
     private String position;
     private int phoneNumber;
     private int salary;
     private int age;

    public object_staff (String valuename, String valueposition, int valuephoneNumber, int valuesalary, int valueage) {
        name = valuename;
        position = valueposition;
        phoneNumber = valuephoneNumber;
        salary = valuesalary;
        age = valueage;
    }

    //Getter
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public int getSalary () {return salary; }
    public int getAge () {return age; }

    //Setter
    public void setSalary(int salary) {
        this.salary = salary;
    }












}

