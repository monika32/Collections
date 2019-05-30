import java.util.HashSet;
import java.util.Set;
public class SetExample {
	public static void main(String args[]) {
		Set<EmployeeExample> arr1 = new HashSet<EmployeeExample>();
		Set<EmployeeExample> arr2 = new HashSet<EmployeeExample>();
		arr1=retrive();
		save(arr1);
		System.out.println("Set A "+arr1);
//		arr2.addAll(arr1);
//		arr2.add(null);
//		System.out.println("Set B "+arr2);
//		Set<EmployeeExample> a = new HashSet<EmployeeExample>(arr1); 
//        a.addAll(arr2); 
//		System.out.println("using add all of two sets"+a);
//		a.retainAll(arr2);
//		System.out.println("using retainall of two sets"+a);
//		a.removeAll(arr2);
//		System.out.println("using removeall of two sets  "+a);
	}
	private static void save(Set<EmployeeExample> employee) {
		for (EmployeeExample e : employee) {
			e.getEmpname();
			e.getEmpid();
			e.getEmpsal();
		} 
	}
	private static Set<EmployeeExample> retrive() {
		int id=0;
		int sal=100000;
		String name= "A";
		EmployeeExample e = null;
		Set<EmployeeExample> employee = new HashSet<>();
			for(int i=0; i<5; i++) {
				e = new EmployeeExample();
				e.setEmpid(id+i);
				e.setEmpname(name+i);
				e.setEmpsal(sal+i);
				employee.add(e);
			}
			return employee;
		}

}
