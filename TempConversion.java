import java.util.Scanner;

class First
{
double c,f,cn=0,fn=0;
Scanner sc=new Scanner(System.in);

void CToF()
{
System.out.println("Celsius to Fahrenheit ");
System.out.println("Enter the temperature (in C) : ");
c=sc.nextDouble();
fn=(1.8*c)+32;
System.out.println("Temperature in Fahrenheit : "+ fn);
}

void FToC()
{
System.out.println("Fahrenheit to Celsius ");
System.out.println("Enter the temperature (in F) : ");
f=sc.nextDouble();
cn= (f-32)/1.8;
System.out.println("Temperature in Celsius : "+cn);
}
}

class TempConversion
{
public static void main(String args[])
{
First obj= new First();
obj.CToF();
obj.FToC();
}
}