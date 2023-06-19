package DBService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


import DTO.Student;


public class DBService {
static {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	}catch(ClassNotFoundException e) {
		System.out.print(e);
	}
}
 public static boolean registration(Student s1) {
	 boolean res=false;
	 
	 try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school?user=root&password=root");
	 PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?)");
	 ps.setString(1,s1.getName());
	 ps.setString(2, s1.getUserId());
	 ps.setString(3, s1.getEmail());
	 ps.setString(4, s1.getPhone());
	 ps.setString(5, s1.getPass());
	 
	 ps.setString(6, s1.getAddress());
	 
	 
	int x= ps.executeUpdate();
	if(x!=0) {
		res=true;
	}
	
	
	} catch (SQLException e) {
	System.out.println(e);
		e.printStackTrace();
	}	 
	return res;
	
}
public static boolean login(String userId, String pass) {
	
	boolean res=false;
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("select * from school where UserId=? and password=?");

		ps.setString(1,userId);
		ps.setString(2, pass);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			res=true;
		}

	} catch (Exception e) {
		// TODO: handle exception
	}

	
	return res;
}
public static boolean update(Student s1) {
	boolean res=false;
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("update student set Name=?,UserId=?,Email=?,Phone=?,password=?,Address=? where Email=?");

		ps.setString(1,s1.getName());
		 ps.setString(2, s1.getUserId());
		 ps.setString(3, s1.getEmail());
		 ps.setString(4, s1.getPhone());
		 ps.setString(5, s1.getPass());
		 
		 ps.setString(6, s1.getAddress());
		 ps.setString(7, s1.getEmail());
		 int x = ps.executeUpdate();
		if(x>=1) {
			res=true;
		}

	} catch (Exception e) {
		System.out.println(e);
	}


	return res;

	
}
public static boolean delete(String email) {
	boolean res = false;
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("delete from student where Email=?");

		ps.setString(1, email);

		int x=ps.executeUpdate();
		if(x>=1) {
			res=true;
		}

	} catch (Exception e) {
		// TODO: handle exception
	}


	return res;

}
public static Vector display() {
	
	Vector v1=new Vector();


	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();


		while (rs.next()) {
			Student u = new Student();

			u.setName(rs.getString(1));
			u.setUserId(rs.getString(2));
			u.setEmail(rs.getString(3));
			u.setPhone(rs.getString(4));
			u.setPass(rs.getString(5));
			u.setAddress(rs.getString(6));
			


			v1.add(u);


		}



}catch(Exception e) {
	System.out.print("Error in SQL");
}
	return v1;

}



}
