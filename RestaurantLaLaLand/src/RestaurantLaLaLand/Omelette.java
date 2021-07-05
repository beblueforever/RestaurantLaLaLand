package RestaurantLaLaLand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Omelette extends Breakfast implements Iinvoice { // omlet classı 
	
	private String Vegetables; // sebze durumu 
	private String Oil; // yağ durumu 
	private String CookingStatus; // pişme durumu 
	private String Sucuk; // SUCUK / SOSİS
	
	public Omelette(  float calorie, float price, String name, String explanation, String typeofProduct,
			String breakfastType, double temperature, String contents, String suggestions) {
		super(   calorie, price, name, explanation, typeofProduct, breakfastType, temperature, contents, suggestions);
		 
	}
	public Omelette(  float calorie, float price, String name, String explanation, String typeofProduct) {
		super(  calorie, price, name, explanation, typeofProduct);
		 
	}
	public Omelette(  float calorie, float price, String name, String explanation, String typeofProduct,
			String vegetables, String oil, String cookingStatus, String sucuk) {
		super(  calorie, price, name, explanation, typeofProduct);
		this.Vegetables = vegetables;
		this.Oil = oil;
		this.CookingStatus = cookingStatus;
		this.Sucuk = sucuk;
	}
	
	
	public String getVegetables() {
		return Vegetables;
	}
	public void setVegetables(String vegetables) {
		Vegetables = vegetables;
	}
	public String getOil() {
		return Oil;
	}
	public void setOil(String oil) {
		Oil = oil;
	}
	public String getCookingStatus() {
		return CookingStatus;
	}
	public void setCookingStatus(String cookingStatus) {
		CookingStatus = cookingStatus;
	}
	
	public String getSucuk() {
		return Sucuk;
	}
	public void setSucuk(String sucuk) {
		Sucuk = sucuk;
	}
	@Override
	public float CalculateStep() {
		 
		//System.out.println(  super.getProductId() + " : " + super.getCalorie() + " Kaloriyi Yakmanız İçin  " + (super.getCalorie()*20 ) + " Adım Atmalısınız." );
		
	    return super.getCalorie() * 20 ; 
	}
	@Override
	public void WritetoFile() {
		try {
			
			BufferedWriter bw = new BufferedWriter(new  FileWriter("kahvalti.txt",true));
			bw.newLine();
			bw.write(" OMLET MENÜLERİ ");
			bw.newLine();
			bw.write("Ürün ID : " + super.getProductId());
	        bw.newLine();
			bw.write("Ürün Adı : " + super.getName());
	        bw.newLine();
            bw.write("Ürün Türü : " + super.getTypeofProduct());
            bw.newLine();
            bw.write("Ürün Fiyatı : " + super.getPrice() + "TL");
            bw.newLine();
            bw.write("Kahvaltılık Türü :  " + super.getBreakfastType());
            bw.newLine();
            bw.write("Sıcaklık : " + super.getTemperature() + " C ");
            bw.newLine();
            bw.write("İçindekiler : " + super.getContents());
            bw.newLine();
            bw.write("Öneriler :  " + super.getSuggestions());
            bw.newLine();
            bw.write("Sebzeler : " + Vegetables);
            bw.newLine();
            bw.write("Yağ : " + Oil );
            bw.newLine();
            bw.write("Pişirme Durumu : " + CookingStatus);
            bw.newLine();
            bw.write("Sucuk or Sosis : " + Sucuk);
            bw.newLine();
            
           
            bw.close();
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	@Override
	public void PrintStepCalories() {
		try {
			BufferedWriter bw = new BufferedWriter(new  FileWriter("adimkalori.txt",true));
			bw.write(super.getName() + " = " + String.valueOf(super.getCalorie()) + " Kalori için " + String.valueOf(CalculateStep()) + " Adım Atılması Gerekmektedir.");
			bw.newLine();
			bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	
	
	
	
	
	

}
