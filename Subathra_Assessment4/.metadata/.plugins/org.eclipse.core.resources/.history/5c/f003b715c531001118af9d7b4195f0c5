package crudOperations;

import java.sql.*;

public class DAO {

	public void displayBooks() {

	    try (Connection con = DBConnection.getConnection()) {

	        String sql = "SELECT * FROM Books";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

	        int count = 0;

	        while (rs.next()) {
	            int id = rs.getInt("book_id");
	            String title = rs.getString("title");
	            String author = rs.getString("author");
	            String isbn = rs.getString("isbn");
	            String publisher = rs.getString("publisher");
	            int year = rs.getInt("pub_year");
	            double price = rs.getDouble("price");
	            int copies = rs.getInt("total_copies");
	            int categoryId = rs.getInt("category_id");

	            System.out.println("Book:" + (++count) + ": " + id + " - " + title + " - " +
	                    author + " - " + isbn + " - " + publisher + " - " +
	                    year + " - " + price + " - " + copies + " - " + categoryId);
	        }

	    } catch (Exception e) {
	        System.out.println(e);
	    }
	}

}
