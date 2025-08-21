public class Employee {
    int roll_no;
    String Name;
    String studentClass;

    public Employee(int r, String n, String c) {
        roll_no = r;
        Name = n;
        studentClass = c;
        System.out.println("Roll_no: " + roll_no + " Name: " + Name + " Class: " + studentClass);
    }

    public Employee(Employee a) {
        roll_no = a.roll_no;
        Name = a.Name;
        studentClass = a.studentClass;
        System.out.println("Roll_no: " + roll_no + " Name: " + Name + " Class: " + studentClass);
    }

    public static void main(String args[]) {
        Employee e = new Employee(54, "Shrushti", "SY");
        Employee e1 = new Employee(e);
    }
}
