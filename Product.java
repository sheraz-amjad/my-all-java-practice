public class Product
{
	public int barcode;
    public int stockLevel;
public Product(int initBarcode, int initStockLevel)
{
barcode=initBarcode;
stockLevel=initStockLevel;
}
public void display()
{
System.out.println("Barcode = "+barcode);
System.out.println("Stocklevel = "+stockLevel);
System.out.println("=========================");
}
public void deliver(int howMany)
{
	if (howMany<0){
	System.out.println("Error Value");}
	else{
	stockLevel+=howMany;}
}
public void sell(int howmany)
{
	if (howmany<0){
	System.out.println("Error Value");}
	else{
	stockLevel-=howmany;}
}
}