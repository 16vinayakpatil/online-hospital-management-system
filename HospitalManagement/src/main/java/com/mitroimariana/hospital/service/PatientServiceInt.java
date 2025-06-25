package com.mitroimariana.hospital.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mitroimariana.hospital.dto.PatientDTO;
import com.mitroimariana.hospital.exception.DuplicateRecordException;

public interface PatientServiceInt {
	
	
public long add(PatientDTO dto) throws DuplicateRecordException;
	
	
	public void delete(PatientDTO dto) ;
	
	
	public void update(PatientDTO dto) throws DuplicateRecordException;
	  
	
	public PatientDTO findByPK(long pk) ;
	
	
	
	public PatientDTO findByName(String name);
	
	
	
	public List<PatientDTO> search(PatientDTO dto);
	
	
	
	public List search(PatientDTO dto, int pageNo, int pageSize) ;
	
	
	public Map<Long, PatientDTO> getMapDTO(Set<Long> ids);

}
