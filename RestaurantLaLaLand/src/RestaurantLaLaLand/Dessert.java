package RestaurantLaLaLand;

import java.util.Random;


public class Dessert extends Product {// TATLI CLASS

	private String TypeofDessert; // TATLI TURU 
	private String Content; // ICERIK 
	private String CookingStyle; // PISIRME SEKLI  
	private String CookingTime ;// PISIRME SURESI 
	private String CookingStatus;// PISIRME DURUMU  
	private String Suggestions; // ONERILER 
	private String Sauce; // SOS 
	private String SauceContent; // SOS ICERIGI  
	
	
	public Dessert(  float calorie, float price, String name, String explanation, String typeofProduct) {
		super(  calorie, price, name, explanation, typeofProduct);
		
	}

	
	
	public Dessert(  float calorie, float price, String name, String explanation, String typeofProduct,
			String typeofDessert, String content, String cookingStyle, String cookingTime, String cookingStatus,
			String suggestions, String sauce, String sauceContent) {
		super(  calorie, price, name, explanation, typeofProduct);
		this.TypeofDessert = typeofDessert;
		this.Content = content;
		this.CookingStyle = cookingStyle;
		this.CookingTime = cookingTime;
		this.CookingStatus = cookingStatus;
		this.Suggestions = suggestions;
		this.Sauce = sauce;
		this.SauceContent = sauceContent;
	}



	public String getTypeofDessert() {
		
		return TypeofDessert;
		
	}
	
	public String getContent() {
		
		
		return Content ;
		
	}
    public String getCookingStyle() {
		
		
		return CookingStyle ;
		
	}
    public String getCookingTime() {
		
		
		return CookingTime;
		
	}
    public String getCookingStatus() {
		
		
		return CookingStatus ;
		
	}
    public String getSuggestions() {
		
		
		return Suggestions ;
		
	}
    public String getSauceContent() {
		
		
		return SauceContent;
		
	}
    public String getSauce() {
		
		
		return Sauce ;
		
	}



	public void setTypeofDessert(String typeofDessert) {
		TypeofDessert = typeofDessert;
	}



	public void setContent(String content) {
		Content = content;
	}



	public void setCookingStyle(String cookingStyle) {
		CookingStyle = cookingStyle;
	}



	public void setCookingTime(String cookingTime) {
		CookingTime = cookingTime;
	}



	public void setCookingStatus(String cookingStatus) {
		CookingStatus = cookingStatus;
	}



	public void setSuggestions(String suggestions) {
		Suggestions = suggestions;
	}



	public void setSauce(String sauce) {
		Sauce = sauce;
	}



	public void setSauceContent(String sauceContent) {
		SauceContent = sauceContent;
	}
    
	
	
	
	
	
	
	
	
	
	
}
