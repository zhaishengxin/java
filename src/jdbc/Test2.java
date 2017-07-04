//1. 利用Statement制作CRUD
package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Test2 {
	static void save() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		Statement stmt=conn.createStatement();
		String sql="insert into dept values(70,'android','xian')";
		stmt.execute(sql);
		int rows=stmt.getUpdateCount();
		System.out.println("影响了"+rows+"行");
		conn.close();
		System.out.println("成功添加");
	}
	static void delete() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		Statement stmt=conn.createStatement();
		String sql="delete from dept where deptno=70";
		stmt.execute(sql);
		int rows=stmt.getUpdateCount();
		System.out.println("影响了"+rows+"行");
		conn.close();
		System.out.println("成功删除");
	}
	static void update() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		Statement stmt=conn.createStatement();
		String sql="update dept set loc='西安' where deptno=60";
		stmt.execute(sql);
		int rows=stmt.getUpdateCount();
		System.out.println("影响了"+rows+"行");
		conn.close();
		System.out.println("成功修改");
	}
	static void read() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		Statement stmt=conn.createStatement();
		String sql="select * from dept";
		stmt.execute(sql);
		ResultSet rs=stmt.getResultSet();
		while(rs.next()){
			System.out.print(rs.getObject(1)+"\t\t");
			System.out.print(rs.getObject(2)+"\t\t");
			System.out.println(rs.getObject(3)+"\t\t");
		}
		conn.close();
		System.out.println("成功查询");
	}
	public static void main(String[] args) throws Exception {
		read();
	}
}
