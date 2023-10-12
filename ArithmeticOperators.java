public class ArithmeticOperators {
	 public static void main(String[] args) {
      int a=10,b=20;  
     int output = add(a,b);
     int output1=sub(a,b);
     int output2=mul(a,b);
     int output3=div(a,b);
     int output4=mod(a,b);
     System.out.println("Addition :: "+output);
      System.out.println("subtraction ::"+output1); 
    System.out.println("multipication ::"+output2);
    System.out.println("division ::"+output3);
    System.out.println("modular division ::"+output4);		
	 }

public static int add(int a,int b){
  return a+b;

}


   public static int sub(int a,int b){
   return a-b;
}
 public static int mul(int a,int b){
   return a*b;
}
  public static int div(int a,int b){
   return a/b;
}
  public static int mod(int a,int b){
   return a%b;
}
 }