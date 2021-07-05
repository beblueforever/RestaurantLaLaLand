package RestaurantLaLaLand;

import java.util.Random;


public class Product { // URUN CLASS

	
	
	
	
	
	
	 private float Calorie;     // KALORI DEGERI 
	 private String ProductId; // URUN ID ISMI 
	 private float Price; // URUN FIYATI 
	 private String Name; // URUN ISMI 
	 private String Explanation; // ACIKLAMA 
	 private String TypeofProduct; // URUNUN TURU 

	

	
	public Product( float calorie, float price, String name, String explanation,
			String typeofProduct) {
		super();
		
		Random rand = new Random(); //  RANDOM DEGER URETMEK ICIN. 
		
		
		this.Calorie = calorie;
		this.Price = price;
		this.Name = name;
		this.Explanation = explanation;
		this.TypeofProduct = typeofProduct;
		
		int a = rand.nextInt() ; // RANDOM BIR DEGER URETILDI. 
		
		 String b = String.valueOf(Math.abs(a)) ; 
		
		 ProductId = Name + "_"  + b ;
		
		
	}

	public float getCalorie() {
		
		return Calorie;
		
	}

	public float getPrice() {
		
		
		return Price ;
		
	}
    public String getName() {
		
		
		return Name ;
		
	}
    public String getExplanation() {
		
		
		return Explanation;
		
	}
    public String getProductId() {
		
		
		return ProductId ;
		
	}
    public String getTypeofProduct() {
    	
    	return TypeofProduct;
    	
    	
    }
	
	
	
	
	
	
}
