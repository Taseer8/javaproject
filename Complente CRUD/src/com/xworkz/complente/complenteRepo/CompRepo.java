package com.xworkz.complente.complenteRepo;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.complente.complenteDto.ComplenteDto;

public class CompRepo implements CompRempImpliments {
	
	LinkedList<ComplenteDto> data = new LinkedList<ComplenteDto>();

	@Override
	public boolean save(ComplenteDto dto) {
		System.out.println("repo method");		
		return data.add(dto);
	}

	@Override
	public List<ComplenteDto> getAll() {
		return data;
	}

	@Override
	public boolean updateById(int comp_Id, ComplenteDto u_dto) {
		System.out.println("update method");
		if(!data.isEmpty()) {
			for(int i = 0 ; i < data.size(); i++) {
				if(data.get(i).getComplente_id()==comp_Id) {
					data.set(i, u_dto);
				}
			}
			return true;
		}
		else {
			System.out.println("enter the proper complante id");
		}
		return false;
	}

	@Override
	public boolean deleteById(int comp_Id, ComplenteDto u_dto) {
		if(!data.isEmpty()) {
			for(int i = 0 ; i < data.size(); i++) {
				if(data.get(i).getComplente_id()==comp_Id) {
					data.remove();
				}
			}
			return true;
		}
		else {
			System.out.println("enter the proper complante id");
		}
		return false;
	}
	

}
