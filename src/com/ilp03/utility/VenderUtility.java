package com.ilp03.utility;

import com.ilp03.services.VendorService;
import com.ilp03.services.VendorServiceImpl;

public class VenderUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******WELCOME TO VENDOR MANAGEMENT SYSTEM*****");
		VendorService vendorService= new VendorServiceImpl();
		
		
		vendorService.getmenu();
		
		
		

	}

}
//////////////////////////