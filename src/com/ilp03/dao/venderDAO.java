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

public class venderDAO {
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
	 public static ArrayList<Purchase> getRequestDetails(Connection connection)
	 {
	    Statement statement;
		ArrayList<Purchase> vendorList=new ArrayList<Purchase>();
		try {
			statement=connection.createStatement();
			
			//statement  = connection.createStatement();
			PreparedStatement ps = connection.prepareStatement("select request_id,asset_title,"
					+ "asset_count from request");

     	// ResultSet resultSet = statement.executeQuery(query);
     	   
     	    ResultSet resultSet = ps.executeQuery();
			while(resultSet.next())
			{
			
			int request_id =resultSet.getInt(1);
			String asset_title =resultSet.getString(2);
			int asset_count =resultSet.getInt(3);
			
			
			
			
			System.out.println("--------------------------------------------");
			
			System.out.println("request id :"+request_id);
			System.out.println("name of asset  :"+asset_title);
			System.out.println("no of asset required :"+asset_count);
			
			System.out.println("--------------------------------------------");

			
			
			
			Request request = new Request();
			request.setRequest_id(request_id);
			request.setAsset_title(asset_title);
			request.setAsset_count(asset_count);
			
			
			
			
			
			
			Purchase purchase = new Purchase();
			purchase.setRequest(request);
			
			
		
			vendorList.add(purchase);
			
		}
		}
			
			catch (SQLException e) {
			
			e.printStackTrace();
		}
			
			
		return vendorList;
	 }

}
