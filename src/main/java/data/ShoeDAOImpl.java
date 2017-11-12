package data;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class ShoeDAOImpl implements ShoeDAO {
	
	Map<Integer, Shoe> shoes;
	

	
	private int index=1;
	
	
	public ShoeDAOImpl() {
		
		shoes = new HashMap<>();
		loadSampleShoes();
		
	}
	private void loadSampleShoes() {
		shoes.put(index, new Shoe(index++,"Nike","Lebron 9","Cool Grey",170,350,"A.jpg"));
		shoes.put(index, new Shoe(index++,"Jordan","Jordan 5","Black",125,1000,"B.jpg"));
		shoes.put(index, new Shoe(index++,"Nike","Kobe 5 Bruce Lee","Yellow",150,600,"C.jpg"));
		shoes.put(index, new Shoe(index++,"Adidas","Yeezy Boost 750","Black",350,1200,"D.jpg"));
		shoes.put(index, new Shoe(index++,"Under Armour","Curry 2","Cobalt",120,225,"E.jpg"));
		shoes.put(index, new Shoe(index++,"Nike","Galaxy Foamposite","Purple",220,1200,"F.jpg"));
		shoes.put(index, new Shoe(index++,"Jordan","Jordan 11","Black-Red",125,465,"G.jpg"));
		shoes.put(index, new Shoe(index++,"Adidas","Crazy 8","Black-White",125,350,"H.jpg"));
		shoes.put(index, new Shoe(index++,"Jordan","Jordan 1","Red-White",65,2500,"I.jpg"));
		shoes.put(index, new Shoe(index++,"Nike","Air Yeezy 2","Red",245,5500,"J.jpg"));
		shoes.put(index, new Shoe(index++,"Nike","Air Mag Auto Lace","Grey",10,55000,"K.jpg"));
		
	}
	
	@Override
	public List<Shoe> getAllShoes() {
		return new ArrayList<Shoe>(shoes.values());
	}

	@Override
	public boolean addShoe(Shoe s) {
		s.setIndex(index++);
		shoes.put(s.getIndex(), s);
		return true;
	}

	@Override
	public List<Shoe> getShoeByBrand(String brand) {
		List<Shoe> l = new ArrayList<>();
		
		for (Shoe shoe: shoes.values()) {
			if (shoe.getBrand().equalsIgnoreCase(brand)) {
				l.add(shoe);
				}	
	}
		return l;
		
	}

	@Override
	public Shoe updateShoe(Shoe s) {
		return shoes.put(s.getIndex(),s);
		
	}

	@Override
	public boolean deleteShoe(Shoe s) {
		shoes.remove(s.getIndex());
		return true;
	}
	@Override
	public Shoe getShoeByIndex(int index) {
		return shoes.get(index);
	}

}