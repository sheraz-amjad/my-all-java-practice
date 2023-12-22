public class TestApp
{
public TestApp() {
}
public static void main(String args[])
{
Calculator obj=new Calculator();
int n = obj.sum(10,20);
System.out.println("Sum=" + n);
int m=obj.mul(5,6);
System.out.println("mul="+m);
}
}