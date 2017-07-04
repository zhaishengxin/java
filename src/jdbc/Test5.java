//3. 利用PreparedStatement制作CRUD
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Date;

public class Test5 {
	static void save(int empno,String ename,String job,int mgr, Date hiredate,double sal,double comm,int deptno) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		String sql="insert into emp values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,empno);
		ps.setString(2,ename);
		ps.setString(3, job);
		ps.setInt(4, mgr);
		ps.setDate(5, new java.sql.Date(hiredate.getTime()));
		ps.setDouble(6, sal);
		ps.setDouble(7, comm);
		ps.setInt(8, deptno);
		ps.execute();
		int rows=ps.getUpdateCount();
		System.out.println("影响了"+rows+"行");
	}
	static void delete(int empno) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		String sql="delete from emp where empno=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,empno);
		ps.execute();
		int rows=ps.getUpdateCount();
		System.out.println("影响了"+rows+"行");
	}
	static void update(int empno,String ename,String job,int mgr, Date hiredate,double sal,double comm,int deptno) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		String sql="update emp set ename=?,job=?,mgr=?,hiredate=?,sal=?,comm=?,deptno=? where empno=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,ename);
		ps.setString(2, job);
		ps.setInt(3, mgr);
		ps.setDate(4, new java.sql.Date(hiredate.getTime()));
		ps.setDouble(5, sal);
		ps.setDouble(6, comm);
		ps.setInt(7, deptno);
		ps.setInt(8,empno);
		ps.execute();
		int rows=ps.getUpdateCount();
		System.out.println("影响了"+rows+"行");
	}
	static void read(String ename) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		String sql="select * from emp where ename=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		System.out.println(sql);
		ps.setString(1, ename);
		ps.execute();
			ResultSet rs=ps.getResultSet();
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
		update(7369,"SMITH","CLERK",7902,new Date(),900,0,20);
	}
}
