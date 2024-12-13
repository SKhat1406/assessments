/*Create a class `Employee` with the following attributes:
- `name` (String)
- `salary` (double)

Write a default constructor that sets default values for the attributes. 
Write another parameterized constructor to accept user-defined values. Test both constructors in the `main` method.
*/


public class Employee {
    String name;
    double salary;

    public Employee(){
        name="sunny";
        salary=80000;
    }

    public Employee(String x,double y){
        name=x;
        salary=y;
    }

    public static void main(String[] args) {
        Employee obj=new Employee();
        Employee obj1=new Employee("kumar",70000);

        System.out.println("---------Constructor without paramater-------");
        System.out.println("Employee details:");
        System.out.println("Name:"+obj.name);
        System.out.println("Salery:"+obj.salary);

        System.out.println("---------Constructor with paramater-------");
        System.out.println("Employee details:");
        System.out.println("Name:"+obj1.name);
        System.out.println("Salery:"+obj1.salary);
    }
}
