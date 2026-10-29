package exercise5;

public class Main {

	public static void main(String[] args) {
	 	// Başlangıç verileri: arac1 → Toyota Corolla, 1500 TL, müsait; arac2 → Renault Clio, 1200 TL, müsait; arac3 → BMW 320i, 3000TL, kirada.
		// TODO 1: Constructor ile arac1, arac2, arac3 oluşturunuz.
				System.out.println("=== ARAÇ KİRALAMA SİSTEMİ ===");
				Arac arac1 = new Arac("Toyota", "Corolla", 1500, false);
				Arac arac2 = new Arac("Renault", "Clio", 1200, false);
				Arac arac3 = new Arac("BMW", "320i", 3000, true);
		
		// TODO 2: Üç aracın başlangıç bilgilerini yazdırınız.
				arac1.bilgileriGoster();
				System.out.println("--------------------");
				arac2.bilgileriGoster();
				System.out.println("--------------------");
				arac3.bilgileriGoster();
				System.out.println("--------------------");
				
		// TODO 3: arac1 nesnesini kiralayınız.
				arac1.kirala();
				
		// TODO 4: arac1 nesnesini tekrar kiralamayı deneyiniz.
				arac1.kirala();
				
		// TODO 5: arac2 için 5 günlük kira bedelini hesaplayınız.
				double bedel= arac2.kiraBedeliHesapla(5);
				System.out.println("5 günlük kiralama bedeli: " + bedel + " TL");
				
		// TODO 6: arac3 nesnesini teslim alınız.
				arac3.teslimEt();
				
		// TODO 7: Üç aracın güncel bilgilerini yazdırınız.
				System.out.println("\n=== GÜNCEL ARAÇ DURUMLARI ===");
				arac1.bilgileriGoster();
				System.out.println("--------------------");
				arac2.bilgileriGoster();
				System.out.println("--------------------");
				arac3.bilgileriGoster();
				System.out.println("--------------------");

	}

}
