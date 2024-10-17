package com.xworkz.complente.complenteServive;

import java.util.List;

import com.xworkz.complente.complenteDto.ComplenteDto;
import com.xworkz.complente.complenteRepo.CompRempImpliments;


import lombok.AllArgsConstructor;
@AllArgsConstructor

public class CompleService implements CompServiceimpliments {

	private CompRempImpliments  repo;

	@Override
	public String save(ComplenteDto c_Dto) {
		if(c_Dto!=null) {
			if(repo.save(c_Dto)) {
			}
			return "sucessfully saved";
		}
		return "not saved";
	}

	@Override
	public List<ComplenteDto> getAll() {
		return repo.getAll();
	}


	@Override
	public String updateById(int comp_Id, ComplenteDto u_Dto) {
		if(comp_Id > 0) {
			if(repo.updateById(comp_Id, u_Dto)) {
				return "update sucessfully";
			}
			
		}
		return "not updated";
	}

	@Override
	public String deleteById(int comp_Id, ComplenteDto u_Dto) {
		if(comp_Id > 0) {
			if(repo.updateById(comp_Id, u_Dto)) {
				return "deleted sucessfully";
			}
			
		}
		return "not deleted";
	}
	
}
