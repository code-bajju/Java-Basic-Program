class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class MyCustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Bajju = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Bajju
        Bajju.id = 12;
        Bajju.salary = 34;
        Bajju.name = "CodeWithBajju";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Khandelwal";

        // Printing the Attributes
        Bajju.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        // System.out.println(Bajju.id);
        // System.out.println(Bajju.name);
    }
}
