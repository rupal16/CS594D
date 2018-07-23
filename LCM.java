import java.util.Scanner;

class First
{
int a,b,hcf,lcm,c=1;;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("LCM of two numbers. ");
System.out.println("Enter the first number : ");
a= sc.nextInt();
System.out.println("Enter the second number : ");
b= sc.nextInt();
c=a*b;
}

void calc()
{

while((a!=0)||(b!=0))
{
if(a==b)
{
hcf=a;
break;
}
else if(a>b)
{
a=a-b;
}
else
{
b=b-a;
}
}

}
void output()
{
lcm=c/hcf;
System.out.println("LCM= "+ lcm);
}
}


class LCM
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.calc();
obj.output();
}
}