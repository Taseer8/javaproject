package com.Xworkz.Products.productrepo;

import java.util.ArrayList;
import java.util.List;

import com.Xworkz.Products.productdto.ProductDto;

public class ProductRepo implements ProductRepoImlements {
	ArrayList<ProductDto> product = new ArrayList<ProductDto>();

	@Override
	public boolean save(ProductDto p_Dto) {
		System.out.println("save in repo");
		return product.add(p_Dto);
	}

	@Override
	public List<ProductDto> getAll() {
		
		return product;
	}

	@Override
	public boolean updateById(int productId, ProductDto p_Dto) {
		if(!product.isEmpty()) {
			for(int i = 0 ; i<product.size(); i++) {
				if(product.get(i).getProductId()== productId) {
					product.set(i, p_Dto);
				}
			}
			return true;
		}
		else {
			System.out.println(" enter the id");
		}

		return false;
	}

	@Override
	public boolean deleteById(int productId, ProductDto p_Dto) {
		if(!product.isEmpty()) {
			for(int i = 0 ; i<product.size(); i++) {
				if(product.get(i).getProductId()== productId) {
					product.remove(i);
				}
			}
			return true;
		}
		else {
			System.out.println(" enter the id");
		}
		return false;
	}



}
