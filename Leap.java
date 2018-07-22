import java.util.Scanner;

class First
{
long year;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("To check for a leap year. ");
System.out.println("Enter the year : ");
year= sc.nextLong();
}

void check()
{
if(((year%400==0)&&(year%100!=0))||(year%400==0))
{
System.out.println("It is a leap year. ");
}
else
{
System.out.println("It is not a leap year. ");
}

}
}


class Leap
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.check();
}
}