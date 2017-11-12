package data;
import java.util.*;

public interface ShoeDAO {
	
		List<Shoe> getAllShoes();

		boolean addShoe(Shoe s);//Create
		
		List<Shoe> getShoeByBrand(String brand); //Retreive
		
		Shoe getShoeByIndex(int index);//Retrieve
		
		List<Shoe> getShoeByRpriceLessThanEqualTo(int rprice);//Retrieve
		
		Shoe updateShoe(Shoe s); //Update
		
		boolean deleteShoe(Shoe s); //Delete
	}