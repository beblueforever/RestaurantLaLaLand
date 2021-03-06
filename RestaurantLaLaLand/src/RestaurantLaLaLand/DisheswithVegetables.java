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
		
		//System.out.println(  super.getProductId() + " : " + super.getCalorie() + " Kaloriyi Yakman??z ????in  " + (super.getCalorie()*20 ) + " Ad??m Atmal??s??n??z." );
		
	    return super.getCalorie() * 20 ; 
	}
	@Override
	public void WritetoFile() {
		try {
			
			BufferedWriter bw = new BufferedWriter(new  FileWriter("yemek.txt",true));
			bw.newLine();
			bw.write(" SEBZE MEN??LER?? ");
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
            bw.write("Yemek T??r?? : " + super.getTypeOfFood());
            bw.newLine();
            bw.write("????erik : " + super.getContent());
            bw.newLine();
            bw.write("Pi??irme ??ekli  : " + super.getCookingStyle());
            bw.newLine();
            bw.write("Pi??irme S??resi : " + super.getCookingTime());
            bw.newLine();
            bw.write("Pi??irme Durumu : " + super.getCookingStatus());
            bw.newLine();
            bw.write("??neriler : " + super.getSuggestions());
            bw.newLine();
            bw.write("Baharatlar : " + super.getSpices());
            bw.newLine();
            bw.write("Sos T??r?? : " + super.getSauce());
            bw.newLine();
            bw.write("Sos ????eri??i : " + SauceContent);
            bw.newLine();
            bw.write("Eklenecek Extra Malzemeler : " + ExtraMaterialstoAdd);
            bw.newLine();
            bw.write("Vitamin De??eri : " + Vitamin);
            bw.newLine();
            bw.write("Ya?? De??eri : " + Oil);
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
