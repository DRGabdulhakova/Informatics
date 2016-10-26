public class KickScooter {
	
	public static void main(String[] args) {
         
    Skate scooter1 = new Skate("Classic", 2, 4, "red");
	Segway scooter2 = new Segway("i2", 50, 2, "black", true);
    GyroScooter scooter3 = new GyroScooter("Classic", 10, 2, "blue", true, true);

	System.out.println(scooter1); 
    System.out.println(scooter2);
	System.out.println(scooter3);
	
    System.out.println(scooter1.equals(scooter2));
	System.out.println(scooter1.equals(scooter3));
	System.out.println(scooter2.equals(scooter3));
	}
}