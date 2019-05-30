public class EmployeeExample{
	private int empid;
	private String empname;
	private int empsal;
	@Override
	public String toString() {
		return "id=" + empid + ",Name=" + empname + ",Salary=" + empsal + " \n";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	   
}