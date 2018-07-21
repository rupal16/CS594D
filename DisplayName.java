import java.util.Scanner;
class First
{
String name;
void method1()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter your name :");
name=sc.nextLine();
}
void method2()
{
System.out.println("Your name is "+name);
}
}

class DisplayName
{
public static void main(String args[])
{
First obj= new First();
obj.method1();
obj.method2();
}
}