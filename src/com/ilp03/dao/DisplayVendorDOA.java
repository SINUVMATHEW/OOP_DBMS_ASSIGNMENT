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
import com.ilp03.entity.Vender;

public class DisplayVendorDOA {
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
	 public static ArrayList<Purchase> getvendorDetails(Connection connection)
	 {
	    Statement statement;
		ArrayList<Purchase> vendorList=new ArrayList<Purchase>();
		try {
			statement=connection.createStatement();
			
			//statement  = connection.createStatement();
			PreparedStatement ps = connection.prepareStatement(" select * from vendorList");

     	// ResultSet resultSet = statement.executeQuery(query);
     	   
     	    ResultSet resultSet = ps.executeQuery();
			while(resultSet.next())
			{
			
			int vendor_id =resultSet.getInt(1);
			String vendorName =resultSet.getString(2);
			long vendorContact =resultSet.getLong(3);
			
			
			
			
			System.out.println("--------------------------------------------");
			
			System.out.println("request id :"+vendor_id);
			System.out.println("name of vendor  :"+vendorName);
			System.out.println("contact of vendor :"+vendorContact);
			
			System.out.println("--------------------------------------------");

			
			
			
			Vender vender = new Vender();
			vender.setVendor_id(vendor_id);
			vender.setVendorName(vendorName);
			vender.setVendorContact(vendorContact);
			
			
			
			
			
			
			
			Purchase purchase = new Purchase();
			purchase.setVender(vender);
			
			
		
			vendorList.add(purchase);
			
		}
		}
			
			catch (SQLException e) {
			
			e.printStackTrace();
		}
			
			
		return vendorList;
	 }

}
