package question3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Main {
	
	public static Connection getConnectToDatabase() throws SQLException , ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		ResourceBundle rb = ResourceBundle.getBundle("dbdetails");
		return DriverManager.getConnection(rb.getString("url"), rb.getString("username"),rb.getString("password"));
	}

	
	public void closeConnection(Connection conn) throws SQLException
	{
		if(conn!=null)
		{
			conn.close();
		}
	}
	
	
	public static List<Employee> getEmployeeList() throws ClassNotFoundException, SQLException
	{
		Connection conn = null;
		conn = getConnectToDatabase();
		
		List<Employee> empList = new ArrayList<>();
		
		String query = "Select * from Test";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			empList.add(new Employee(rs.getString(2),rs.getInt(3)));
		}
		
		conn.close();
        
		return empList;		
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		List<Employee> emp = getEmployeeList();
		for(Employee e : emp)
		{
			System.out.println(e.getEmpName() + " : "+e.getAge());
		}
	}
}
