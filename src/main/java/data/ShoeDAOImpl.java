package data;

import org.springframework.stereotype.Repository;


import java.util.*;

public class ShoeDAOImpl /*implements ShoeDAO*/ {
	
	Map<Integer, Shoe> shoes;
	

	
	private int index=1;
	
	
	public ShoeDAOImpl() {
		
		shoes = new TreeMap<>();
		loadSampleShoes();
		
	}
	private void loadSampleShoes() {
		shoes.put(index, new Shoe(index++,"Nike","Lebron 9","Cool Grey",170,350,"pictures/A.jpg"));
		shoes.put(index, new Shoe(index++,"Jordan","Jordan 5","Black",125,1000,"pictures/B.jpg"));
		shoes.put(index, new Shoe(index++,"Nike","Kobe 5 Bruce Lee","Yellow",150,600,"pictures/C.jpg"));
		shoes.put(index, new Shoe(index++,"Adidas","Yeezy Boost 750","Black",350,1200,"pictures/D.jpg"));
		shoes.put(index, new Shoe(index++,"Under Armour","Curry 2","Cobalt",120,225,"pictures/E.jpg"));
		shoes.put(index, new Shoe(index++,"Nike","Galaxy Foamposite","Purple",220,1200,"pictures/F.jpg"));
		shoes.put(index, new Shoe(index++,"Jordan","Jordan 11","Black-Red",125,465,"pictures/G.jpg"));
		shoes.put(index, new Shoe(index++,"Adidas","Crazy 8","Black-White",125,350,"pictures/H.jpg"));
		shoes.put(index, new Shoe(index++,"Jordan","Jordan 1","Red-White",65,2500,"pictures/I.jpg"));
		shoes.put(index, new Shoe(index++,"Nike","Air Yeezy 2","Red",245,5500,"pictures/J.jpg"));
		shoes.put(index, new Shoe(index++,"Nike","Air Mag Auto Lace","Grey",10,55000,"pictures/K.jpg"));
		shoes.put(index, new Shoe(index++,"Adidas","Yeezy Boost 350 V2","Black",220,1150,"pictures/L.jpg"));
		
	}
	
	//@Override
	public List<Shoe> getAllShoes() {
		return new ArrayList<Shoe>(shoes.values());
	}

	//@Override
	public boolean addShoe(Shoe s) {
		s.setShoeid(index++);
		shoes.put(s.getShoeid(), s);
		return true;
	}

	//@Override
	public List<Shoe> getShoeByBrand(String brand) {
		List<Shoe> l = new ArrayList<>();
		for (Shoe shoe: shoes.values()) {
			if (shoe.getBrand().equalsIgnoreCase(brand)) {
				l.add(shoe);
				}	
	}
		return l;
	}
	
	public List<Shoe> getShoeByRpriceLessThanEqualTo(int rprice) {
		ArrayList<Shoe> list = new ArrayList<>();
		for (Shoe shoe : shoes.values()) {
			if(shoe.getRprice()>=rprice) {
				list.add(shoe);
			}
		}
		return list;
	}

//	@Override
	public Shoe updateShoe(Shoe s) {
		return shoes.put(s.getShoeid(),s);
		
	}

//	@Override
	public boolean deleteShoe(Shoe s) {
		shoes.remove(s.getShoeid());
		return true;
	}
//	@Override
	public Shoe getShoeByIndex(int index) {
		return shoes.get(index);
	}

}