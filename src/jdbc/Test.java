package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws Exception  {
		// JDBC  java database connectivity  
		// 1. �������ݿ�����
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2. �������
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn = DriverManager.getConnection(url, "scott","tiger");
		// 3. ��ø����ݿ����������sql���Ķ���
		Statement stmt = conn.createStatement(); 
		String sql = "insert into dept values(32,'java','����')";
		// 4. java��׼���õ�sql��䷢�͸���Oracle������!�������������sql����ִ����!
		stmt.execute(sql);
		conn.close();
		System.out.println("over");
	}
}

