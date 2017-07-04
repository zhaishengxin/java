//1. 利用Statement制作CRUD
package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Test3 {
	static void exec(String sql) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		Statement stmt=conn.createStatement();
		boolean bb=stmt.execute(sql);
		if(bb){
			ResultSet rs=stmt.getResultSet();
			ResultSetMetaData  remd=rs.getMetaData();
			int count=remd.getColumnCount();
			while(rs.next()){
				for (int i = 1; i <= count; i++) {
					System.out.print(rs.getObject(i)+"\t");
				}
				System.out.println();
			}
		}else{
			int rows=stmt.getUpdateCount();
			System.out.println("影响了"+rows+"行");
		}
	}
	public static void main(String[] args) throws Exception{
		exec("select * from dept");
	}
}
