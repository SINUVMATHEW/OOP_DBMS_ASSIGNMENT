package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ilp03.entity.Asset;
import com.ilp03.entity.Employee;
import com.ilp03.entity.Purchase;
import com.ilp03.entity.Request;
import com.ilp03.entity.Vender;

public class AssetDAO {
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
	 public static ArrayList<Purchase> getDetailOnAssetId(Connection connection,int needasset_id)
	 {
	    Statement statement;
		ArrayList<Purchase> vendorList=new ArrayList<Purchase>();
		try {
			statement=connection.createStatement();
			
			//statement  = connection.createStatement();
			PreparedStatement ps = connection.prepareStatement("select employee.username,purchase.purchase_id,"
					+ "asset.asset_id,request.asset_title,vendorList.vendorName from employee inner join"
					+ " purchase on employee.employee_id=purchase.employee_id inner join asset on"
					+ " purchase.purchase_id=asset.purchase_id inner join request on "
					+ "purchase.request_id=request.request_id inner join vendorList on"
					+ " purchase.vendor_id=vendorList.vendor_id where asset.asset_id=?;");

     	// ResultSet resultSet = statement.executeQuery(query);
     	    ps.setInt(1,needasset_id);
     	    ResultSet resultSet = ps.executeQuery();
			while(resultSet.next())
			{
			String  username =resultSet.getString(1);
			int purchase_id =resultSet.getInt(2);
			int asset_id =resultSet.getInt(3);
			String asset_title =resultSet.getString(4);
			String vendorName =resultSet.getString(5);
			
			
			System.out.println("--------------------------------------------");
			
			System.out.println("asset id :"+asset_id);
			System.out.println("asset in charge :"+username);
			System.out.println("asset purchase id :"+purchase_id);
			System.out.println("name of asset  :"+asset_title);
			System.out.println("name of the vender :"+vendorName);
			
			System.out.println("--------------------------------------------");

			
			Employee employee = new Employee();
			employee.setUsername(username);
			
			Purchase purchase = new Purchase();
			purchase.setPurchase_id(purchase_id);
			
			
			Asset asset = new Asset();
			asset.setAsset_id(asset_id);
			
			Request request = new Request();
			request.setAsset_title(asset_title);
			
			
			Vender vender = new Vender();
			vender.setVendorName(vendorName);
			
			
			
			purchase.setAsset(asset);
			purchase.setEmployee(employee);
			purchase.setRequest(request);
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
