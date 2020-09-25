package person;

public class Project {
	
	private int pid;
	private String pname;
	private String clientname;
	private double cost;
	
	public Project(){}

	public Project(int pid, String pname, String clientname, double cost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.clientname = clientname;
		this.cost = cost;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getClientname() {
		return clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", clientname=" + clientname + ", cost=" + cost + "]";
	}
	
	

}
