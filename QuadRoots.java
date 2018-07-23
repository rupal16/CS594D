import java.util.Scanner;
import java.lang.Math;

class First
{
int a,b,c;
double r1,r2;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of a : ");
a= sc.nextInt();
System.out.println("Enter the value of b : ");
b= sc.nextInt();
System.out.println("Enter the value of c : ");
c= sc.nextInt();
System.out.println("The quadratic equation is : "+ a+"x^2 + "+b+"x + "+c);
}

void calc()
{
r1=((-b+Math.sqrt((b*b)-4*a*c))/(2*a));
r2=((-b-Math.sqrt((b*b)-4*a*c))/(2*a));
}

void output()
{
System.out.println("The roots are : "+ r1 +" and "+ r2);
}
}

class QuadRoots
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.calc();
obj.output();
}
}