// Overloading constructor concept
public class Student1 {
    int roll;
    String name;
    int marks;

    
    public Student1() {
        roll = 54;
        name = "Shrushti";
        marks = 20;
        System.out.println("Roll_No: " + roll + " Name: " + name + " Marks: " + marks);
    }

    
    public Student1(int r) {
        roll = r;
        System.out.println("Roll_No: " + roll);
    }

    
    public Student1(int r, String n) {
        roll = r;
        name = n;
        System.out.println("Roll_No: " + roll + " Name: " + name);
    }

    
    public Student1(int r, String n, int m) {
        roll = r;
        name = n;
        marks = m;
        System.out.println("Roll_No: " + roll + " Name: " + name + " Marks: " + marks);
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1(12);
        Student1 s3 = new Student1(33, "Arohi");
        Student1 s4 = new Student1(59, "Ishwari", 23);
    }
}
