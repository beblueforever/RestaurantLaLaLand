package RestaurantLaLaLand;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ChickenDishes extends Food implements Iinvoice { // TAVUKLU YEMEKLER 
	
	private String Entrees ; // MEZELER
	private String VegetableIngredients; // ICINDEKI SEBZELER  
	private String CauceContent; // SOS ICERIGI 
	private double Porsion; // PORSIYON DEĞERI 
	
	public ChickenDishes(  float calorie, float price, String name, String explanation, String typeofProduct,
			String typeOfFood, String content, String cookingStyle, double cookingTime, String cookingStatus,
			String suggestions, String spices, String sauce) {
		super( calorie, price, name, explanation, typeofProduct, typeOfFood, content, cookingStyle, cookingTime,
				cookingStatus, suggestions, spices, sauce);
		
	}
	public ChickenDishes(  float calorie, float price, String name, String explanation,
			String typeofProduct) {
		super(  calorie, price, name, explanation, typeofProduct);
		
	}
	
	
	
	public ChickenDishes(  float calorie, float price, String name, String explanation, String typeofProduct,
			String entrees, String vegetableIngredients, String cauceContent, double Porsion) {
		super(  calorie, price, name, explanation, typeofProduct);
		this.Entrees = entrees;
		this.VegetableIngredients = vegetableIngredients;
		this.CauceContent = cauceContent;
		this.Porsion = Porsion ;
	}
public String getEntrees() {
		
		return Entrees;
		
	}
	
	public String getVegetableIngredients() {
		
		
		return VegetableIngredients ;
		
	}
    public String getCauceContent() {
		
		
		return CauceContent ;
		
	}
	public void setEntrees(String entrees) {
		Entrees = entrees;
	}
	public void setVegetableIngredients(String vegetableIngredients) {
		VegetableIngredients = vegetableIngredients;
	}
	public void setCauceContent(String cauceContent) {
		CauceContent = cauceContent;
	}

	 
	public double getPorsion() {
		return Porsion;
	}
	public void setPorsion(double porsion) {
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
			
			BufferedWriter bw = new BufferedWriter(new  FileWriter("yemek.txt",true));
			bw.newLine();
			bw.write(" TAVUK MENÜLERİ ");
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
            bw.write("Sos İçeriği : " + CauceContent);
            bw.newLine();
            bw.write("Mezeler : " + Entrees);
            bw.newLine();
            bw.write("Extra Sebzeler : " + VegetableIngredients);
            bw.newLine();
            bw.write("Porsiyon Değeri : " + Porsion + " Gram ");
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
			bw.write(super.getName() + " = " + String.valueOf(super.getCalorie()) + " kalori icin " + String.valueOf(CalculateStep()) + " adim atilmasi gerekmektedir.");
			bw.newLine();
			bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
