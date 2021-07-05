package RestaurantLaLaLand;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MeatDishes extends Food implements Iinvoice {
	
	private String SauceSontent; // SOS ICERIGI 
	private String Vegetables; // ET YANINDA GELECEK SEBZELER 
	private String LaborType; // EKMEK TURU 
	private String Meze; // YANINDA GELECEK MEZELER/ TURŞULAR 
	
	
	
	
	public MeatDishes(  float calorie, float price, String name, String explanation, String typeofProduct,
			String typeOfFood, String content, String cookingStyle, String cookingTime, String cookingStatus,
			String suggestions, String spices, String sauce) {
		super(  calorie, price, name, explanation, typeofProduct);
		
	}

	public MeatDishes(  float calorie, float price, String name, String explanation, String typeofProduct) {
		super(  calorie, price, name, explanation, typeofProduct);
		
	}

	
	
	public MeatDishes(  float calorie, float price, String name, String explanation, String typeofProduct,
			String sauceSontent, String vegetables, String laborType, String meze) {
		super( calorie, price, name, explanation, typeofProduct);
		this.SauceSontent = sauceSontent;
		this.Vegetables = vegetables;
		this.LaborType = laborType;
		this.Meze = meze;
	}
	
	public String getSauceSontent() {
		
		return SauceSontent;
		
	}
	
	public String getVegetables() {
		
		
		return Vegetables ;
		
	}
    public String getLaborType() {
		
		
		return LaborType ;
		
	}

    public void setSauceSontent(String sauceSontent) {
		SauceSontent = sauceSontent;
	}

	public void setVegetables(String vegetables) {
		Vegetables = vegetables;
	}

	public void setLaborType(String laborType) {
		LaborType = laborType;
	}
	
	
	public String getMeze() {
		return Meze;
	}

	public void setMeze(String meze) {
		Meze = meze;
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
			bw.write(" ET MENÜLERİ ");
			bw.newLine();
			bw.write("Ürün ID : " + super.getProductId());
	        bw.newLine();
			bw.write("Ürün Adı : " + super.getName());
	        bw.newLine();
            bw.write("Ürün Türü : " + super.getTypeofProduct());
            bw.newLine();
            bw.write("Ürün Fiyatı : " + super.getPrice()+ "TL");
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
            bw.write("Sos İçeriği : " + SauceSontent);
            bw.newLine();
            bw.write("Extra Sebzeler : " + Vegetables);
            bw.newLine();
            bw.write("Ekmek Türü : " + LaborType);
            bw.newLine();
            bw.write("Turşu or Meze : " + Meze );
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
