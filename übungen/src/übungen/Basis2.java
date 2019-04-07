package übungen;

public class Basis2 {
	
	
	public static void main(String[] args) {
		
		
		//Schleifen
		for (int i = 0; i < 10; i++) {
			System.out.println("ich bin eine Schleife und wurde "+i+"x aufgerufen!");
		}
		
		
		//If/Else Anweisung
		int zahl1 = 2;
		int zahl2 = 3;
		
		System.out.println("hier kommt nun If/Else");
		if(zahl1<zahl2) {
			System.out.println("Zahl1 ist kleiner als Zahl2");
		}else {
			System.out.println("Zahl1 ist größer als Zahl2");
		}
		
		
		
		System.out.println("hier kommt das for und das if zusammen zum Einsatz!");
		for (int i = 0; i < 10; i++) {
			
			if(zahl1 < i) {
				System.out.println("i ist gerade größer als zahl1");
			}else {
				System.out.println("nun ist es nicht mehr so!");
			}
			
			System.out.println("zahl1: "+ zahl1 +" i:" + i);
		}
		
	}

}
