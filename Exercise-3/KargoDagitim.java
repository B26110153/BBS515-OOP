package exercise3;

public class KargoDagitim {
	public static void main(String[] args) {
		
		double toplamKargoUcreti = 0;
		
		for(int teslimatNo = 1; teslimatNo <= 10; teslimatNo++) {
			int mesafe = teslimatNo * 5;
			double ucret;	
			
				if(mesafe <= 10) {
				ucret = 50	;
				}
				else if (mesafe <= 30) {
				ucret = 80 ;	
				}
				else {
				ucret = 120;
				}
				
			if (teslimatNo % 3 == 0) {
			ucret = ucret + 20;
			}
			if (mesafe >= 40) {
			ucret = ucret * 0.90;
			}
			
			toplamKargoUcreti = toplamKargoUcreti + ucret;		
			
			System.out.println(teslimatNo + ". Teslimat - "+ "Mesafe : " + mesafe + " km - " + "Ücret : " + ucret + " TL");
		}
		
		System.out.println ( "Toplam Gelir : " + toplamKargoUcreti + " TL");
	}		
}
