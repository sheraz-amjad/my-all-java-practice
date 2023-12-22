public class Manager extends Employee
{
public Manager(int x){
this.rateOfPay = x;
}
public void paid_monthly()
{
int result = this.rateOfPay*30;
System.out.println("paid_monthly = " +
result);
}
}
