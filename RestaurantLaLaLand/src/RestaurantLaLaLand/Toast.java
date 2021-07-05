package RestaurantLaLaLand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Toast extends Breakfast implements Iinvoice {// TOST CLASS
	
	private String Softness; // YUMUSAKLIK DURUMU 
	private String Oil; // YAGLILIK DURUMU 
	private String Wants; // EXTRA ISTEKLER  
	private String Ekmek; // TOST EKMEGININ TURU
	
	
	public Toast(  float calorie, float price, String name, String explanation, String typeofProduct,
			String breakfastType, double temperature, String contents, String suggestions) {
		super(  calorie, price, name, explanation, typeofProduct, breakfastType, temperature, contents, suggestions);
		
	}
	public Toast(  float calorie, float price, String name, String explanation, String typeofProduct) {
		super(  calorie, price, name, explanation, typeofProduct);
		
	}
	
	public Toast(  float calorie, float price, String name, String explanation, String typeofProduct,
			String softness, String oil, String wants, String ekmek) {
		super(  calorie, price, name, explanation, typeofProduct);
		this.Softness = softness;
		this.Oil = oil;
		this.Wants = wants;
		this.Ekmek= ekmek;
	}
	
	
	public String getSoftness() {
		return Softness;
	}
	public void setSoftness(String softness) {
		this.Softness = softness;
	}
	public String getOil() {
		return Oil;
	}
	public void setOil(String oil) {
		this.Oil = oil;
	}
	public String getWants() {
		return Wants;
	}
	public void setWants(String wants) {
		this.Wants = wants;
	}
	
	
	public String getEkmek() {
		return Ekmek;
	}
	public void setEkmek(String ekmek) {
		Ekmek = ekmek;
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
			bw.write(" TOST MENÜLERİ ");
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
            bw.write("Çıtır or Yumuşak : " + Softness );
            bw.newLine();
            bw.write("Yağ : " + Oil );
            bw.newLine();
            bw.write("Ekstra İstekler : " + Wants);
            bw.newLine();
            bw.write("Tost Ekmeğinin Türü : " + Ekmek);
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
