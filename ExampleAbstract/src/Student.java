
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A("manoj",10000);
		
		System.out.print(obj.name);

		System.out.print(obj.salary);
		


	}

}
class A{
	String name;
	int salary;
	A(String name,int salary){
		this.name=name;
		this.salary=salary;
	
	}
	
}