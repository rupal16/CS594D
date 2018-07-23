import java.util.Scanner;

class First
{
int num,a=0,b=1,i,c=0;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number : ");
num= sc.nextInt();
}

void calc()
{
System.out.println(a);
System.out.println(b);
for(i=2;i<num;++i)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}

class Fibonacci
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.calc();
}
}