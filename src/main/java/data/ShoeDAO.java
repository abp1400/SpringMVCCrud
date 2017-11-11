package data;
import java.util.*;
public interface ShoeDAO {
	
		List<Shoe> getAllShoes();

		boolean addShoe(Shoe s);//Create
		
		Shoe  getShoeByBrand(String brand); //Retreive
		
		Shoe updateShoe(Shoe s); //Update
		
		boolean deleteShoe(Shoe s); //Delete
	}