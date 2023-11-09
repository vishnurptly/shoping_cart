package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;


public class profileDao{
	
	public static int save(profilebm pro1){
		int status=0;
		try{
			System.out.println("success pro1");
			Connection con=dataConnection.createConnection();
			PreparedStatement ps=con.prepareStatement("insert into cart(Name,Email,Address,Address2,City,State,Pin) values (?,?,?,?,?,?,?)");
			ps.setString(1,pro1.getName());
			ps.setString(2,pro1.getEmail());
			ps.setString(3,pro1.getAddresss());
			ps.setString(4,pro1.getAddress2());
			ps.setString(5,pro1.getCity());
			ps.setString(6,pro1.getState());
			ps.setString(7,pro1.getPin());
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	
	}
	public static profilebm allId(int id){
		profilebm e=new profilebm();
	
		try{
			Connection con=dataConnection.createConnection();
			System.out.println("sucess add1");
			PreparedStatement ps=con.prepareStatement("select * from logDao where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setAddresss(rs.getString(4));
				e.setAddress2(rs.getString(5));
				e.setCity(rs.getString(6));
				e.setState(rs.getString(7));
				
			}
			System.out.println("sucess add2");
			con.close();
			
		}catch(Exception ex){ex.printStackTrace();}
		
		return e;
	
	}
	public static List<profilebm> allid(){
		List<profilebm> list=new ArrayList<profilebm>();
		
		try{
			
			Connection con=dataConnection.createConnection();
			PreparedStatement ps=con.prepareStatement("select * from logDao");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				profilebm e=new profilebm();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setAddresss(rs.getString(4));
				e.setAddress2(rs.getString(5));
				e.setCity(rs.getString(6));
				e.setState(rs.getString(7));
			}
			System.out.println("sucess select ");
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}
	
	}
