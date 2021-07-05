package RestaurantLaLaLand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Cakes extends Dessert implements Iinvoice {// kekli tatlılar 
	
	private double SugarValue; // SEKER DEGERI 
	private String Aroma; // AROMA 
	private String Krema; // KREMA 
	private String KremaAroma; // KREMA AROMASI 
	
	
	public Cakes(  float calorie, float price, String name, String explanation, String typeofProduct,
			String typeofDessert, String content, String cookingStyle, String cookingTime, String cookingStatus,
			String suggestions, String sauce, String sauceContent) {
		super(  calorie, price, name, explanation, typeofProduct, typeofDessert, content, cookingStyle, cookingTime,
				cookingStatus, suggestions, sauce, sauceContent);
		 
	}
	public Cakes(  float calorie, float price, String name, String explanation, String typeofProduct) {
		super(  calorie, price, name, explanation, typeofProduct);
		 
	}
	public Cakes(  float calorie, float price, String name, String explanation, String typeofProduct,
			double sugarValue, String sauceContent, String aroma, String kremaAroma, String krema) {
		super(  calorie, price, name, explanation, typeofProduct);
		this.SugarValue = sugarValue;
		this.Aroma = aroma;
		this.Krema= krema;
		this.KremaAroma = kremaAroma;
	}
	public double getSugarValue() {
		return SugarValue;
	}
	public void setSugarValue(double sugarValue) {
		SugarValue = sugarValue;
	}
	
	public String getAroma() {
		return Aroma;
	}
	public void setAroma(String aroma) {
		Aroma = aroma;
	}
	
	
	public String getKrema() {
		return Krema;
	}
	public void setKrema(String krema) {
		Krema = krema;
	}
	public String getKremaAroma() {
		return KremaAroma;
	}
	public void setKremaAroma(String kremaAroma) {
		KremaAroma = kremaAroma;
	}
	@Override
	public float CalculateStep() {
		 
		//System.out.println(  super.getProductId() + " : " + super.getCalorie() + " Kaloriyi Yakmanız İçin  " + (super.getCalorie()*20 ) + " Adım Atmalısınız." );
		
	    return super.getCalorie() * 20 ; 
		
	}
	@Override
	public void WritetoFile() {

		try {
			
			BufferedWriter bw = new BufferedWriter(new  FileWriter("tatli.txt",true));
			bw.newLine();
			bw.write(" KEKLER ");
			bw.newLine();
			bw.write("Ürün ID : " + super.getProductId());
	        bw.newLine();
			bw.write("Ürün Adı : " + super.getName());
	        bw.newLine();
            bw.write("Ürün Türü : " + super.getTypeofProduct());
            bw.newLine();
            bw.write("Ürün Fiyatı : " + super.getPrice() + "TL");
            bw.newLine();
            bw.write("Ürün Kalori : " + super.getCalorie());
            bw.newLine();
            bw.write("Tatlı Türü : " + super.getTypeofDessert());
            bw.newLine();
            bw.write("Tatlı İçeriği : " + super.getContent());
            bw.newLine();
            bw.write("Pişirme Şekli : " + super.getCookingStyle());
            bw.newLine();
            bw.write("Pişirme Zamanı : " + super.getCookingTime());
            bw.newLine();
            bw.write("Pişirme Durumu : " + super.getCookingStatus());
            bw.newLine();
            bw.write("Öneriler : " + super.getSuggestions());
            bw.newLine();
            bw.write("Sos Türü : " + super.getSauce());
            bw.newLine();
            bw.write("Sos İçeriği : " + super.getSauceContent());
            bw.newLine();
            bw.write("Aroma : " + Aroma);
            bw.newLine();
            bw.write("Şeker Değeri : " + SugarValue);
            bw.newLine();
            bw.write("Krema : " + Krema);
            bw.newLine();
            bw.write("Krema Aroması  : " + KremaAroma);
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
