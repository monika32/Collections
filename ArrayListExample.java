import java.util.*;
public class ArrayListExample {
	
	public static void main(String[] args) {
		Vector<Integer>  link = new Vector<Integer>();
		System.out.println("capacity :"+link.capacity());
		System.out.println("enter elemets to add");
		link.add(1);
		link.add(2);
		link.add(3);
		link.add(4);
		link.add(5);
		link.add(7);
		System.out.println("elements of list are:");
		System.out.println(link);
		System.out.println("elements of list after removing are:");
		link.remove(2);
		System.out.println(link);
		System.out.println(link.getClass());
		link.set(1, 6);
		System.out.println("after set(1,6)"+link);
		System.out.println(link.get(0));
		System.out.println("elements of list empty??"+link.isEmpty());
		System.out.println("size of list :"+link.size());
		
		System.out.println(" list after addAll():"+link.addAll(link));
		System.out.println("elements of list are:");
		System.out.println(link);
		
	}

}
