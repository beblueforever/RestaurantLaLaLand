package RestaurantLaLaLand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Food extends Product { // YEMEK CLASS
	private String TypeOfFood; // YEMEK TURU 
	private String Content;// ICERIK 
	private String CookingStyle; // PISIRME SEKLI  
	private double  CookingTime ;// PISIRME SURESI  
	private String CookingStatus; // PISIRME DURUMU  
	private String Suggestions; // ONERILER 
	private String Spices; // BAHARATLAR 
	private String Sauce;	// Sos TURU
	
	public Food( float calorie, float price, String name, String explanation, String typeofProduct) {
		super(  calorie, price, name, explanation, typeofProduct);
		
	}
	

	public Food( float calorie, float price, String name, String explanation, String typeofProduct,
			String typeOfFood, String content, String cookingStyle, double cookingTime, String cookingStatus,
			String suggestions, String spices, String sauce) {
		super( calorie, price, name, explanation, typeofProduct);
		this.TypeOfFood = typeOfFood;
		this.Content = content;
		this.CookingStyle = cookingStyle;
		this.CookingTime = cookingTime;
		this.CookingStatus = cookingStatus;
		this.Suggestions = suggestions;
		this.Spices = spices;
		this.Sauce = sauce;
	}





	public String getTypeOfFood() {
		
		return TypeOfFood;
	}
	public String getContent() {
		
		
		return Content ;
		
	}
    public String getCookingStyle() {
		
		
		return CookingStyle ;
		
	}
    public double getCookingTime() {
		
		
		return CookingTime;
		
	}
    public String getCookingStatus() {
		
		
		return CookingStatus ;
		
	}
    public String getSuggestions() {
		
		
		return Suggestions ;
		
	}
    public String getSpices() {
		
		
		return Spices;
		
	}
    public String getSauce() {
		
		
		return Sauce ;
		
	}


	public void setTypeOfFood(String typeOfFood) {
		TypeOfFood = typeOfFood;
	}


	public void setContent(String content) {
		Content = content;
	}


	public void setCookingStyle(String cookingStyle) {
		CookingStyle = cookingStyle;
	}


	public void setCookingTime(double cookingTime) {
		CookingTime = cookingTime;
	}


	public void setCookingStatus(String cookingStatus) {
		CookingStatus = cookingStatus;
	}


	public void setSuggestions(String suggestions) {
		Suggestions = suggestions;
	}


	public void setSpices(String spices) {
		Spices = spices;
	}


	public void setSauce(String sauce) {
		Sauce = sauce;
	}
	
	
    

}
