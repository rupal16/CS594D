import java.util.Scanner;

class First
{
double len,bre,ar,peri;

void calc()
{
Scanner sc= new Scanner(System.in);
System.out.println("To find the area and perimeter of a rectangle. ");
System.out.println("Enter the length : ");
len= sc.nextDouble();
System.out.println("Enter the breadth : ");
bre= sc.nextDouble();
peri=2*(len+bre);
System.out.println("Perimeter= "+peri+ " units");
ar= len*bre;
System.out.println("Area= "+ar+ " units");
}
}

class AP_Rectangle
{
public static void main(String args[])
{
First obj= new First();
obj.calc();
}
}