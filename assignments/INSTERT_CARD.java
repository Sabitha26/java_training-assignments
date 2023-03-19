package jdbc;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;

	public class INSTERT_CARD {	

		// values specific to each database
		   
		   // variables
		   private static final String url = "jdbc:mysql:///Books";
		   private static final String user = "root";
		   private static final String password = "159951";
		   // SQL Query
		   private static final String INSERT_Books_QUERY =
		                "INSERT INTO bookDetails VALUES (?,?,?,?,?)";
	  
			 public static void main(String[] args ) {

			     // declare variables
			     Scanner scan = null;
			     int a = 0;			     int SNo = 0;
			     int bookId = 0;
			     String bookName = null;
			     String authorName = null;
			     String edition = null;
			     Connection connect = null;
			     PreparedStatement ps = null;
			     int result = 0;

			     try {
			        // create Scanner class object
			        scan = new Scanner(System.in);
			        
			        // take number of students
			        if(scan != null) {
			            System.out.print("Enter Number of Books: ");
			            a = scan.nextInt();
			        }

			        // establish the connection
			        connect = DriverManager.getConnection(url, user, password);
				      // create JDBC statement object
				    

			        // compile SQL query and store it in
			        // PreparedStatement object
			        if(connect != null) {
			           ps = connect.prepareStatement(INSERT_Books_QUERY);
			        }
			        
			        if(scan != null && ps != null) {
			           for(int i=0; i<a; i++) {

			              // read input values
			              System.out.println("\nEnter Book "+(i+1)+" details,");
//			              System.out.print("Number: ");
//			              SNo = scan.nextInt();
			              System.out.print("bookId: ");
			              bookId = scan.nextInt();
			              System.out.print("bookName: ");
			              bookName = scan.nextLine();
			              bookName+=scan.nextLine();
			              System.out.print("authorName: ");
			              authorName = scan.nextLine();
			              authorName+=scan.nextLine();
			              System.out.print("edition: ");
			              edition = scan.nextLine();
			              edition+=scan.nextLine();

			              // set parameters values
//			              ps.setInt(1, SNo);
			              ps.setInt(1, bookId);
			              ps.setString(2, bookName);
			              ps.setString(3, authorName);
			              ps.setString(4, edition);
			              

			              // execute the query
			              result = ps.executeUpdate();
			           }
			        }
			        
			        // process the result
			        if(result == 0) {
			           System.out.println("\nRecords insertion failed");
			        } else {
			           System.out.println("\nRecords inserted successfully.");
			        }

			     } catch(SQLException se) {
			        se.printStackTrace();
			     } catch(Exception e) {
			        e.printStackTrace();
			     } // try-catch block 

			     finally {
			        // close JDBC objects
			        try {
			           if(ps != null) ps.close();
			        } catch(SQLException se) {
			           se.printStackTrace();
			        }
			        try {
			           if(connect != null) connect.close();
			        } catch(SQLException se) {
			           se.printStackTrace();
			        }
			        try {
			           if(scan != null) scan.close();
			        } catch(Exception e) {
			           e.printStackTrace();
			        }
			     }
			   } 
		}

	


