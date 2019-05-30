package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList {

	public static void main(String[] args) {
		
		ArrayList<Employee> employeeList = null;
		employeeList = retrive();
		save(employeeList);
		System.out.println(employeeList);
		
	}

	private static void save(ArrayList<Employee> employeeList) {
		for (Employee e : employeeList) {
			System.out.println(e.getName());
			System.out.println(e.getNo());
			System.out.println(e.getAdreess());
		} 
		for(int i=0; i<employeeList.size(); i++) {
			Employee e = employeeList.get(i);
			System.out.println(e.getName());
			System.out.println(e.getNo());
			System.out.println(e.getAdreess());
		}
		/*Iterator<Employee> emIterator = employeeList.iterator();
		while(emIterator.hasNext()) {
			System.out.println(emIterator.next());
			Employee e = emIterator.next();
			if("vinay1".equalsIgnoreCase(e.getName())) {
				emIterator.remove();
//				System.out.println(e.getName());
//				System.out.println(e.getNo());
//				System.out.println(e.getAdreess());
				
			}
			System.out.println(e.getName());
			System.out.println(e.getNo());
			System.out.println(e.getAdreess());
		}*/
	}

	private static ArrayList<Employee> retrive() {
		String name= "x";
		String address = "e";
		Employee e = null;
		ArrayList<Employee> employeeList = new ArrayList<>();
		for(int i=0; i<2; i++) {
			e = new Employee();
			e.setNo(i);
			e.setName(name + i);
			e.setAdreess(address + i);
			employeeList.add(e);
		}
		return employeeList;
	}

}
