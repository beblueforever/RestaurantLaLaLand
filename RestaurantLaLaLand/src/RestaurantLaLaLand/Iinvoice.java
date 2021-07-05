package RestaurantLaLaLand;

public interface Iinvoice {// Fatura, hesap için gerekli metodlar.
	
	public float CalculateStep(); // Adım hesaplama fonksiyonu 
	public void WritetoFile(); // Dosyaya yazdırma fonksiyonu
	public void PrintStepCalories(); // Adım kalorileri yazdırma fonksiyonu

}
