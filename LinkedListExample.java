package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String args[]) {
		LinkedList<EmployeeExample> arr = new LinkedList<EmployeeExample>();
		LinkedList<EmployeeExample> arr2 = new LinkedList<EmployeeExample>();
//		List<Employee> list = new ArrayList<Employee>();
		EmployeeExample a = new EmployeeExample(1,12909987,"A");
		EmployeeExample b = new EmployeeExample(2,12909987,"B");
		EmployeeExample c=  new EmployeeExample(3,12909987,"C");
		arr.add(a);
		arr.add(b);
		arr.add(c);
		arr.add(new EmployeeExample(2,2837297,"D"));
		System.out.println(arr);
		arr2.add(a);
		arr2.add(b);
		arr2.add(c);
		//list.addarr);
//		System.out.println(list);
		
		
		for (EmployeeExample employee : arr) {
			System.out.println(employee);
		}
		System.out.println("remove "+arr.remove(0));
		System.out.println("size :"+arr.size());
		arr.add(new EmployeeExample(4,1323434,"D"));
		System.out.println("add(): "+arr);
		System.out.println("add at index :"+arr.add(a));
		System.out.println(arr);
		arr.addAll(arr2);
		System.out.println("using add all"+arr);
		arr.addAll(2, arr2);
		System.out.println("using contains  "+arr.contains(a));
		System.out.println("using add all at index"+arr);
		System.out.println("size "+arr.size());
		System.out.println("using get :"+arr.get(3));
		System.out.println("using indexof : "+arr.indexOf(a));
		System.out.println("using last indexof : "+arr.lastIndexOf(a));
		System.out.println(arr);
		arr.addAll(2, arr2);
		System.out.println("size : "+arr.size());
//		arr.trimToSize();
//		System.out.println("using trimtosize :"+arr);
//		System.out.println("size : "+arr.size());
		arr.clear();
		System.out.println("size "+arr.size());
		
	}
}
