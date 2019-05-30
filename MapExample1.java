import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample1 {
	 public static void main(String args[]) { 
		 
	       Map< EmployeeExample1,Integer> hm = new HashMap< EmployeeExample1,Integer>();
	       EmployeeExample1 e1 = new EmployeeExample1(2, 23454, "B");
	       hm.put(e1, 12);
	       hm.put(new EmployeeExample1(1,232335,"A"), new Integer(100)); 
	       hm.put(new EmployeeExample1(2,232336,"B"), new Integer(200)); 
	       hm.put(new EmployeeExample1(2,232336,"B"), new Integer(300)); 
	       hm.put(new EmployeeExample1(2,232336,"B"), new Integer(400)); 
	       
	       Set<Entry<EmployeeExample1, Integer>> st = hm.entrySet();      
     		for (Map.Entry< EmployeeExample1,Integer> me:st) { 
     				System.out.print(me.getKey()+": "+ " " +me.getValue()); 
     			} 
     		
     		EmployeeExample1 st1 = new EmployeeExample1(1,232335,"A"); 
		System.out.println("by using get() :" +hm.get(st1));
		System.out.println("by using remove() :");
		hm.remove(e1);
		System.out.println(hm);
		System.out.println("by using containskey 2 ,23454,B :"+hm.containsKey(e1));
		System.out.println("by using containsvalue of 400:"+hm.containsValue(400));
		System.out.println("by using replace :");
		hm.replace(st1, 200);
		System.out.println(hm);
		System.out.println("by using containskey :"+hm.containsKey(st1));
		System.out.println("by using containsvalue :"+hm.containsValue(st1));
		
		 Map< EmployeeExample1,Integer> hm1 = new HashMap< EmployeeExample1,Integer>();
	       EmployeeExample1 e2 = new EmployeeExample1(2, 23454, "B");
	       hm.put(e2, 12);
	       hm.put(new EmployeeExample1(1,232335,"A"), new Integer(100)); 
	       hm.put(new EmployeeExample1(2,232336,"B"), new Integer(200)); 
	       hm.put(new EmployeeExample1(2,232336,"B"), new Integer(300)); 
	       hm.put(new EmployeeExample1(2,232336,"B"), new Integer(400)); 
	       
	       Set<Entry<EmployeeExample1, Integer>> st2 = hm.entrySet();      
   		/*for (Map.Entry< EmployeeExample1,Integer> me:st2) { 
   				System.out.print(me.getKey()+": "+ " " +me.getValue()); 
   			} */
   			hm1.putAll(hm);
   		System.out.println("by using putAll :"+hm1);
		
		
		
	 	}
}
