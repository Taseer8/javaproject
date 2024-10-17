package com.xworkz.complente.complenteRepo;

import java.util.List;

import com.xworkz.complente.complenteDto.ComplenteDto;

public interface CompRempImpliments {
	
	boolean save(ComplenteDto dto);
	List<ComplenteDto> getAll();
	boolean updateById(int comp_Id, ComplenteDto u_dto);
	boolean deleteById(int comp_Id, ComplenteDto u_dto);


}
