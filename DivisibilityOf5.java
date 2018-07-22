import java.util.Scanner;

class First
{
int num;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("To check divisibility of 5. ");
System.out.println("Enter a number : ");
num= sc.nextInt();
}

void check()
{
if(num%5==0)
{
System.out.println("It is divisible by 5.");
}
else
{
System.out.println("It is not divisible by 5. ");
}
}
}

class DivisibilityOf5
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.check();
}
}