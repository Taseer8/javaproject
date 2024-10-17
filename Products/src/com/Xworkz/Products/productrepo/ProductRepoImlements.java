package com.Xworkz.Products.productrepo;

import java.util.List;

import com.Xworkz.Products.productdto.ProductDto;

public interface ProductRepoImlements {

	public boolean save(ProductDto p_Dto) ;
	List<ProductDto> getAll();
	public boolean updateById(int productId, ProductDto p_Dto);
	public boolean deleteById(int productId, ProductDto p_Dto);

}
