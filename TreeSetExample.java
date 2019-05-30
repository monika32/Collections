import java.util.TreeSet;
public class TreeSetExample {
	public static void main(String args[]) {
		TreeSet<String> arr1 = new TreeSet<String>();
		TreeSet<String> arr2 = new TreeSet<String>();
		arr1.add("A");
		arr1.add("B");
		arr1.add("C");
		System.out.println("map A" + arr1);
		arr2.add("A");
		System.out.println("map B "+arr2);
		arr2.addAll(arr1);
		System.out.println("map B contains map A without duplicates :"+arr2);

	}
}
