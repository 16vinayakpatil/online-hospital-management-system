package com.mitroimariana.hospital.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mitroimariana.hospital.dto.PatientDTO;


public interface PatientDAOInt {
	
	
public long add(PatientDTO dto);

	
	public void update(PatientDTO dto);

	
	public void delete(PatientDTO dto);
	

  
	public PatientDTO findByName(String name);
	

	
	public PatientDTO findByPk(long id);

	
	public List<PatientDTO> search(PatientDTO dto, long pageNo, int pageSize);

	
	public List<PatientDTO> search(PatientDTO dto);
	
	
	
	public Map<Long, PatientDTO> getMapDTO(Set<Long> ids);

}
