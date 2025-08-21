import java.util.*;
public class AreaC
{
double r,result;
public double area()
{
result=(3.14)*r*r;
return result;
}
public static void main(String[] args)
{
AreaC a=new AreaC();
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of radius");
a.r=s.nextDouble();
System.out.println("The area of circle is "+a.area());
}
}

