package RestaurantLaLaLand;

import java.util.Random;

public class Beverage extends Product {// ICECEK CLASSI
	
	 private String BeverageType;  // ICECEK TURU
	 private String BeverageContent; // ICECEK ICERIĞI 
	 private String BeverageSize; // ICECEK BOYUTU 
	 private String ExtraRequests; // EXTRA ISTEKLER 
	 private double CaffeineValue; // KAFEIN DEGERI 
	 private double SugarValue; // SEKER DEGERI 
	 private String MilkFlavor; // SUT AROMASI 
	 private String BeverageMaterial; // ICECEĞIN MATERYALI  
	 private String Aroma; // AROMASI 

	

	public Beverage( float calorie, float price, String name, String explanation, String typeofProduct) {
		super( calorie, price, name, explanation, typeofProduct);
		
	}
	
	
	
	public Beverage( float calorie, float price, String name, String explanation, String typeofProduct,
			String beverageType, String beverageContent, String beverageSize, String extraRequests,
			double caffeineValue, double sugarValue, String milkFlavor, String beverageMaterial, String aroma) {
		super( calorie, price, name, explanation, typeofProduct);
		this.BeverageType = beverageType;
		this.BeverageContent = beverageContent;
		this.BeverageSize = beverageSize;
		this.ExtraRequests = extraRequests;
		this.CaffeineValue = caffeineValue;
		this.SugarValue = sugarValue;
		this.MilkFlavor = milkFlavor;
		this.BeverageMaterial = beverageMaterial;
		this.Aroma = aroma;
	}



	public String getBeverageType() {
		 
		 return BeverageType;
		 
	 }
	 public String getBeverageContent() {
		 
		 return BeverageContent;
		 
	 }
	 public String getBeverageSize() {
		 
		 return BeverageSize;
		 
	 }
	 public String getExtraRequests() {
		 
		 return ExtraRequests;
		
	 }
	 public double getCaffeineValue() {
		 
		 return CaffeineValue;
		 
	 }
	 public double getSugarValue() {
		 
		 return SugarValue;
		
	 }
     public String getMilkFlavor() {
		 
		 return MilkFlavor;
		
	 }
     public String getBeverageMaterial() {
		 
		 return BeverageMaterial;
		
	 }
     public String getAroma() {
		 
		 return Aroma;
		
	 }



	public void setBeverageType(String beverageType) {
		BeverageType = beverageType;
	}



	public void setBeverageContent(String beverageContent) {
		BeverageContent = beverageContent;
	}



	public void setBeverageSize(String beverageSize) {
		BeverageSize = beverageSize;
	}



	public void setExtraRequests(String extraRequests) {
		ExtraRequests = extraRequests;
	}



	public void setCaffeineValue(double caffeineValue) {
		CaffeineValue = caffeineValue;
	}



	public void setSugarValue(double sugarValue) {
		SugarValue = sugarValue;
	}



	public void setMilkFlavor(String milkFlavor) {
		MilkFlavor = milkFlavor;
	}



	public void setBeverageMaterial(String beverageMaterial) {
		BeverageMaterial = beverageMaterial;
	}



	public void setAroma(String aroma) {
		Aroma = aroma;
	}
	
	
	
	
	
	
	
	
	
	
}
