package com.ibsplc.java.day10;

import java.util.Comparator;

import com.ibsplc.java.day7.Product;

public class PriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product arg0, Product arg1) {
		// TODO Auto-generated method stub
		if(arg0.getUnitPrice() > arg1.getUnitPrice()) {
			return -1;
		}
		else if(arg0.getUnitPrice() < arg1.getUnitPrice()) {
			return 1;
		}
		else {
			return arg0.getProductDesc().compareTo(arg1.getProductDesc());
		}
	}

}
