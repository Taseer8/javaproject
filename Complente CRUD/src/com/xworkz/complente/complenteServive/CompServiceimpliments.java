package com.xworkz.complente.complenteServive;

import java.util.List;

import com.xworkz.complente.complenteDto.ComplenteDto;

public interface CompServiceimpliments {
	
	String save(ComplenteDto c_Dto);
	List<ComplenteDto> getAll();
	String updateById(int comp_Id ,ComplenteDto u_Dto);
	String deleteById(int comp_Id ,ComplenteDto u_Dto);

}
