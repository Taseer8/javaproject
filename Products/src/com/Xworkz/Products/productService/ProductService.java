package com.Xworkz.Products.productService;

import java.util.List;
import com.Xworkz.Products.productdto.ProductDto;
import com.Xworkz.Products.productrepo.ProductRepoImlements;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public class ProductService implements ProductSericeImpliments{

	private ProductRepoImlements repo;


	@Override
	public String validate(ProductDto p_Dto) {
		if(p_Dto != null) {
			if(repo.save(p_Dto)){
			}
			return "Saved ";
		}
		return "not saved";
	}
	@Override
	public List<ProductDto> getAll() {
		// TODO Auto-generated method stub
		return repo.getAll();
	}
	@Override
	public String updateById(int productId, ProductDto p_Dto) {
		if(productId >0 ) {
			if(repo.updateById(productId, p_Dto)) {
				return "updated ";
			}
		}
		return "not updated";
	}
	@Override
	public String deleteById(int productId, ProductDto p_Dto) {
		if(productId >0 ) {
			if(repo.deleteById(productId, p_Dto)) {
				return "updated ";
			}
		}
		return "not updated";

	}




}
