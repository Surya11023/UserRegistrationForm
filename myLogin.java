
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

/**
 * Servlet implementation class myLogin
 */
public class myLogin extends HttpServlet {
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			PreparedStatement st = con.prepareStatement(
					"select * from suryaworld where username='" + username + "'and password='" + password + "'");
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				String s = rs.getString("FirstName") + " " + rs.getString("SecondName");
				out.println("<h3><p align=\"center\"><font face=\"bold\"  color=\"blue\"> Welcome </font></p></h3> ");
				out.println("<h2><p align=\"center\">" + s + "</p></h2>");

			} else {
				out.println(
						"<h3><p align=\"center\"><font face=\"bold\"  color=\"blue\"> username or password does not match </font></p></h3> ");
				out.println(
						"<h3><p align=\"center\"><font face=\"bold\"  color=\"blue\"> please try again to <a href=\"myLogin.jsp\">login<a/> </font></p></h3> ");
			}
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
