package com.ilp03.services;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.AssetDAO;
import com.ilp03.dao.DisplayVendorDOA;
import com.ilp03.dao.NewvendorDAO;
import com.ilp03.dao.venderDAO;
import com.ilp03.entity.Purchase;

public class VendorServiceImpl implements VendorService {
	Scanner scanner=new Scanner(System.in);

	
	public void getmenu() {
		
		try {
		
			Connection connection = AssetDAO.getConnection();
			int choice;
			char goToMainMenu='y';
			

			
			
			do
			{
				System.out.println("select an option");
				System.out.println("1.Get List of All requests");
				System.out.println("2.Get Asset Details ");
				System.out.println("3.insert new vendor ");
				System.out.println("4.Display all vendors");
						
				choice=scanner.nextInt();
				switch(choice)
				{
				case 1:ArrayList<Purchase> accountList=venderDAO.getRequestDetails(connection);
				break;
				case 2:
					System.out.println("Enter id of the asset for getting details");
					int asset_id;
					asset_id=scanner.nextInt();
					ArrayList<Purchase> vendorList=AssetDAO.getDetailOnAssetId(connection,asset_id);
				break;
				case 3:
					scanner.nextLine();
					System.out.println("Enter the name of the vendor");
				    String name;
				    Long numb;
				    name=scanner.nextLine();
				    System.out.println("Enter the contact of the vendor");
				    numb=scanner.nextLong();
   				  ArrayList<Purchase> addedList=NewvendorDAO.addNewVendor(connection,name,numb);
   				  break;
				case 4:ArrayList<Purchase> VList=DisplayVendorDOA.getvendorDetails(connection);
				break;
					
				
				
				}
				System.out.println("go back to menu(y/n))");
				goToMainMenu=scanner.next().charAt(0);
			}
			while(goToMainMenu=='y');
			
			
			
			
			
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
