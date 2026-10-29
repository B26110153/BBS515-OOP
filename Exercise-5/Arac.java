package exercise5;

public class Arac {
	
	// Instance variables
	 String marka;
	 String model;
	 double gunlukUcret;
	 boolean kiradaMi;
	
	 // Constructor
	 Arac(String marka, String model, double gunlukUcret, boolean kiradaMi) {
		 this.marka = marka;
	     this.model = model;
	     this.gunlukUcret = gunlukUcret;
	     this.kiradaMi = kiradaMi;
	 }
	 
	 void bilgileriGoster() {
		 System.out.println("Marka: " + marka);
	     System.out.println("Model: " + model);
	     System.out.println("Günlük Ücret: " + gunlukUcret);
	     //Kira durumu bilgisi:
		 	if (kiradaMi == true) {
		 		System.out.println("Durum : Kirada");
		 	} else {
		 		System.out.println("Durum : Müsait");
		 	}
	 }
	
	 void kirala() {
	 // TODO: Araç müsaitse kiralayınız; değilse uyarınız.
		 if (kiradaMi == false) {
	            kiradaMi = true;
	            System.out.println(marka + " " + model + " başarıyla kiralandı.");
	        } else {
	            System.out.println("Bu araç zaten kiralanmış!");
	        }
	 }
	 
	 void teslimEt() {
	 // TODO: Araç kiradaysa teslim alınız; değilse uyarınız.
		 if (kiradaMi == true) {
	            kiradaMi = false;
	            System.out.println(marka + " " + model + " başarıyla teslim alındı.");
	        } else {
	            System.out.println("Bu araç zaten müsait!");
	        }
	 }
	
	 double kiraBedeliHesapla(int gun) {
	 // TODO: Gün sayısını kontrol edip bedeli hesaplayınız.
		 if(gun>0) {
			 return gunlukUcret * gun;
		 } else {
			 return 0; 
		 }
	 }
	 
}
