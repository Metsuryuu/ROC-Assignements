package person;

public class Main {

	public static void main(String[] args) {

		Person person=new Person(100, "Sachin");
		System.out.println(person);
		
		Address a=new Address(188888, "XYZ Street Name", "San Fan", "Kansas", 1222222);
		Address pa=new Address(18991, "ABC Street","Kansas City","CA",211111);
		Project p = new Project(1234,"Test","TheTesters",2999.99);
		Team t = new Team(92922, "Team Name", "Coach");
		Employee employee=new Employee(102, "Raj", "Manager", 123344.44d);
		employee.setPermenantAddress(a);
		employee.setPro(p);
		employee.setPresentAddress(pa);
		System.out.println(employee);
		
		Player player=new Player(900, "Chris Morris", 100, "Cricket");
		player.setT(t);
		System.out.println(player);
		
		Address a2 = new Address(89999, "QWE Street", "New York", "NY", 12345);
		Address pa2 = a2;
		Employee employee2 = new Employee(103, "Bill", "Intern", 32993.14d);
		employee.setPermenantAddress(a2);
		employee.setPro(p);
		employee.setPresentAddress(pa2);
		System.out.println(employee2);
		
		if(employee.equals(employee2)){
			System.out.println("Employees are the same.");
		}else{
			System.out.println("Employees are different.");
		}


	}

}
