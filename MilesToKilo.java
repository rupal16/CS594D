import java.util.Scanner;

class First
{
double mile,kilo;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("Conversion of miles to kilometers. ");
System.out.println("Enter the value of miles : ");
mile= sc.nextDouble();
}

void convert()
{
kilo=mile*1.60934;
}

void output()
{
System.out.println("Its value in kilometers is : "+kilo);
}
}

class MilesToKilo
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.convert();
obj.output();
}
}