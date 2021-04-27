package methods2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi = topla(2,9);
		int sayi2=topla(2,9,10,5);
		System.out.println(sayi);
		System.out.println(sayi2);
		

	}

	public static void ekle() {
		System.out.println("Eklendi");

	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1,int sayi2) {
		int topla=sayi1+sayi2;
		return topla;
	}
	public static int topla(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}

}
