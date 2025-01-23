class Student{
    int id;
    String name;
    double mark;
      Student(int id,String name,double mark){
        this.id=id;
        this.name=name;
        this.mark=mark;
    }
    void displayDetail(){
        System.out.println("Student ID: "+ id);
        System.out.println("Student name: "+ name);
        System.out.println("Student mark: "+ mark);

    }
    public static void main(String[] args) {
        Student student1 = new Student(1,"Sunny",60);
        Student student2 = new Student(2,"vicky",50);
        Student student3 = new Student(3,"buvanesh",65);
        student1.displayDetail();
        student2.displayDetail();
        student3.displayDetail();
    }
}