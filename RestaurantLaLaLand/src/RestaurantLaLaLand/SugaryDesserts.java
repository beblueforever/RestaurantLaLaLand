package RestaurantLaLaLand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class SugaryDesserts extends Dessert implements Iinvoice { // SEKERLI TATLILAR 

	private double SugarValue; // SEKER DEGERI 
	private String Additional; // EKSTRA EKLENEN MALZEME 
	private String Findik; // FINDIK EKLENME DURUMU 
	private String Servis; // SERVIS SEKLI 
	
	
	
	public SugaryDesserts(  float calorie, float price, String name, String explanation,
			String typeofProduct, String typeofDessert, String content, String cookingStyle, String cookingTime,
			String cookingStatus, String suggestions, String sauce, String sauceContent) {
		super( calorie, price, name, explanation, typeofProduct, typeofDessert, content, cookingStyle, cookingTime,
				cookingStatus, suggestions, sauce, sauceContent);
		 
	}
	public SugaryDesserts(  float calorie, float price, String name, String explanation,
			String typeofProduct) {
		super(  calorie, price, name, explanation, typeofProduct);
		 
	}
	public SugaryDesserts(  float calorie, float price, String name, String explanation,
			String typeofProduct, double sugarValue, String sauceContent, String additional, String findik, String servis) {
		super( calorie, price, name, explanation, typeofProduct);
		this.SugarValue = sugarValue;
		this.Findik = findik;
		this.Servis = servis;
		this.Additional = additional;
	}
	public double getSugarValue() {
		return SugarValue;
	}
	public void setSugarValue(double sugarValue) {
		SugarValue = sugarValue;
	}
	
	public String getAdditional() {
		return Additional;
	}
	public void setAdditional(String additional) {
		Additional = additional;
	}
	
	public String getFindik() {
		return Findik;
	}
	public void setFindik(String findik) {
		Findik = findik;
	}
	public String getServis() {
		return Servis;
	}
	public void setServis(String servis) {
		Servis = servis;
	}
	@Override
	public float CalculateStep() {
		 
		//System.out.println(  super.getProductId() + " : " + super.getCalorie() + " Kaloriyi Yakman??z ????in  " + (super.getCalorie()*20 ) + " Ad??m Atmal??s??n??z." );
		
	    return super.getCalorie() * 20 ; 
	}
	@Override
	public void WritetoFile() {
		
		try {
			
			BufferedWriter bw = new BufferedWriter(new  FileWriter("tatli.txt",true));
			bw.newLine();
			bw.write(" ??ERBETL?? TATLILAR  ");
			bw.newLine();
			bw.write("??r??n ID : " + super.getProductId());
	        bw.newLine();
			bw.write("??r??n Ad?? : " + super.getName());
	        bw.newLine();
            bw.write("??r??n T??r?? : " + super.getTypeofProduct());
            bw.newLine();
            bw.write("??r??n Fiyat?? : " + super.getPrice()+ " TL ");
            bw.newLine();
            bw.write("??r??n Kalori : " + super.getCalorie());
            bw.newLine();
            bw.write("Tatl?? T??r?? : " + super.getTypeofDessert());
            bw.newLine();
            bw.write("Tatl?? ????eri??i : " + super.getContent());
            bw.newLine();
            bw.write("Pi??irme ??ekli : " + super.getCookingStyle());
            bw.newLine();
            bw.write("Pi??irme Zaman?? : " + super.getCookingTime());
            bw.newLine();
            bw.write("Pi??irme Durumu : " + super.getCookingStatus());
            bw.newLine();
            bw.write("??neriler : " + super.getSuggestions());
            bw.newLine();
            bw.write("Sos T??r?? : " + super.getSauce());
            bw.newLine();
            bw.write("Sos ????eri??i : " + super.getSauceContent());
            bw.newLine();
            bw.write("Ekstra Malzeme : " + Additional);
            bw.newLine();
            bw.write("??eker De??eri : " + SugarValue);
            bw.newLine();
            bw.write("F??nd??k  : " + Findik);
            bw.newLine();
            bw.write("Servis ??ekli : " + Servis);
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
			bw.write(super.getName() + " = " + String.valueOf(super.getCalorie()) + " Kalori i??in " + String.valueOf(CalculateStep()) + " Ad??m At??lmas?? Gerekmektedir.");
			bw.newLine();
			bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
