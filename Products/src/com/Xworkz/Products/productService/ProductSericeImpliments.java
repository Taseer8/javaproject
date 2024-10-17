package com.Xworkz.Products.productService;

import java.util.List;

import com.Xworkz.Products.productdto.ProductDto;

public interface ProductSericeImpliments  {
	
	String validate(ProductDto p_Dto);
	List<ProductDto> getAll();
	String updateById(int productId, ProductDto p_Dto);
	String deleteById(int productId, ProductDto p_Dto);
	
	

}
