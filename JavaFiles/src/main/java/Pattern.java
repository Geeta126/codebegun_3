
import java.util.Scanner;
public class Pattern{
static public void main(String[ ] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
pattern (a);
while (true) {
System.out.println("To continue enter 1::");
int choice =sc.nextInt();
System.out.println("Given choice is ::");
if (choice==1) {
	System.out.println("Enter input::");
int input=sc.nextInt(); 
pattern(input);
}
else if (choice==2) {
	System.out.println("Program exit");
	break;
}
}
}
static private void pattern (int a) {
	for (int i=1;i<=a;i++) {
		for (int j=1;j<=i;j++) {
		System.out.print("* ");
		}
		System.out.println();
		}
}
}