import java.util.Scanner;

class First
{
int num;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number : ");
num= sc.nextInt();
}

void check()
{
if((num%7==0)||(num%10==7))
{
System.out.println("It is a buzz number. ");
}
else
{
System.out.println("It is not a buzz number. ");
}
}
}

class Buzz
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.check();
}
}