//1. ����Statement����CRUD
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
		System.out.println("Ӱ����"+rows+"��");
		conn.close();
		System.out.println("�ɹ����");
	}
	static void delete() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		Statement stmt=conn.createStatement();
		String sql="delete from dept where deptno=70";
		stmt.execute(sql);
		int rows=stmt.getUpdateCount();
		System.out.println("Ӱ����"+rows+"��");
		conn.close();
		System.out.println("�ɹ�ɾ��");
	}
	static void update() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		Statement stmt=conn.createStatement();
		String sql="update dept set loc='����' where deptno=60";
		stmt.execute(sql);
		int rows=stmt.getUpdateCount();
		System.out.println("Ӱ����"+rows+"��");
		conn.close();
		System.out.println("�ɹ��޸�");
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
		System.out.println("�ɹ���ѯ");
	}
	public static void main(String[] args) throws Exception {
		read();
	}
}
