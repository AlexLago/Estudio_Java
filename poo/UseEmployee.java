package poo;

import java.util.ArrayList;
import java.util.Iterator;

public class UseEmployee {
    
    public static void main(String[] args) {
        
        /*Employee employeeList[] = new Employee[3];

        employeeList[0] = new Employee("Ana", 45, 2500);
        employeeList[1] = new Employee("Antonio", 55, 2000);
        employeeList[2] = new Employee("María", 25, 2600);
        */

        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        //employeeList.ensureCapacity(employeeList.size());

        employeeList.add(new Employee("Ana", 45, 2500));
        employeeList.add(new Employee("Antonio", 55, 2000));
        employeeList.add(new Employee("María", 25, 2600));

        employeeList.set(0, new Employee("Carlos", 29, 2300));
        System.out.println(employeeList.get(2).giveData());

        //employeeList.trimToSize();

        System.out.println(employeeList.size());

        Iterator <Employee> myIterador = employeeList.iterator();

        while (myIterador.hasNext()) {
            System.out.println(myIterador.next().giveData());
        }

        for (Employee e : employeeList) {
            System.out.println(e.giveData());
        }
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