package Labs;
// Assignment-3. 
// • Create a Java Bean Class Student.  
// • Add three attributes ;
// • private String name;  
// • private int age; 
// • private String department; 
// • Add a constructor that takes all three attributes as parameters. 
// • Add setter and getter methods Site home 
// • Compile the program

class StudentsInfo{
    //Variables declare
    private String name;
    private int age;
    private String department ;

    //Constructor
    //Setter method
    public StudentsInfo(String name , int age ,String department){
        this.name = name;
        this.age = age;
        this.department = department;
    }

    //Getter method
    public void getStudents(){
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Department :" + department);
    }
}

public class Class {
   public static void main(String[] args) {
    StudentsInfo student1 = new StudentsInfo("Riya", 21, "CSE");
    student1.getStudents();  
   }
}
