package object_class;

public class Employee1 {

    int id;
    String name;
    float salary;
    String department;

    public Employee1(int id, String name, float salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "id:" + id + " name:" + name + " salary:" + salary + " department:" + department;
    }

    public static void main(String[] args) {
    	Employee1 e=new Employee1(101,"Dinga",10000,"Forest");

        Employee1[] employee = new Employee1[3];
        employee[0]=e;
        employee[1]=new Employee1(102,"Dingi",20000,"Medico");
        employee[2]=new Employee1(102,"Dunga",20000,"Engineer");

        // ✅ print using for loop
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
}
