package data;
import java.util.*;

public interface ShoeDAO {
	
		List<Shoe> getAllShoes();

		Shoe addShoe(Shoe s);//Create
		
		List<Shoe> getShoeByBrand(String brand); //Retreive
		
		Shoe getShoeByShoeid(int shoeid);//Retrieve
		
		List<Shoe> getShoeByRpriceGreaterThanEqualTo(int rprice);//Retrieve
		
		Shoe updateShoe(Shoe s); //Update
		
		boolean deleteShoe(Shoe s); //Delete
	}