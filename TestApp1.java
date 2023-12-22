public class TestApp1
{
public TestApp1() {
}
public static void main(String args[])
{
Product p1 = new Product(3,50);
p1.deliver(50);
p1.sell(40);
p1.display();
Product p2 = new Product(6,100);
p2.deliver(20);
p2.sell(50);
p2.display();
}
}