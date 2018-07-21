import java.util.Scanner;

class First
{
int a,b,c;

void method1()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the first no. :");
a= sc.nextInt();
System.out.println("Enter the second no. :");
b= sc.nextInt();
}

void method2()
{
c=a+b;
System.out.println("The sum is "+c);
}
}

class SumOfTwoNos
{
public static void main(String args[])
{
First obj= new First();
obj.method1();
obj.method2();
}
}