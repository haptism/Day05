package com.iu.mart;

public class ProductView {
	
	//제품의 정보를 출력하는 메서드
	public void info(Product product) {
		System.out.println("Brand  : "+product.brand);
		System.out.println("Price  : "+ product.price);
		System.out.println("Amount : "+ product.amount);
		System.out.println("Sale   : "+ product.sale);
	}

}
