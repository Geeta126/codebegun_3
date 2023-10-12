import java.util.*;


public class Array_List  {
	public static void main(String[] args) {
		List list= new ArrayList();
		
        list.add(87);
		list.add(3265);
		list.add(567);
		list.add(65432);
		System.out.println("Adding elements ::"+list);
		
		list.remove(0);
		System.out.println("Remove elements ::"+list);
		
		list.set(1, 666);
		System.out.println("Update elements ::"+list);
		
		list.get(0);
		System.out.println("Get elements ::"+list);
		
		list.clear();
		System.out.println("Clear elements ::"+list);
		
		
		
	}

}
