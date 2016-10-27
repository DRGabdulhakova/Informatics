public class MyTV {
	
	public static void main(String[] args) {
         
    TV tv1 = new TV("black&white", 20);
	NewTV tv2 = new NewTV("Color FULL HD", 117, 70, 22, true);

	System.out.println(tv1); 
    System.out.println(tv2);
	
    System.out.println(tv1.equals(tv2));
	}
}