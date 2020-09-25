package person;

public class Employee extends Person{
	
	//try private Address  presentAddress *Done, could add a condition if the addresses are the same.*
		//add has-A relationship Project-pid,name,clientname,cost *DONE*
		private String designation; //has-A
		private double salary;//has-A
		private Address permenantAddress;//has-A
		private Address presentAddress;
		private Project pro;
		
		public Employee() {}

		public Employee(int id, String name, String designation, double salary) {
			super(id, name);
			this.designation = designation;
			this.salary = salary;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}


		public Address getPermenantAddress() {
			return permenantAddress;
		}

		public void setPermenantAddress(Address permenantAddress) {
			this.permenantAddress = permenantAddress;
		}
		
		public Address getPresentAddress(){
			return presentAddress;
		}
		
		public void setPresentAddress(Address presentAddress){
			this.presentAddress = presentAddress;
		}
		
		public Project getPro(){
			return pro;
		}
		
		public void setPro(Project pro){
			this.pro = pro;
		}

		@Override
		public String toString() {
			return "Employee [designation=" + designation + ", salary=" + salary + ", permenantAddress="
					+ permenantAddress + ", presentAddress=" + presentAddress + ", pro=" + pro + ", getId()=" + getId()
					+ ", getName()=" + getName() + "]";
		}
		
		@Override
		public boolean equals(Object o){
			boolean b = false;
			Employee e2 = (Employee)o;
			if(this.getId()== e2.getId()){
				b = true;
			}
			return b;
		}

		
		
	}
