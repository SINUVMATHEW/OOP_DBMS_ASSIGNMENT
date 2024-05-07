package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ilp03.entity.Purchase;
import com.ilp03.entity.Request;

public class NewvendorDAO {
	public static Connection getConnection()
	{
		String connectionString ="jdbc:mysql://localhost:3306/vender_db?useSSL=false";
		String username="root";
		String password="sinu@123";
		Connection connection=null;
		
		try {
			connection =DriverManager.getConnection(connectionString,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	
	public static void closeConnection(Connection connection)
	{
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	 public static ArrayList<Purchase> addNewVendor(Connection connection,String name,long numb)
	 {
	    Statement statement;
		ArrayList<Purchase> vendorList=new ArrayList<Purchase>();
		try {
			statement=connection.createStatement();
			
			//statement  = connection.createStatement();
			PreparedStatement ps = connection.prepareStatement("insert into vendorList(vendorName,vendorContact) "
					+ "values(?,?) ");

     	//  ResultSet resultSet = statement.executeQuery(query);
			System.out.println("enter the new vendor name");
			
			ps.setString(1,name);
			ps.setLong(2,numb);
     	    ps.executeUpdate();
			
		}
			
			catch (SQLException e) {
			
			e.printStackTrace();
		}
			
			
		return vendorList;
	 }

}
