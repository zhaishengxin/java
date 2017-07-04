//2. ÑÝÊ¾³ö×¢ÈëÂ©¶´
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Test4 {
	static void read(String ename) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		Statement stmt=conn.createStatement();
		String sql="select * from emp where ename='"+ename+"'";
		System.out.println(sql);
		stmt.execute(sql);
			ResultSet rs=stmt.getResultSet();
			ResultSetMetaData  remd=rs.getMetaData();
			int count=remd.getColumnCount();
			while(rs.next()){
				for (int i = 1; i <= count; i++) {
					System.out.print(rs.getObject(i)+"\t");
				}
				System.out.println();
			}
	}
	public static void main(String[] args) throws Exception{
		read("1' or 1=1 or ename='1");
	}
}
