
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

/**
 * Servlet implementation class myRegister
 */
public class myRegister extends HttpServlet {
	Connection con;

	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java03", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String fname = request.getParameter("fname");
		String sname = request.getParameter("sname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String pnumber = request.getParameter("pnumber");
		try {
			PreparedStatement st = con.prepareStatement("insert into suryaworld values('" + fname + "','" + sname
					+ "','" + username + "','" + password + "','" + pnumber + "')");
			st.executeUpdate();
			out.println("<font face=\"bold\" text-align=\"center\">Registered Succesfully</font>");
			out.println("click here to <a href=\"myLogin.jsp\" >login</a>");
		} catch (Exception e) {
			out.println(e);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public void destroy() {
		try {
			con.close();
		} catch (Exception e) {

		}
	}

}
