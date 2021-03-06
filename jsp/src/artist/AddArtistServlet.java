package artist;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// handles "save.do"
public class AddArtistServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp) 
					throws ServletException, IOException {
		// call middle tier / business tier
		// simplicity for now.. write jdbc code
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"chinook", "p4ssw0rd");
			PreparedStatement stmt = 
					conn.prepareStatement("INSERT INTO ARTIST(NAME) VALUES(?)");
			stmt.setString(1, req.getParameter("artist"));
			stmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		// forward to display all artists servlet
		req.getRequestDispatcher("artists.do").forward(req, resp);
	}
	
}







