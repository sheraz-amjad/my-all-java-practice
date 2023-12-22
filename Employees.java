public class Employees
{
private	String name;
private int age;
private double salary;

public String getName()
{
	return name;
}
public void setName(String n)
{
	name = n;
}
public int getAge()
{
	return age;
}
public void setAge(int a)
{
	age = a;
}
public double getSalary()
{
	return salary;
}
public void setSalary(double s)
{
	salary = s;
}
public void outputDetails()
{
System.out.println("name: " + name + ", age: " + age + ", salary:" +salary);
}
}