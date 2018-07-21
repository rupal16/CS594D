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
if(num>0)
{
System.out.println("It is a positive number. ");
}
if(num==0)
{
System.out.println("It is a zero. ");
}
if(num<0)
{
System.out.println("It is a negative number. ");
}
}
}

class Pos_Neg
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.check();
}
}