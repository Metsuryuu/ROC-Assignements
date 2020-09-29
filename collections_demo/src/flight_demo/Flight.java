package flight_demo;

public class Flight {
	
	private int fid;
	private String fname;
	private double cost;
	private float rating;
	
	public Flight(){}

	public Flight(int fid, String fname, double cost, float rating) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.cost = cost;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Flight [fid=" + fid + ", fname=" + fname + ", cost=" + cost + ", rating=" + rating + "]";
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + fid;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + Float.floatToIntBits(rating);
		return result;
	}

	@Override	//this override will prevent duplicates from being added.
	public boolean equals(Object obj) {	//can add through source with hashCode, no need to type it all.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (fid != other.fid)
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (Float.floatToIntBits(rating) != Float.floatToIntBits(other.rating))
			return false;
		return true;
	};
	
	

}
