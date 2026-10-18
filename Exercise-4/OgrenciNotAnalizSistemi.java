package exercise4;

import java.util.Scanner;
public class OgrenciNotAnalizSistemi {
	 // 1. Kullanicidan notlari al
	 public static void notlariAl(int[] notlar) {
		 Scanner scanner = new Scanner(System.in);
	 
		 for(int i = 0; i < notlar.length; i++) {
			 System.out.print((i+1) + " . ogrencinin notu : ");
			 notlar[i] = scanner.nextInt();
	 	}
	 }
	
	 
	 // 2. Sinif ortalamasini hesapla
	 public static double ortalamaHesapla(int[] notlar) {
		 int toplam = 0;
		 for(int i = 0; i < notlar.length; i++) {
			 toplam = toplam + notlar[i];
		 }
		 double ortalama = (double) toplam / notlar.length;		 
		 return ortalama;
	 }
	
	 
	 // 3. En yuksek notu bul
	 public static int enYuksekNot(int[] notlar) {
		 int enYuksek = 0;
		 for(int i = 0; i < notlar.length; i++) {
			 if(notlar[i] > enYuksek) { 
				 enYuksek = notlar[i];
			 }
		 }
		 return enYuksek;
	 }
	 
	 
	 // 4. Basarili ogrenci sayisini hesapla
	 public static int basariliSayisi(int[] notlar) {
		 int basarili = 0;
		 for(int i = 0; i < notlar.length; i++) {
			 if(notlar[i] >= 50) { 
				 basarili++;
			 }
		 }
		 return basarili;
	 }
	 
	 
	 // 5. Sonuclari ekrana yazdir
	 public static void sonuclariYazdir(double ortalama,
	 int enYuksek, int basarili) {
		 System.out.println("Sinif ortalamasi: " + ortalama);
		 System.out.println("En yuksek not: " + enYuksek);
		 System.out.println("Basarili ogrenci sayisi: " + basarili);
	}
	 
	 public static void main(String[] args) {
	 int[] notlar = new int[5];
	 System.out.println("===== OGRENCI NOT ANALIZ SISTEMI =====");
	 notlariAl(notlar);
	 double ortalama = ortalamaHesapla(notlar);
	 int enYuksek = enYuksekNot(notlar);
	 int basarili = basariliSayisi(notlar);
	 sonuclariYazdir(ortalama, enYuksek, basarili);
 }
}
