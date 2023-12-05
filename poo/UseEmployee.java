package poo;

public class UseEmployee {
    
    public static void main(String[] args) {
        


    }

}

class Employee {

    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {

        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public String giveData() {
        return "The name's employee is " + name + ". " + age + " years old. And a salary of " + salary;
    }

}