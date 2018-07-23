
class First
{
int num=12,c=1,i;


void calc()
{

for(i=1;i<=12;i++)
{
 c=c*i;
}
System.out.println("Factorial of 12 is "+c);
}
}

class Factorial_12
{
public static void main(String args[])
{
First obj= new First();
obj.calc();
}
}