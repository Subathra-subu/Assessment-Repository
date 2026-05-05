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
	
	
	public void updateFineAndDisplay() {

	    try (Connection con = DBConnection.getConnection()) {
	    	
	    	 String updateSql = "UPDATE Members m " +
	                 "JOIN Borrows b ON m.member_id = b.member_id " +
	                 "SET m.fine_amount = 500 " +
	                 "WHERE m.membershipType = 'Basic' AND b.borrow_status = 'Overdue'";

	         PreparedStatement ps1 = con.prepareStatement(updateSql);
	         int rows = ps1.executeUpdate();

	         System.out.println("Rows updated: " + rows);
	         
	         
	         
	         String selectSql = "SELECT m.firstName, m.lastName, m.membershipType, " +
	                 "b.borrow_status, m.fine_amount " +
	                 "FROM Members m " +
	                 "JOIN Borrows b ON m.member_id = b.member_id " +
	                 "WHERE m.membershipType = 'Basic' AND b.borrow_status = 'Overdue'";

	         PreparedStatement ps2 = con.prepareStatement(selectSql);
	         ResultSet rs = ps2.executeQuery();
	         
	         while (rs.next()) {
	             System.out.println(
	                     rs.getString("firstName") + " - " +
	                     rs.getString("lastName") + " - " +
	                     rs.getString("membershipType") + " - " +
	                     rs.getString("borrow_status") + " - " +
	                     rs.getDouble("fine_amount")
	             );
	         }
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }

   }
}
