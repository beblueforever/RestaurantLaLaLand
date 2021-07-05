package RestaurantLaLaLand;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
public class CarbonatedDrinks extends Beverage implements Iinvoice   {// gazlı içecekler 

	private double DegreeofColdness;// SOGUKLUK DERECESI  
    private String Servis; // SERVIS SEKLI 
    private String Porsion; // PORSIYON 
    private String Mineral; // ICINDEKI MINERALLER
    
	
	
	public CarbonatedDrinks(  float calorie, float price, String name, String explanation,
			String typeofProduct, String beverageType, String beverageContent, String beverageSize,
			String extraRequests, double caffeineValue, double sugarValue, String milkFlavor, String beverageMaterial,
			String aroma) {
		super(  calorie, price, name, explanation, typeofProduct, beverageType, beverageContent, beverageSize,
				extraRequests, caffeineValue, sugarValue, milkFlavor, beverageMaterial, aroma);
		
	}

	public CarbonatedDrinks(  float calorie, float price, String name, String explanation,
			String typeofProduct) {
		super(  calorie, price, name, explanation, typeofProduct);
		
	}

	public CarbonatedDrinks(float calorie, float price, String name, String explanation, String typeofProduct,
			double degreeofColdness, String servis, String porsion, String mineral) {
		super(calorie, price, name, explanation, typeofProduct);
		this.DegreeofColdness = degreeofColdness;
		this.Servis = servis;
		this.Porsion = porsion;
		this.Mineral = mineral;
	}

	public double getDegreeofColdness() {
		
		return DegreeofColdness;
		
	}
	public void setDegreeofColdness(double degreeofColdness) {
		DegreeofColdness = degreeofColdness;
	}

	public String getServis() {
		return Servis;
	}

	public void setServis(String servis) {
		Servis = servis;
	}

	public String getPorsion() {
		return Porsion;
	}

	public void setPorsion(String porsion) {
		Porsion = porsion;
	}

	public String getMineral() {
		return Mineral;
	}

	public void setMineral(String mineral) {
		Mineral = mineral;
	}

	@Override
	public float CalculateStep() {

		//System.out.println(  super.getProductId() + " : " + super.getCalorie() + " Kaloriyi Yakmanız İçin  " + (super.getCalorie()*20 ) + " Adım Atmalısınız." );
		
	    return super.getCalorie() * 20 ; 
	}

	@Override
	public void WritetoFile() {
		try {
			
			BufferedWriter bw = new BufferedWriter(new  FileWriter("icecek.txt",true));
			bw.newLine();
			bw.write(" GAZLI İÇECEK MENÜLERİ ");
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
            bw.write("İçecek Türü : " + super.getBeverageType());
            bw.newLine();
            bw.write("İçecek İçeriği : " + super.getBeverageContent());
            bw.newLine();
            bw.write("İçecek Boyutu : " + super.getBeverageSize());
            bw.newLine();
            bw.write("Ekstra İstekler : " + super.getExtraRequests());
            bw.newLine();
            bw.write("Kafein Değeri : " + super.getCaffeineValue() + " Gram ");
            bw.newLine();
            bw.write("Şeker Değeri : " + super.getSugarValue() + " Gram ");
            bw.newLine();
            bw.write("Süt Aroması : " + super.getMilkFlavor());
            bw.newLine();
            bw.write("Materyal : " + super.getBeverageMaterial());
            bw.newLine();
            bw.write("İçecek Aroması : " + super.getAroma());
            bw.newLine();
            bw.write("Soğukluk Derecesi : " + DegreeofColdness + " C ");
            bw.newLine();
            bw.write("Servis Şekli : " + Servis );
            bw.newLine();
            bw.write("İçindeki Mineraller : " + Mineral );
            bw.newLine();
            bw.write("Porsiyon Değeri : " + Porsion + " ml " );
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
