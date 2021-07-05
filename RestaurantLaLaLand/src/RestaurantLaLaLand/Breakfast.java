package RestaurantLaLaLand;

import java.util.Random;

public class Breakfast extends Product { // KAHVALTILIK CLASS 
	
	private String BreakfastType; // KAHVALTI TURU 
	private double Temperature; // SICAKLIK
	private String Contents; // ICINDEKILER 
	private String Suggestions; // ONERILER 
	
	
	public Breakfast( float calorie, float price, String name, String explanation, String typeofProduct) {
		super( calorie, price, name, explanation, typeofProduct);
		
	}


	public Breakfast( float calorie, float price, String name, String explanation, String typeofProduct,
			String breakfastType, double temperature, String contents, String suggestions) {
		super( calorie, price, name, explanation, typeofProduct);
		this.BreakfastType = breakfastType;
		this.Temperature = temperature;
		this.Contents = contents;
		this.Suggestions = suggestions;
	}
	
	public String getBreakfastType() {
		return BreakfastType;
	}
	
	public double getTemperature() {
		return Temperature;
	}
	
	public String getContents() {
		return Contents;
	}
     
	public String getSuggestions() {
		return Suggestions;
     }
	
	public void setBreakfastType(String breakfastType) {
		BreakfastType = breakfastType;
	}


	public void setTemperature(double temperature) {
		Temperature = temperature;
	}


	public void setContents(String contents) {
		Contents = contents;
	}


	public void setSuggestions(String suggestions) {
		Suggestions = suggestions;
	}
     
}
	
	
	
	
	


