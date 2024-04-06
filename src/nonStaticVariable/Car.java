package nonStaticVariable;

public class Car {
String model;
String color;
double price;
{
	System.out.println("non static block");
}
public void display()
{
	System.out.println("model is " + model);
	System.out.println("color is " + color);
	System.out.println("price is " + price);
}
public static void main(String[] args) {
	Car c=new Car();
	c.display();
}
}
