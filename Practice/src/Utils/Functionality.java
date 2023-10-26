package Utils;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Material;
import com.app.core.Brand;
import com.app.core.StyleWithPen;


public class Functionality {
	
	private  static Material validatematerial(String material) {
		return Material.valueOf(material.toUpperCase());
		
		
	}
	
	private static Brand validateBrand(String brand) {
		return Brand.valueOf(brand.toUpperCase());
		
	}
	
	private static LocalDate ValidatestocklistingDate(String date) {
		return LocalDate.parse(date);
	}

	public static StyleWithPen validateinput(String brand, String color , String inkColor, String material,int stock,String stockListingDate
			) {
		Material mat=validatematerial(material);
		Brand b = validateBrand(brand);
		LocalDate date = ValidatestocklistingDate(stockListingDate);
		
		return new StyleWithPen(b, color, inkColor, mat,stock,date, b.getPrice());
		
	}

	

	
	
	
}