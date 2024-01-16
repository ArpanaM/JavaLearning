package classesAndObjs;

public class Laptop {
int size;
String model;
float price;
public void demo()
{
	System.out.println("This is Laptop class");
}
public float getLaptopPrice()
{
	price=50000;
	return(price);
}
private void test1()
{
	System.out.println("This is a Private method..");
}
protected void test()
{
	System.out.println("This is a protected method..");
	test1();
}
}
