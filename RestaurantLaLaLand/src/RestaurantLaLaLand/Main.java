package RestaurantLaLaLand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void kalori() {
		
		 try {
        FileReader fr1 = new FileReader("adimkalori.txt");
        BufferedReader br1 = new BufferedReader(fr1);

        int i = br1.read();
        while ( i !=-1) {



            System.out.print((char)i );
            i = br1.read();

        }
        fr1.close();
        br1.close();



    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
	
	
		
	}
	
	
	
	
	public static void oku() {
		
		 try {
				File directory = new File(".");
		        File[] filesArray = directory.listFiles();
		        
		        for (File file : filesArray) {
		            if (file.isFile() && file.getName().endsWith(".txt") &&  !(file.getName().contains("adimkalori.txt"))) {
		            	FileReader fr = new FileReader(file.getName());
		            	int i;
		            	while((i=fr.read())!=-1) {
		            		System.out.print((char)i);
		            	}
		            	fr.close();
		            	System.out.println();
		            } 
		            	
		           
		        }
		       
		   
		   
		   }
		   catch(IOException e) {
			   e.printStackTrace();
			   
		   }
			
	}
	
	public static void main (String [] args) throws InterruptedException {
		
		float calorie;
		float price;
		String name;
		String explanation;
		String typeofProduct;
		
		
		Scanner scan = new Scanner (System.in);
		Scanner input = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		do {
			System.out.println("0 - Çıkış ");
			System.out.println("1 - Ürün Ekle ");
			System.out.println("2 - Tüm Ürünlerin Listesi ");
			System.out.println("3 - Kalori Adım Listesi");
			x = scan.nextInt();
			while(x<0 || x>3) {
				System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz . ");
				x = scan.nextInt();
			}
			switch(x) {
				case 0:
					System.out.println(" sistemden çıkılıyor...");
					System.exit(0);
					break;
				case 1:
					System.out.println("1 - Anayemek Menüleri ");
					System.out.println("2 - İçecek Menüleri ");
					System.out.println("3 - Tatlı Menüleri ");
					System.out.println("4 - Kahvaltı Menüleri ");
					y = input.nextInt();
					input.nextLine();
					
					while(y<1 || y>5) {
						System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz . ");
						y = input.nextInt();
						input.nextLine();
					}
					
					if (y==1) {
						System.out.println("1 - Et Yemekleri ");
						System.out.println("2 - Tavuk Yemekleri ");
						System.out.println("3 - Sebze Yemekleri ");
						y = input.nextInt();
						input.nextLine();
						
						if (y == 1) {
							System.out.print("Adı : ");
							name = input.nextLine();
							name = name.replace(" ", "_");
							
							
							System.out.print("Ürün Türü : ");
							typeofProduct = input.nextLine();
							
							System.out.print("Ürün Fiyatı : ");
							price = input.nextFloat();
							input.nextLine();
							
							System.out.print("Ürün Kalori : ");
							calorie = input.nextFloat();
							
							System.out.print("Açıklama : ");
							explanation = input.nextLine();
							input.nextLine();
							
							MeatDishes f1 = new
									MeatDishes( calorie, price, name, explanation, typeofProduct);
							
							System.out.print("Yemek Türü : ");
							f1.setTypeOfFood(input.nextLine());
							input.nextLine(); 
							
							System.out.print("İçerik : ");
							f1.setContent(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Şekli : ");
							f1.setCookingStyle(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Süresi : ");
							f1.setCookingTime(input.nextDouble());
							input.nextLine();
							
							System.out.print("Pişirme Durumu : ");
							f1.setCookingStatus(input.nextLine());
							input.nextLine();
							
							System.out.print("Öneriler : ");
							f1.setSuggestions(input.nextLine());
							input.nextLine();
							
							System.out.print("Baharatlar : ");
							f1.setSpices(input.nextLine());
							input.nextLine();
							
							System.out.print("Sos Türü : ");
							f1.setSauce(input.nextLine());
							input.nextLine();
							
							System.out.print("Sos İçeriği : ");
							f1.setSauceSontent(input.nextLine());
							input.nextLine();
							
							System.out.print("Sebzeler : ");
							f1.setVegetables(input.nextLine());
							input.nextLine();
							
							System.out.print("Ekmek Türü : ");
							f1.setLaborType(input.nextLine());
							input.nextLine(); 
							
							System.out.print("Turşu veya Meze : ");
							f1.setMeze(input.nextLine());
							
							
							f1.CalculateStep();
							f1.WritetoFile();
							f1.PrintStepCalories();
						}
						else if(y ==2) {
							
							System.out.print("Adı : ");
							name = input.nextLine();
							name = name.replace(" ", "_");
							
							System.out.print("Ürün Türü : ");
							typeofProduct = input.nextLine();
							input.nextLine();
							
							System.out.print("Ürün Fiyatı : ");
							price = input.nextFloat();
							input.nextLine();
							
							System.out.print("Ürün Kalori : ");
							calorie = input.nextFloat(); 
							
							System.out.print("Açıklama : ");
							explanation = input.nextLine();
							input.nextLine();
							
							ChickenDishes f2 = new ChickenDishes(calorie, price, name, explanation, typeofProduct);
							
							System.out.print("Yemek Türü : ");
							f2.setTypeOfFood(input.nextLine());
							input.nextLine(); 
							
							System.out.print("İçerik : ");
							f2.setContent(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Şekli : ");
							f2.setCookingStyle(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Süresi : ");
							f2.setCookingTime(input.nextDouble());
							input.nextLine();
							
							System.out.print("Pişirme Durumu : ");
							f2.setCookingStatus(input.nextLine());
							input.nextLine();
							
							System.out.print("Öneriler : ");
							f2.setSuggestions(input.nextLine());
							input.nextLine();
							
							System.out.print("Baharatlar : ");
							f2.setSpices(input.nextLine());
							input.nextLine();
							
							System.out.print("Sos Türü : ");
							f2.setSauce(input.nextLine());
							input.nextLine();
							
							System.out.print("Sos İçeriği : ");
							f2.setCauceContent(input.nextLine());
							input.nextLine();
							
							System.out.print("Mezeler : ");
							f2.setEntrees(input.nextLine());
							input.nextLine();
							
							System.out.print("Sebzeler : ");
							f2.setVegetableIngredients(input.nextLine());
							input.nextLine();
							
							System.out.print("Porsiyon Değeri : ");
							f2.setPorsion(input.nextDouble());
							
							
							
							
							f2.CalculateStep();
							f2.WritetoFile();
							f2.PrintStepCalories(); 
						}
						else if(y==3) 
						{
							System.out.print("Adı : ");
							name = input.nextLine();
							name = name.replace(" ", "_");
							
							System.out.print("Ürün Türü : ");
							typeofProduct = input.nextLine();
							
							System.out.print("Ürün Fiyatı : ");
							price = input.nextFloat();
							input.nextLine();
							
							System.out.print("Ürün Kalori : ");
							calorie = input.nextFloat(); 
							
							System.out.print("Açıklama : ");
							explanation = input.nextLine();
							input.nextLine();
							
							DisheswithVegetables f3 = new DisheswithVegetables(calorie, price, name, explanation, typeofProduct);
							
							System.out.print("Yemek Türü : ");
							f3.setTypeOfFood(input.nextLine());
							input.nextLine(); 
							
							System.out.print("İçerik : ");
							f3.setContent(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Şekli : ");
							f3.setCookingStyle(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Süresi : ");
							f3.setCookingTime(input.nextDouble());
							input.nextLine();
							
							System.out.print("Pişirme Durumu : ");
							f3.setCookingStatus(input.nextLine());
							input.nextLine();
							
							System.out.print("Öneriler : ");
							f3.setSuggestions(input.nextLine());
							input.nextLine();
							
							System.out.print("Baharatlar : ");
							f3.setSpices(input.nextLine());
							input.nextLine();
							
							System.out.print("Sos Türü : ");
							f3.setSauce(input.nextLine());
							input.nextLine();
							
							System.out.print("Sos İçeriği : ");
							f3.setSauceContent(input.nextLine());
							input.nextLine();
							
							System.out.print("Eklenecek Ekstra Malzemeler : ");
							f3.setExtraMaterialstoAdd(input.nextLine());
							input.nextLine();
							
							System.out.print("Vitamin Değeri : ");
							f3.setVitamin(input.nextLine());
							input.nextLine();
							
							System.out.print("Yağ Değeri : ");
							f3.setOil(input.nextLine());
							
							
							
							
							
							f3.CalculateStep();
							f3.WritetoFile();
							f3.PrintStepCalories();
						}
						
						
						
					}else if(y==2) {
						
						System.out.println("1 - Sıcak İçecekler  ");
						System.out.println("2 - Soğuk İçecekler  ");
						System.out.println("3 - Gazlı İçecekler  ");
						
						y = input.nextInt();
						input.nextLine();
						
						if (y==1) {
							
							System.out.print("Adı : ");
							name = input.nextLine();
							name = name.replace(" ", "_");
							
							System.out.print("Ürün Türü : ");
							typeofProduct = input.nextLine();
							
							System.out.print("Ürün Fiyatı : ");
							price = input.nextFloat();
							input.nextLine();
							
							System.out.print("Ürün Kalori : ");
							calorie = input.nextFloat(); 
							
							System.out.print("Açıklama : ");
							explanation = input.nextLine();
							input.nextLine();
							
							HotDrinks d1 = new HotDrinks(calorie, price, name, explanation, typeofProduct);
							
							System.out.print("İçecek Türü : ");
							d1.setBeverageType(input.nextLine());
							input.nextLine();
							
							System.out.print("İçecek İçeriği : ");
							d1.setBeverageContent(input.nextLine());
							input.nextLine();
							
							System.out.print("İçecek Boyutu : ");
							d1.setBeverageSize(input.nextLine());
							input.nextLine();
							
							System.out.print("Ekstra İstekler : ");
							d1.setExtraRequests(input.nextLine());
							input.nextLine();
							
							System.out.print("Kafein Değeri : ");
							d1.setCaffeineValue(input.nextDouble());
							input.nextLine();
							
							System.out.print("Şeker Değeri : ");
							d1.setSugarValue(input.nextDouble());
							input.nextLine();
							
							System.out.print("Süt Aroması : ");
							d1.setMilkFlavor(input.nextLine());
							input.nextLine();
							
							System.out.print("Materyal : ");
							d1.setBeverageMaterial(input.nextLine());
							input.nextLine();
							
							System.out.print("İçecek Aroması : ");
							d1.setAroma(input.nextLine());
							input.nextLine();
							
							System.out.print("Sıcaklık : ");
							d1.setTemperatureDegree(input.nextDouble());
							input.nextLine();
							
							System.out.print("Porsiyon : ");
							d1.setPorsiyon(input.nextLine());
							input.nextLine();
							
							System.out.print("Şurup : ");
							d1.setSurup(input.nextLine());
							
							System.out.print("Limon : ");
							d1.setMeyve(input.nextLine());
							input.nextLine();
							
							
							
							d1.CalculateStep();
							d1.WritetoFile();
							d1.PrintStepCalories();
							
							
							
							
							
						}
						else if (y==2) {
							
							System.out.print("Adı : ");
							name = input.nextLine();
							name = name.replace(" ", "_");
							
							System.out.print("Ürün Türü : ");
							typeofProduct = input.nextLine();
							
							System.out.print("Ürün Fiyatı : ");
							price = input.nextFloat();
							input.nextLine();
							
							System.out.print("Ürün Kalori : ");
							calorie = input.nextFloat(); 
							
							System.out.print("Açıklama : ");
							explanation = input.nextLine();
							input.nextLine();
							
							ColdDrinks d2 = new ColdDrinks(calorie, price, name, explanation, typeofProduct);
							
							System.out.print("İçecek Türü : ");
							d2.setBeverageType(input.nextLine());
							input.nextLine();
							
							System.out.print("İçecek İçeriği : ");
							d2.setBeverageContent(input.nextLine());
							input.nextLine();
							
							System.out.print("İçecek Boyutu : ");
							d2.setBeverageSize(input.nextLine());
							input.nextLine();
							
							System.out.print("Ekstra İstekler : ");
							d2.setExtraRequests(input.nextLine());
							input.nextLine();
							
							System.out.print("Kafein Değeri : ");
							d2.setCaffeineValue(input.nextDouble());
							input.nextLine();
							
							System.out.print("Şeker Değeri : ");
							d2.setSugarValue(input.nextDouble());
							input.nextLine();
							
							System.out.print("Süt Aroması : ");
							d2.setMilkFlavor(input.nextLine());
							input.nextLine();
							
							System.out.print("Materyal : ");
							d2.setBeverageMaterial(input.nextLine());
							input.nextLine();
							
							System.out.print("İçecek Aroması : ");
							d2.setAroma(input.nextLine());
							input.nextLine();
							
							System.out.print("Soğukluk : ");
							d2.setDegreeofColdness(input.nextDouble());
							input.nextLine();
							
							System.out.print("Mineral : ");
							d2.setMineral(input.nextLine());
							input.nextLine();
							
							System.out.print("Vitamin : ");
							d2.setVitamin(input.nextLine());
							input.nextLine();
							
							System.out.print("pH  : ");
							d2.setPh(input.nextDouble());
							
							d2.CalculateStep();
							d2.WritetoFile();
							d2.PrintStepCalories();
							
							
						}
						else if (y==3) {
							
							System.out.print("Adı : ");
							name = input.nextLine();
							name = name.replace(" ", "_");
							
							System.out.print("Ürün Türü : ");
							typeofProduct = input.nextLine();
							
							System.out.print("Ürün Fiyatı : ");
							price = input.nextFloat();
							input.nextLine();
							
							System.out.print("Ürün Kalori : ");
							calorie = input.nextFloat(); 
							
							System.out.print("Açıklama : ");
							explanation = input.nextLine();
							input.nextLine();
							
							CarbonatedDrinks d3 = new CarbonatedDrinks(calorie, price, name, explanation, typeofProduct);
							
							System.out.print("İçecek Türü : ");
							d3.setBeverageType(input.nextLine());
							input.nextLine();
							
							System.out.print("İçecek İçeriği : ");
							d3.setBeverageContent(input.nextLine());
							input.nextLine();
							
							System.out.print("İçecek Boyutu : ");
							d3.setBeverageSize(input.nextLine());
							input.nextLine();
							
							System.out.print("Ekstra İstekler : ");
							d3.setExtraRequests(input.nextLine());
							input.nextLine();
							
							System.out.print("Kafein Değeri : ");
							d3.setCaffeineValue(input.nextDouble());
							input.nextLine();
							
							System.out.print("Şeker Değeri : ");
							d3.setSugarValue(input.nextDouble());
							input.nextLine();
							
							System.out.print("Süt Aroması : ");
							d3.setMilkFlavor(input.nextLine());
							input.nextLine();
							
							System.out.print("Materyal : ");
							d3.setBeverageMaterial(input.nextLine());
							input.nextLine();
							
							System.out.print("İçecek Aroması : ");
							d3.setAroma(input.nextLine());
							input.nextLine();
							
							System.out.print("Soğukluk Derecesi : ");
							d3.setDegreeofColdness(input.nextDouble());
							input.nextLine();
							input.nextLine();
							
							System.out.print("Servis Şekli : ");
							d3.setServis(input.nextLine());
							input.nextLine();
							
							System.out.print("İçindeki Mineraller : ");
							d3.setMineral(input.nextLine());
							input.nextLine();
							
							System.out.print("Porsiyon Değeri : ");
							d3.setPorsion(input.nextLine());
							
							d3.CalculateStep();
							d3.WritetoFile();
							d3.PrintStepCalories();
							
						}
						
						
					}
					else if(y==3) {
						
						
						System.out.println(" 1 - Sütlü Tatlılar ");
						System.out.println(" 2 - Şerbetli Tatlılar ");
						System.out.println(" 3 - Kremalı Tatlılar ");
						System.out.println(" 4 - Kurabiyeler  ");
						y = input.nextInt();
						input.nextLine();
						
						
						if (y==1) {
							
							System.out.print("Adı : ");
							name = input.nextLine();
							name = name.replace(" ", "_");
							
							System.out.print("Ürün Türü : ");
							typeofProduct = input.nextLine();
							
							System.out.print("Ürün Fiyatı : ");
							price = input.nextFloat();
							input.nextLine();
							
							System.out.print("Ürün Kalori : ");
							calorie = input.nextFloat(); 
							
							System.out.print("Açıklama : ");
							explanation = input.nextLine();
							input.nextLine();
							
							MilkyDesserts t1 = new MilkyDesserts(calorie, price, name, explanation, typeofProduct);
							
							System.out.print("Tatlı Türü : ");
							t1.setTypeofDessert(input.nextLine());
							input.nextLine();
							
							System.out.print("Tatlı İçeriği : ");
							t1.setContent(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Şekli : ");
							t1.setCookingStyle(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Zamanı : ");
							t1.setCookingTime(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Durumu : ");
							t1.setCookingStatus(input.nextLine());
							input.nextLine();
							
							System.out.print("Öneriler : ");
							t1.setSuggestions(input.nextLine());
							input.nextLine();
							
							System.out.print("Sos Türü : ");
							t1.setSauce(input.nextLine());
							input.nextLine();
							
							System.out.print("Sos İçeriği : ");
							t1.setSauceContent(input.nextLine());
							input.nextLine();
							
							System.out.print("Aroma : ");
							t1.setAroma(input.nextLine());
							input.nextLine();
							
							System.out.print("Meyve : ");
							t1.setFruit(input.nextLine());
							input.nextLine();
							
							System.out.print("Şeker Değeri : ");
							t1.setSugar(input.nextDouble());
							input.nextLine();
							
							System.out.print("Servis Şekli : ");
							t1.setServis(input.nextLine());
						
							
							t1.CalculateStep();
							t1.WritetoFile();
							t1.PrintStepCalories();
							
							
							
							
						}
						else if (y==2) {
							
							System.out.print("Adı : ");
							name = input.nextLine();
							name = name.replace(" ", "_");
							
							System.out.print("Ürün Türü : ");
							typeofProduct = input.nextLine();
							
							System.out.print("Ürün Fiyatı : ");
							price = input.nextFloat();
							input.nextLine();
							
							System.out.print("Ürün Kalori : ");
							calorie = input.nextFloat(); 
							
							System.out.print("Açıklama : ");
							explanation = input.nextLine();
							input.nextLine();
							
							SugaryDesserts t2 = new SugaryDesserts(calorie, price, name, explanation, typeofProduct);
							
							System.out.print("Tatlı Türü : ");
							t2.setTypeofDessert(input.nextLine());
							
							
							System.out.print("Tatlı İçeriği : ");
							t2.setContent(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Şekli : ");
							t2.setCookingStyle(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Zamanı : ");
							t2.setCookingTime(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Durumu : ");
							t2.setCookingStatus(input.nextLine());
							input.nextLine();
							
							System.out.print("Öneriler : ");
							t2.setSuggestions(input.nextLine());
							input.nextLine();
							
							System.out.print("Sos Türü : ");
							t2.setSauce(input.nextLine());
							input.nextLine();
							
							System.out.print("Sos İçeriği : ");
							t2.setSauceContent(input.nextLine());
							
							System.out.print("Şeker Değeri : ");
							t2.setSugarValue(input.nextDouble());
							input.nextLine();
							
							System.out.print("Extra Eklenen Malzemeler : ");
							t2.setAdditional(input.nextLine());
							input.nextLine(); 
							
							System.out.print("Fındık : ");
							t2.setFindik(input.nextLine());
							
							System.out.print("Servis Şekli : ");
							t2.setServis(input.nextLine());
						
							
							t2.CalculateStep();
							t2.WritetoFile();
							t2.PrintStepCalories();
							
						}
						else if (y==3) {
							System.out.print("Adı : ");
							name = input.nextLine();
							name = name.replace(" ", "_");
							
							System.out.print("Ürün Türü : ");
							typeofProduct = input.nextLine();
							
							System.out.print("Ürün Fiyatı : ");
							price = input.nextFloat();
							input.nextLine();
							
							System.out.print("Ürün Kalori : ");
							calorie = input.nextFloat(); 
							
							System.out.print("Açıklama : ");
							explanation = input.nextLine();
							input.nextLine();
							
							Cakes t3 = new Cakes(calorie, price, name, explanation, typeofProduct);
							
							System.out.print("Tatlı Türü : ");
							t3.setTypeofDessert(input.nextLine());
							input.nextLine();
							
							System.out.print("Tatlı İçeriği : ");
							t3.setContent(input.nextLine());
							
							System.out.print("Pişirme Şekli : ");
							t3.setCookingStyle(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Zamanı : ");
							t3.setCookingTime(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Durumu : ");
							t3.setCookingStatus(input.nextLine());
							input.nextLine();
							
							System.out.print("Öneriler : ");
							t3.setSuggestions(input.nextLine());
							input.nextLine();
							
							System.out.print("Sos Türü : ");
							t3.setSauce(input.nextLine());
							input.nextLine();
							
							System.out.print("Sos İçeriği : ");
							t3.setSauceContent(input.nextLine());
							input.nextLine();
							
							System.out.print("Şeker Değeri : ");
							t3.setSugarValue(input.nextDouble());
							input.nextLine();
							
							System.out.print("Aroma : ");
							t3.setAroma(input.nextLine());
							input.nextLine();
							
							System.out.print("Krema : ");
							t3.setKrema(input.nextLine());
							input.nextLine();
							
							System.out.print("Krema Aroması : ");
							t3.setKremaAroma(input.nextLine());
							
							t3.CalculateStep();
							t3.WritetoFile();
							t3.PrintStepCalories();
							
						}
					else if (y==4) {
						System.out.print("Adı : ");
						name = input.nextLine();
						name = name.replace(" ", "_");
						
						System.out.print("Ürün Türü : ");
						typeofProduct = input.nextLine();
						input.nextLine();
						
						System.out.print("Ürün Fiyatı : ");
						price = input.nextFloat();
						input.nextLine();
						input.nextLine();
						
						System.out.print("Ürün Kalori : ");
						calorie = input.nextFloat(); 
						
						System.out.print("Açıklama : ");
						explanation = input.nextLine();
						input.nextLine();
						
						Cookies t4 = new Cookies(calorie, price, name, explanation, typeofProduct);
						
						System.out.print("Tatlı Türü : ");
						t4.setTypeofDessert(input.nextLine());
						input.nextLine();
						
						System.out.print("Tatlı İçeriği : ");
						t4.setContent(input.nextLine());
						
						System.out.print("Pişirme Şekli : ");
						t4.setCookingStyle(input.nextLine());
						input.nextLine();
						
						System.out.print("Pişirme Zamanı : ");
						t4.setCookingTime(input.nextLine());
						input.nextLine();
						
						System.out.print("Pişirme Durumu : ");
						t4.setCookingStatus(input.nextLine());
						input.nextLine();
						
						System.out.print("Öneriler : ");
						t4.setSuggestions(input.nextLine());
						input.nextLine();
						
						System.out.print("Sos Türü : ");
						t4.setSauce(input.nextLine());
						input.nextLine();
						input.nextLine();
						
						System.out.print("Sos İçeriği : ");
						t4.setSauceContent(input.nextLine());
						
						System.out.print("Şeker Değeri : ");
						t4.setSugarValue(input.nextDouble());
						input.nextLine();
						
						System.out.print("Aroma : ");
						t4.setAroma(input.nextLine());
						input.nextLine();
						
						System.out.print("Şekerli veya Tuzlu : ");
						t4.setSweetOrSalty(input.nextLine());
						input.nextLine();
						
						System.out.print("Porsiyon : ");
						t4.setPorsion(input.nextLine());
					
						
						t4.CalculateStep();
						t4.WritetoFile();
						t4.PrintStepCalories();
							
					}
	
					}
					else if(y==4) {
						
						System.out.println(" 1 - Tost ");
						System.out.println(" 2 - Omlet ");
						System.out.println(" 3 - Kahvaltılık ");
					
						y = input.nextInt();
						input.nextLine();
						
						if (y==1) {
							
							System.out.print("Adı : ");
							name = input.nextLine();
							name = name.replace(" ", "_");
							
							System.out.print("Ürün Türü : ");
							typeofProduct = input.nextLine();
							input.nextLine();
							
							System.out.print("Ürün Fiyatı : ");
							price = input.nextFloat();
							input.nextLine();
							
							System.out.print("Ürün Kalori : ");
							calorie = input.nextFloat(); 
							input.nextLine();
							
							System.out.print("Açıklama : ");
							explanation = input.nextLine();
							input.nextLine();
							
							Toast k1 = new Toast(calorie, price, name, explanation, typeofProduct);
							
							System.out.print("Kahvaltılık Türü : ");
							k1.setBreakfastType(input.nextLine());
							
							
							System.out.print("Sıcaklık : ");
							k1.setTemperature(input.nextDouble());
							
							System.out.print("İçindekiler : ");
							k1.setContents(input.nextLine());
							input.nextLine();
							
							System.out.print("Öneriler : ");
							k1.setSuggestions(input.nextLine());
							input.nextLine();
							
							System.out.print("Çıtır or Yumuşak : ");
							k1.setSoftness(input.nextLine());
							input.nextLine();
							
							System.out.print("Yağ : ");
							k1.setOil(input.nextLine());
							input.nextLine();
							
							System.out.print("Ekstra İstekler : ");
							k1.setWants(input.nextLine());
							input.nextLine();
							
							System.out.print("Tost Ekmeğinin Türü : ");
							k1.setEkmek(input.nextLine());
							
	
							k1.CalculateStep();
							k1.WritetoFile();
							k1.PrintStepCalories();
								
						}
						
						else if (y==2) {
							
							System.out.print("Adı : ");
							name = input.nextLine();
							name = name.replace(" ", "_");
							
							System.out.print("Ürün Türü : ");
							typeofProduct = input.nextLine();
							
							System.out.print("Ürün Fiyatı : ");
							price = input.nextFloat();
							input.nextLine();
							
							System.out.print("Ürün Kalori : ");
							calorie = input.nextFloat(); 
							
							System.out.print("Açıklama : ");
							explanation = input.nextLine();
							input.nextLine();
							
							Omelette k2 = new Omelette(calorie, price, name, explanation, typeofProduct);
							
							System.out.print("Kahvaltılık Türü : ");
							k2.setBreakfastType(input.nextLine());
							input.nextLine();
							
							System.out.print("Sıcaklık : ");
							k2.setTemperature(input.nextDouble());
							
							System.out.print("İçindekiler : ");
							k2.setContents(input.nextLine());
							input.nextLine();
							
							System.out.print("Öneriler : ");
							k2.setSuggestions(input.nextLine());
							input.nextLine();
							
							System.out.print("Sebzeler : ");
							k2.setVegetables(input.nextLine());
							input.nextLine();
							
							System.out.print("Yağ : ");
							k2.setOil(input.nextLine());
							input.nextLine();
							
							System.out.print("Pişirme Durumu : ");
							k2.setCookingStatus(input.nextLine());
							input.nextLine();
							
							System.out.print("Sucuk or Sosis : ");
							k2.setSucuk(input.nextLine());
	
							k2.CalculateStep();
							k2.WritetoFile();
							k2.PrintStepCalories();
							
						}
						
						else if (y==3) {
							
							System.out.print("Adı : ");
							name = input.nextLine();
							name = name.replace(" ", "_");
							
							System.out.print("Ürün Türü : ");
							typeofProduct = input.nextLine();
							
							System.out.print("Ürün Fiyatı : ");
							price = input.nextFloat();
							input.nextLine();
							
							System.out.print("Ürün Kalori : ");
							calorie = input.nextFloat(); 
							input.nextLine();
							
							System.out.print("Açıklama : ");
							explanation = input.nextLine();
							input.nextLine();
							
							ForBreakfast k3 = new ForBreakfast(calorie, price, name, explanation, typeofProduct);
							
							System.out.print("Kahvaltılık Türü : ");
							k3.setBreakfastType(input.nextLine());
							input.nextLine();
							
							System.out.print("Sıcaklık : ");
							k3.setTemperature(input.nextDouble());
							input.nextLine();
							
							System.out.print("İçindekiler : ");
							k3.setContents(input.nextLine());
							input.nextLine();
							
							System.out.print("Kahvaltılık Cinsi : ");
							k3.setSpecies(input.nextLine());
							input.nextLine();
							
							System.out.println(" Öneriler : ");
							k3.setSuggestions(input.nextLine());
							input.nextLine(); 
							
							System.out.println( "Dilimlenme Durumu  : ");
							k3.setSlicingStatus(input.nextLine());
							input.nextLine();
							
							System.out.print("Servis Şekli : ");
							k3.setServiceType(input.nextLine());
							input.nextLine();
							
							System.out.print("Gramı : ");
							k3.setGram(input.nextDouble());
							
							k3.CalculateStep();
							k3.WritetoFile();
							k3.PrintStepCalories();
								
							
							
						}
						
						
					}
					break;
				case 2:
					oku();
					System.out.println("");
					break;
				case 3:
					
					kalori();
					System.out.println("");
					break;
			}
			
			
		}while(x!=0);
		
		
		
		
	}

}

