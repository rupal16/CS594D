import java.util.Scanner;
class First
{
double ar,peri,rad;

void calc()
{
Scanner sc= new Scanner(System.in);
System.out.println("To calculate the area and perimeter of a circle. ");
System.out.println("Enter the radius : ");
rad= sc.nextDouble();
peri=2*3.14*rad;
System.out.println("Perimeter = "+peri+" units");
ar=3.14*rad*rad;
System.out.println("Area = "+ar+" sq units");
}
}

class AP_Circle
{
public static void main(String args[])
{
First obj= new First();
obj.calc();
}
}