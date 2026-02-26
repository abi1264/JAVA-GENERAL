package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
	public static void main(String args[]) throws SQLException {
		try {
			
			//Step1  in JDBC
			Class.forName("org.postgresql.Driver");
			}
		catch(ClassNotFoundException e) {
			System.out.println(e);
			
			}
	
		
		//step 2
		
		String url="jdbc:postgresql://localhost:5432/JAVA";
		String userName="postgres";
		String password="abishek";
		Connection conn=DriverManager.getConnection(url,userName,password);
		
		//step3
		Statement st=conn.createStatement();   //Statement and CreateStatement are keywords from java.sql
		
		//step 4 and 5 combines
		ResultSet rs=st.executeQuery("select * from student");
		
		//query execute garyo ra store garyo ekkaii choti
		
		//step 6
		while(rs.next()){
			String uuserName=rs.getString("userName");
			String ppassword=rs.getString("password");
			System.out.println("UserName : "+ uuserName + ",Password : " + ppassword);
						
						}
		
		//step 7
		rs.close();
		
		conn.close();
	}
}


