package zadaca3;

public class Main {
	public static void main (String[] args) {
		Covek obj1 = new Covek();
		
		obj1.ime = "Davor";
		obj1.prezime = "Petrovski";
		obj1.mBroj = "01020002564798";
		
		System.out.println("Imeto na covekot e: " + obj1.ime + ".");
		System.out.println("Prezimeto na covekot e: " + obj1.prezime + ".");
		System.out.println("Cvekot ima maticen broj: " + obj1.mBroj + ".");
	}
}