import java.util.Scanner;

public class Pattern2 {
public static void main(String[ ] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter input");
int a = sc.nextInt();

pattern2 (a);

//while(true) {
//	System.out.println("To continue press 1 ::");
//    int choice=sc.nextInt();
//    System.out.println("Given choice is ::");
//    if (choice==1) {
//    	System.out.println("Enter input ::");
//    	 int input=sc.nextInt();
//    	pattern2 (a);
//    }
//    else if(choice==2) {
//    	System.out.println("program exit");
//    	break;
//    }
//}
}
private static void pattern2 (int a) {

for (int i =a; i>=i;i--) {
for (int j=1;j<=i;j++) { 
System.out.print("*  ");
}
System.out.println();
}
}
}


