package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class ShoeDAOImplDB implements ShoeDAO {

	private static String url = "jdbc:mysql://localhost:3306/shoedb";
	private String user = "user";
	private String pass = "user";
	
	public ShoeDAOImplDB() {
		  try {
		    Class.forName("com.mysql.jdbc.Driver");
		  } catch (ClassNotFoundException e) {
		    e.printStackTrace();
		    System.err.println("Error loading MySQL Driver!!!");
		  }
		}	
	
	
	@Override
	public List<Shoe> getAllShoes() {
		Shoe shoe = null; 
		List<Shoe> list = new ArrayList<>();
		try {
			    Connection conn = DriverManager.getConnection(url, user, pass);
			    String sql = "SELECT * FROM shoe";
			    PreparedStatement stmt = conn.prepareStatement(sql);
			    //stmt.setString(1, "%"+keyword+"%");
			    ResultSet rs = stmt.executeQuery();
			    while (rs.next()) {
			    int id = rs.getInt(1);  
			    	String brand = rs.getString(2);
			    String style = rs.getString(3);
			    String color = rs.getString(4);
			    int pprice = rs.getInt(5);
			    int rprice = rs.getInt(6);
			    String imageurl = rs.getString(7);
			    shoe = new Shoe(id,brand,style,color,pprice,rprice,imageurl);
			      list.add(shoe);
			    }
			    rs.close();
			    stmt.close();
			    conn.close();
			  } catch (SQLException e) {
			    e.printStackTrace();
			  }
		return list;
	}

	@Override
	public boolean addShoe(Shoe s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Shoe> getShoeByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shoe getShoeByIndex(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Shoe> getShoeByRpriceLessThanEqualTo(int rprice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shoe updateShoe(Shoe s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteShoe(Shoe s) {
		// TODO Auto-generated method stub
		return false;
	}

}
