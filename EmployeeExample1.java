
public class EmployeeExample1 {
	int id;
	int sal;
	String name;
	public EmployeeExample1(int id,int sal,String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.sal =sal;
		this.name = name;
	}
	@Override
	public String toString() {
		return "id=" +id + ",sal=" +sal+ ",Name=" + name + " \n";
	}
	@Override
	public boolean equals(Object obj){
        if (obj instanceof EmployeeExample1) {
       	 EmployeeExample1 pp = (EmployeeExample1) obj;
            return (pp.id == this.id &&  pp.name.equals(this.name));
        } else {
            return false;
        }
    }
	@Override
	public int hashCode(){
		int hashcode = 0;
		hashcode = id*20;
		hashcode = sal*20;
		hashcode += name.hashCode();
		return hashcode;
	} 
	
}
