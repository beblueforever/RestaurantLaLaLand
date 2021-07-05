package RestaurantLaLaLand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ForBreakfast extends Breakfast implements Iinvoice { // KAHVALTILIK CLASS
	
	private String Species; // CINSI 
	private String SlicingStatus; // DILIMLENME DURUMU  
	private String ServiceType; // SERVIS SEKLI 
	private double Gram; // GRAMAJI 
	
	public ForBreakfast(  float calorie, float price, String name, String explanation, String typeofProduct,
			String breakfastType, double temperature, String contents, String suggestions) {
		super(calorie, price, name, explanation, typeofProduct, breakfastType, temperature, contents, suggestions);
		 
	}
	public ForBreakfast(  float calorie, float price, String name, String explanation,
			String typeofProduct) {
		super(  calorie, price, name, explanation, typeofProduct);
		 
	}
	public ForBreakfast(  float calorie, float price, String name, String explanation, String typeofProduct,
			String species, String slicingStatus, String serviceType, double gram) {
		super(   calorie, price, name, explanation, typeofProduct);
		this.Species = species;
		this.SlicingStatus = slicingStatus;
		this.ServiceType = serviceType;
		this.Gram = gram;
	}

	
	public String getSpecies() {
		
		return Species;
	}
	public void setSpecies(String species) {
		
		Species = species;
		System.out.println(" değeri girin : " + species );
	}
	public String getSlicingStatus() {
		
		return SlicingStatus;
	}
	public void setSlicingStatus(String slicingStatus) {
		
		SlicingStatus = slicingStatus;
	}
	public String getServiceType() {
		
		return ServiceType;
	}
	public void setServiceType(String serviceType) {
		
		ServiceType = serviceType;
	}
	
	
	public double getGram() {
		return Gram;
	}
	public void setGram(double gram) {
		Gram = gram;
	}
	@Override
	public float CalculateStep() {
		 
		//System.out.println(  super.getProductId() + " : " + super.getCalorie() + " Kaloriyi Yakmanız İçin  " + (super.getCalorie()*20 ) + " Adım Atmalısınız." );
		
	    return super.getCalorie() * 20 ; 
	}
	@Override
	public void WritetoFile() {
		try {
			
			BufferedWriter bw = new BufferedWriter(new  FileWriter("kahvalti.txt",true));
			bw.newLine();
			bw.write(" KAHVALTI MENÜLERİ ");
			bw.newLine();
			bw.write("Ürün ID : " + super.getProductId());
	        bw.newLine();
			bw.write("Ürün Adı : " + super.getName());
	        bw.newLine();
            bw.write("Ürün Türü : " + super.getTypeofProduct());
            bw.newLine();
            bw.write("Ürün Fiyatı : " + super.getPrice() + "TL");
            bw.newLine();
            bw.write("Kahvaltılık Türü :  " + super.getBreakfastType());
            bw.newLine();
            bw.write("Sıcaklık : " + super.getTemperature() + " C ");
            bw.newLine();
            bw.write("İçindekiler : " + super.getContents());
            bw.newLine();
            bw.write("Öneriler :  " + super.getSuggestions());
            bw.newLine();
            bw.write("Kahvaltılık Cinsi : " + Species);
            bw.newLine();
            bw.write("Dilimlenme Durumu  : " + SlicingStatus);
            bw.newLine();
            bw.write("Servis Şekli : " + ServiceType);
            bw.newLine();
            bw.write("Gramı : " + Gram + "Gram");
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
