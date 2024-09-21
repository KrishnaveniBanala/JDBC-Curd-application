import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CURDApplication {

	public static void main(String[] args) {
		String user ="root";
        String password ="root";
        String url ="jdbc:mysql://localhost:3306?demo";
        
		try {
		
        Connection con=DriverManager.getConnection(url,password,user);
		System.out.println("conncetion established");

	}catch (Exception e) {
		e.printStackTrace();
	}
	  
	
	  try { 
		  Connection con=DriverManager.getConnection(url,password,user); 
		  String sql1="insert into emplogin(col1,col2,col3,col4,col5)VALUES(?,?,?,?,?)";
	  PreparedStatement ps=con.prepareStatement(sql1); 
	  ps.setInt(1, 101);
	  ps.setString(2, "devi");
	  ps.setString(3, "devi23");
	  ps.setString(4,"devi@gmail.com");
	  ps.setString(5, "uk");
	  
	  // ps.executeUpdate(); 
	  System.out.println("Record created succufully");
	  
	  
	  }catch (Exception e) {
		  e.printStackTrace(); 
		  }
	 
		try {
			Connection con=DriverManager.getConnection(url,password,user);
			String sql="select * from demo.emplogin where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, 101);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String password1=rs.getString(3);
			String email=rs.getString(4);
			String country=rs.getString(5);
			
			System.out.println("display the col1:"+id);
			System.out.println("display the col2:"+name);
			System.out.println("display the col3:"+password1);
			System.out.println("display the col4:"+email);
			System.out.println("display the col5:"+country);
			
			System.out.println("read the record succufully");
		}
		 
}catch (Exception e) {
	e.printStackTrace();
}
		try {
			Connection con=DriverManager.getConnection(url,password,user);
			String sql="update demo.emplogin set col1=?,col2=?,col3=?,col4=?,col5=? where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, "potti");
			ps.setString(2, "potti12");
			//ps.executeUpdate();
			System.out.println("record updated succfully");
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		try {
			Connection con=DriverManager.getConnection(url,password,user);
			String sql="delete from emplogin where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, 101);
			//ps.executeUpdate();
			System.out.println("record deleted succfully");
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
}
}
