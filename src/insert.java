import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;


public class insert extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���سɹ�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("���쳣");
			e.printStackTrace();
		}

		try {
			Connection con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studb", "root", "admin");
			System.out.println("���Ӵ����ɹ�");
//			Statement sta = (Statement) con.createStatement();
//			 int a=
//			 sta.executeUpdate("insert studentinfo values('10008','��',20) ");
//			
//			 System.out.println("����"+a+"��");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���Ӵ���ʧ��");
			e.printStackTrace();
		}
	}

}
