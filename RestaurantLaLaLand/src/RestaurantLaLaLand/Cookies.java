package RestaurantLaLaLand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Cookies extends Dessert implements Iinvoice {// kurabiyeler 
	
	private String SweetOrSalty; // SEKER OR TUZ 
	private String Aroma; // AROMA 
	private double SugarValue; // SEKER DEGERI  
	private String Porsion; //PORSİYON MİKTARI
	
	
	public Cookies(  float calorie, float price, String name, String explanation, String typeofProduct,
			String typeofDessert, String content, String cookingStyle, String cookingTime, String cookingStatus,
			String suggestions, String sauce, String sauceContent) {
		super( calorie, price, name, explanation, typeofProduct, typeofDessert, content, cookingStyle, cookingTime,
				cookingStatus, suggestions, sauce, sauceContent);
		 
	}
	public Cookies(  float calorie, float price, String name, String explanation, String typeofProduct) {
		super(  calorie, price, name, explanation, typeofProduct);
		 
	}
	public Cookies(  float calorie, float price, String name, String explanation, String typeofProduct,
			String sweetOrSalty, String aroma, double sugarValue, String porsion) {
		super(  calorie, price, name, explanation, typeofProduct);
		this.SweetOrSalty = sweetOrSalty;
		this.Aroma = aroma;
		this.SugarValue = sugarValue;
		this.Porsion=porsion;
	}
	public String getSweetOrSalty() {
		return SweetOrSalty;
	}
	public void setSweetOrSalty(String sweetOrSalty) {
		SweetOrSalty = sweetOrSalty;
	}
	public String getAroma() {
		return Aroma;
	}
	public void setAroma(String aroma) {
		Aroma = aroma;
	}
	public double getSugarValue() {
		return SugarValue;
	}
	public void setSugarValue(double sugarValue) {
		
		SugarValue = sugarValue;
	}
	
	
	public String getPorsion() {
		return Porsion;
	}
	public void setPorsion(String porsion) {
		Porsion = porsion;
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
			bw.write(" KURABİYELER ");
			bw.newLine();
			bw.write("Ürün ID : " + super.getProductId());
	        bw.newLine();
			bw.write("Ürün Adı : " + super.getName());
	        bw.newLine();
            bw.write("Ürün Türü : " + super.getTypeofProduct());
            bw.newLine();
            bw.write("Ürün Fiyatı : " + super.getPrice()+ " TL ");
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
            bw.write("Tatlı veya Tuzlu : " + SweetOrSalty);
            bw.newLine();
            bw.write("Şeker Değeri : " + SugarValue);
            bw.newLine();
            bw.write("Porsiyon  : " + Porsion );
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
