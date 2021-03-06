package RestaurantLaLaLand;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class HotDrinks extends Beverage implements Iinvoice  {// SICAK ICECEKLER

	private double TemperatureDegree; // SICAKLIK DERECESI 
	private String Porsiyon;// PORSIYON MIKTARI
	private String Surup; // EKSTRA TATLI SURUP
	private String Meyve; // CAYA MEYVE EKLENECEK MI 

	
	
	public HotDrinks(  float calorie, float price, String name, String explanation, String typeofProduct,
			String beverageType, String beverageContent, String beverageSize, String extraRequests,
			double caffeineValue, double sugarValue, String milkFlavor, String beverageMaterial, String aroma) {
		super(  calorie, price, name, explanation, typeofProduct, beverageType, beverageContent, beverageSize,
				extraRequests, caffeineValue, sugarValue, milkFlavor, beverageMaterial, aroma);
		
	}
	public HotDrinks(  float calorie, float price, String name, String explanation, String typeofProduct) {
		super(  calorie, price, name, explanation, typeofProduct);
		
	}
	
	
	
	public HotDrinks(  float calorie, float price, String name, String explanation, String typeofProduct,
			double temperatureDegree, String porsiyon, String surup, String meyve) {
		super(  calorie, price, name, explanation, typeofProduct);
		this.TemperatureDegree = temperatureDegree;
		this.Meyve = meyve;
		this.Porsiyon = porsiyon;
		this.Surup = surup;
	}
	
	public double getTemperatureDegree() {
		return TemperatureDegree;
	}
	public void setTemperatureDegree(double temperatureDegree) {
		TemperatureDegree = temperatureDegree;
	}
	
	
	public String getPorsiyon() {
		return Porsiyon;
	}
	public void setPorsiyon(String porsiyon) {
		Porsiyon = porsiyon;
	}
	public String getSurup() {
		return Surup;
	}
	public void setSurup(String surup) {
		Surup = surup;
	}
	public String getMeyve() {
		return Meyve;
	}
	public void setMeyve(String meyve) {
		Meyve = meyve;
	}
	@Override
	public float CalculateStep() {
		
		//System.out.println(  super.getProductId() + " : " + super.getCalorie() + " Kaloriyi Yakman??z ????in  " + (super.getCalorie()*20 ) + " Ad??m Atmal??s??n??z." );
		
	    return super.getCalorie() * 20 ; 
	}
	@Override
	public void WritetoFile() {
		try {
			
			BufferedWriter bw = new BufferedWriter(new  FileWriter("icecek.txt",true));
			bw.newLine();
			bw.write(" SICAK ????ECEK MEN??LER?? ");
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
            bw.write("????ecek T??r?? : " + super.getBeverageType());
            bw.newLine();
            bw.write("????ecek ????eri??i : " + super.getBeverageContent());
            bw.newLine();
            bw.write("????ecek Boyutu : " + super.getBeverageSize());
            bw.newLine();
            bw.write("Ekstra ??stekler : " + super.getExtraRequests());
            bw.newLine();
            bw.write("Kafein De??eri : " + super.getCaffeineValue());
            bw.newLine();
            bw.write("??eker De??eri : " + super.getSugarValue());
            bw.newLine();
            bw.write("S??t Aromas?? : " + super.getMilkFlavor());
            bw.newLine();
            bw.write("Materyal : " + super.getBeverageMaterial());
            bw.newLine();
            bw.write("????ecek Aromas?? : " + super.getAroma());
            bw.newLine();
            bw.write("S??cakl??k Derecesi : " + TemperatureDegree + " C ");
            bw.newLine();
            bw.write("Porsiyon : " + Porsiyon + "ml");
            bw.newLine();
            bw.write("??urup : " + Surup );
            bw.newLine();
            bw.write("Limon : " + Meyve );
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
