package artist;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AllArtistServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().setAttribute("peeked", new Object());
		// query all artists
		List<Artist> artists = new ArrayList<Artist>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"chinook", "p4ssw0rd");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ARTIST");
			while(rs.next()){
				artists.add(new Artist(rs.getInt(1), rs.getString(2)));
			}	
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		// load them into request-scoped variable
		req.setAttribute("artistList", artists);
		// send to the view
		req.getRequestDispatcher("/WEB-INF/allArtists.jsp").forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
}
