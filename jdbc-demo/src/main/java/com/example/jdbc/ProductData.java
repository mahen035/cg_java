package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductData {

	public static void main(String[] args) {
		
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/testdb";
			String userName = "postgres";
			String password = "pass123";
			
			con = DriverManager.getConnection(url, userName, password);
			
			//Statement stmt = con.createStatement();
			
			PreparedStatement stmt = con.prepareStatement("");
			
			createTable(stmt);
			
			//ResultSet rs = stmt.executeQuery("Select * from product");
			
			/*
			 * while(rs.next()) {
			 * System.out.println("ID: "+rs.getString("prod_id")+" Name: "+rs.getString(
			 * "prod_name")); }
			 */
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public static void createTable(Statement stmt)  {
		
		String query = "create table Person1(pers_id varchar(4) primary key,"
				+ "pers_name varchar(20) not null,"
				+ "age numeric(2))";
		
		try {
			stmt.execute(query);
			System.out.println("Table successfully created..");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

// Insert data into the table
// update a row in person table
// delete a row from person table

// Get data from the database and store it in a java class











