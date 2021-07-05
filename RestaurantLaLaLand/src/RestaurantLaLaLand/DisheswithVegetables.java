package RestaurantLaLaLand;
import java.io.BufferedWriter;
import java.io.FileWriter; 
import java.io.IOException;
import java.util.Random;

public class DisheswithVegetables extends Food implements Iinvoice  {
	
	private String ExtraMaterialstoAdd; // EKLENECEK EKSTRA MALZEMELER 
	private String SauceContent; // Sos ICERIGI 
	private String Vitamin; // VITAMIN DEGERI 
	private String Oil; // YAG DEGERI 
	
	
	
	public DisheswithVegetables(  float calorie, float price, String name, String explanation,
			String typeofProduct, String typeOfFood, String content, String cookingStyle, double cookingTime,
			String cookingStatus, String suggestions, String spices, String sauce) {
		super(  calorie, price, name, explanation, typeofProduct, typeOfFood, content, cookingStyle, cookingTime,
				cookingStatus, suggestions, spices, sauce);
	
	}
	public DisheswithVegetables(  float calorie, float price, String name, String explanation,
			String typeofProduct) {
		super(  calorie, price, name, explanation, typeofProduct);
		
	}
	
	
	public DisheswithVegetables(  float calorie, float price, String name, String explanation,
			String typeofProduct, String extraMaterialstoAdd, String sauceContent, String vitamin, String oil) {
		super(  calorie, price, name, explanation, typeofProduct);
		this.ExtraMaterialstoAdd = extraMaterialstoAdd;
		this.SauceContent = sauceContent;
		this.Vitamin = vitamin;
		this.Oil = oil;
	}
	public String getExtraMaterialstoAdd() {
		
		return ExtraMaterialstoAdd;
		
	}
	
	public String getSauceContent() {
		
		
		return SauceContent ;
		
	}
	public void setExtraMaterialstoAdd(String extraMaterialstoAdd) {
		ExtraMaterialstoAdd = extraMaterialstoAdd;
	}
	public void setSauceContent(String sauceContent) {
		SauceContent = sauceContent;
	}
	
	
	public String getVitamin() {
		return Vitamin;
	}
	public void setVitamin(String vitamin) {
		Vitamin = vitamin;
	}
	public String getOil() {
		return Oil;
	}
	public void setOil(String oil) {
		Oil = oil;
	}
	@Override
	public float CalculateStep() {
		
		//System.out.println(  super.getProductId() + " : " + super.getCalorie() + " Kaloriyi Yakmanız İçin  " + (super.getCalorie()*20 ) + " Adım Atmalısınız." );
		
	    return super.getCalorie() * 20 ; 
	}
	@Override
	public void WritetoFile() {
		try {
			
			BufferedWriter bw = new BufferedWriter(new  FileWriter("yemek.txt",true));
			bw.newLine();
			bw.write(" SEBZE MENÜLERİ ");
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
            bw.write("Yemek Türü : " + super.getTypeOfFood());
            bw.newLine();
            bw.write("İçerik : " + super.getContent());
            bw.newLine();
            bw.write("Pişirme Şekli  : " + super.getCookingStyle());
            bw.newLine();
            bw.write("Pişirme Süresi : " + super.getCookingTime());
            bw.newLine();
            bw.write("Pişirme Durumu : " + super.getCookingStatus());
            bw.newLine();
            bw.write("Öneriler : " + super.getSuggestions());
            bw.newLine();
            bw.write("Baharatlar : " + super.getSpices());
            bw.newLine();
            bw.write("Sos Türü : " + super.getSauce());
            bw.newLine();
            bw.write("Sos İçeriği : " + SauceContent);
            bw.newLine();
            bw.write("Eklenecek Extra Malzemeler : " + ExtraMaterialstoAdd);
            bw.newLine();
            bw.write("Vitamin Değeri : " + Vitamin);
            bw.newLine();
            bw.write("Yağ Değeri : " + Oil);
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
