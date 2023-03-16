package Practice1;

public class ConstructorExample {

	private String fname;
	private String lname;
	private String email;
	private double telephone;
	private String psw;
	private String repsw;
	public ConstructorExample(String fname, String lname, String email, double telephone, String psw, String repsw) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.telephone = telephone;
		this.psw = psw;
		this.repsw = repsw;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getTelephone() {
		return telephone;
	}
	public void setTelephone(double telephone) {
		this.telephone = telephone;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getRepsw() {
		return repsw;
	}
	public void setRepsw(String repsw) {
		this.repsw = repsw;
	}
	
	}
