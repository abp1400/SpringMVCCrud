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

import com.mysql.jdbc.Statement;



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
	public Shoe addShoe(Shoe s) {
		    try {
		      Connection conn = DriverManager.getConnection(url, user, pass);

		    		String sql = "INSERT INTO shoe (brand, style,color,purchase_price, resale_price, image_url)"
		    		            +" VALUES (?, ?, ?, ?, ?,?)";
		    		            
		    		            PreparedStatement st = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		    		            st.setString(1, s.getBrand());
		    		            st.setString(2,s.getStyle());
		    		            st.setString(3,s.getColor());
		    		            st.setInt(4,s.getPprice());
		    		            st.setInt(5, s.getRprice());
		    		            st.setString(6,s.getImageUrl());
		   
		      int uc = st.executeUpdate();
		      if (uc == 1) {
		    		      ResultSet keys = st.getGeneratedKeys();
		    		      if (keys.next()) {
		    		        int newShoeId = keys.getInt(1);
		    		        s.setShoeid(newShoeId);
		    		        System.out.println(uc + " shoe record created");
		    		        conn.close();
		    		    
		    		        }
		    		      }
		    		     else {
		    		      s = null;
		    		    }    
		      }
		    catch (SQLException e) {
		      e.printStackTrace();
		      s = null;
		    }
		    return s;
		}
	

	@Override
	public List<Shoe> getShoeByBrand(String brand) {
		Shoe s = null; 
		List<Shoe> list = new ArrayList<>();
		
		try {
		    Connection conn = DriverManager.getConnection(url, user, pass);
		    String sql = "SELECT shoeid,style,color,purchase_price,resale_price,image_url FROM shoe WHERE brand = ?";
		    PreparedStatement stmt = conn.prepareStatement(sql);
		    stmt.setString(1,brand);
		    ResultSet rs = stmt.executeQuery();
		    while (rs.next()) {
		    int shoeid = rs.getInt(1);  
		    	//String brand1 = rs.getString(2);
		    String style = rs.getString(2);
		    String color = rs.getString(3);
		    int pprice = rs.getInt(4);
		    int rprice = rs.getInt(5);
		    String imageurl = rs.getString(6);
	
		    s = new Shoe(shoeid,brand,style,color,pprice,rprice,imageurl);
		      list.add(s);
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
	public Shoe getShoeByShoeid(int shoeid) {
		Shoe s = new Shoe();  
		try {
			    Connection conn = DriverManager.getConnection(url, user, pass);
			    String sql = "SELECT brand,style,color,purchase_price,resale_price,image_url FROM shoe WHERE shoeid = ?";
			    PreparedStatement stmt = conn.prepareStatement(sql);
			    stmt.setInt(1, shoeid);
			    ResultSet rs = stmt.executeQuery();
			    if (rs.next()) {  
				    	String brand = rs.getString(1);
				    String style = rs.getString(2);
				    String color = rs.getString(3);
				    int pprice = rs.getInt(4);
				    int rprice = rs.getInt(5);
				    String imageurl = rs.getString(6);
				    s = new Shoe(shoeid,style,brand,color,pprice,rprice,imageurl);
				      
				    
			    }
			    rs.close();
			    stmt.close();
			    conn.close();
			    System.out.println("got a shoe");
			  } catch (SQLException e) {
			    e.printStackTrace();
			    System.out.println("something went wrong");
			  }
		return s;
	}
	

	@Override
	public List<Shoe> getShoeByRpriceLessThanEqualTo(int rprice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shoe updateShoe(Shoe s) {
	
	    try {
	      Connection conn = DriverManager.getConnection(url, user, pass);
	    		String sql = "UPDATE shoe SET brand=?, style=?,color=?,purchase_price=?,resale_price=?,image_url=?" +"WHERE shoeid=?";
	    		            
	    		            PreparedStatement st = conn.prepareStatement(sql);
	    		            st.setString(1,s.getBrand());
	    		            st.setString(2,s.getStyle());
	    		            st.setString(3,s.getColor());
	    		            st.setInt(4,s.getPprice());
	    		            st.setInt(5,s.getRprice());
	    		            st.setString(6,s.getImageUrl());
	    		            st.setInt(7,s.getShoeid());
	    		            
	    
	      int uc = st.executeUpdate();
	      if (uc == 1) {

	    		        System.out.println(uc + " shoe record updated");
	    		        conn.close();
	    		    
	    		        }
	    		      else {
	    		      s = null;
	    		    }
	      }
	    catch (SQLException e) {
	      e.printStackTrace();
	      s = null;
	    }
	    return s;
	}

	@Override
	public boolean deleteShoe(Shoe s) {
			  Connection conn = null;
			  try {
			    conn = DriverManager.getConnection(url, user, pass);
			    String sql = "DELETE FROM shoe WHERE shoeid = ?";
			    PreparedStatement stmt = conn.prepareStatement(sql);
			    stmt.setInt(1, s.getShoeid());
			    stmt.executeUpdate();
			
			  }
			  catch (SQLException sqle) {
			    sqle.printStackTrace();
			    if (conn != null) {
			      try { conn.rollback(); }
			      catch (SQLException sqle2) {
			        System.err.println("Error trying to rollback");
			      }
			    }
			    return false;
			  }
			  return true;
			}
	}


