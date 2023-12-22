public class Employ
{
private String name;
private int age;
private double salary;
public Employ()
{}
public Employ(String n, int a, double s)
	{
		name =n;
		age =a;
		salary =s;
	}
public void outputDetails()
	{
	System.out.println("Name: "+name+ "Age: "+age+ "Salary: "+salary);
	}
}