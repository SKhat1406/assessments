// Write a program to create a class `Student` with attributes `name` and `rollNumber`. 
// Create a parameterized constructor to initialize these attributes.
//  Display the student details using the constructor.


public class Student {
    String name;
    int rollNumber;

   /*  public Student(){
           name="Sunny";             without parameter
           rollNumber=21;
        }*/

    public Student(String x,int y){
        name=x;
        rollNumber=y;
     }

    public static void main(String[] args) {
        //Student detail=new Student();            without paramater

        Student detail=new Student("SUNNY KUMAR",11);
        System.out.println("Student name:"+detail.name);
        System.out.println("Student Rollnumber:"+detail.rollNumber);
    }
}
