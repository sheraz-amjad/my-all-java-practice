public class Clerical extends Employee
{
public Clerical(int y){
this.rateOfPay = y;
}
public void paid_hourly(int hour)
{

int pay = hour*this.rateOfPay;
System.out.println("paid-hourly = "
+ pay);
}
}