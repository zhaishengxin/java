package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws Exception  {
		// JDBC  java database connectivity  
		// 1. 加载数据库驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2. 获得连接
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn = DriverManager.getConnection(url, "scott","tiger");
		// 3. 获得给数据库服务器发送sql语句的对象
		Statement stmt = conn.createStatement(); 
		String sql = "insert into dept values(32,'java','地球')";
		// 4. java把准备好的sql语句发送给了Oracle服务器!服务器接着这个sql语句就执行了!
		stmt.execute(sql);
		conn.close();
		System.out.println("over");
	}
}

