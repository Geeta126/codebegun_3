
public class StrReverse {
	public static void main(String[] args) {
		String str="Geeta" ,nstr=" ";
		char ch;
		
		System.out.println("Orginal word ::");
		System.out.println("Geeta");
		
		for(int i=0;i<str.length();i++) {
			ch= str.charAt(i);
			 nstr= ch+nstr;
         }
		System.out.println("Reverse string ::"+nstr);
	}

}
