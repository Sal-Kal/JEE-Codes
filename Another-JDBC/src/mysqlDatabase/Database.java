package mysqlDatabase;

import java.sql.*;


public class Database {

	public static String url, user, password;
	public static Connection conn = null;

	public Database() {
		url = "jdbc:mysql://localhost:3306/jdbc";
		user = "root";
		password = "password";
		try {
			System.out.println("Connecting to Database ...");
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("Successfully connected");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insertData(String no, String name, String state, String commission, String rate) throws Exception{
		Statement st = conn.createStatement();
		String query = "insert into Representative values ("
				+ "'"+no+"',"
				+ "'"+name+"',"
				+"'"+state+"',"
				+commission+","
				+rate+");";
		System.out.println(query);
		st.executeUpdate(query);
	}
	
	public static String selectQuery() throws Exception{
		String result = "";
		Statement st = conn.createStatement();
		String query = "select * from Representative;";
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			String no = rs.getString("RepNo");
			String name = rs.getString("RepName");
			String state = rs.getString("State");
			int commission = rs.getInt("Commission");
			float rate = rs.getFloat("Rate");
			result = result +" "+ no +" "+ name +" "+ state +" "+ commission +" "+ rate + "\n";
		}
		return result;
	}
}