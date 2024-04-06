package nonStaticVariable;

public class Employee 
{
	static String Company_name="TCS";
	int emp_id=123;
	double sal= 5736.5;
	String name="girish";
	static 
	{
		System.out.println(Company_name);
		
	}
	{
		System.out.println("===employee details===");
	}
	public void details()
	{
		System.out.println("name : "+name);
		System.out.println("salary : "+sal);
		System.out.println("empid : "+emp_id);
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.details();
		Employee e2=new Employee();
		e2.name="gayu";
				e2.sal=635489.25;
				e2.emp_id=45;
				e2.details();
	}

}
