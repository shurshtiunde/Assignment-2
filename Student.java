//program using this keyword

public class Student
{
int roll;
String name;
int salary;

public Student(int roll,String name,int salary)
{
this.roll=roll;
this.name=name;
this.salary=salary;
}
public void display()
{
System.out.println("roll: "+roll+" name: "+name+" salary: "+salary);
}
public static void main(String args[])
{
Student s=new Student(54,"Shrushti",20000);
s.display();
}
}