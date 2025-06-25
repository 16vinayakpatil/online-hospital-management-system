package com.mitroimariana.hospital.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mitroimariana.hospital.dto.AppointmentDTO;
import com.mitroimariana.hospital.exception.DuplicateRecordException;

public interface AppointmentServiceInt {
	
	
public long add(AppointmentDTO dto) throws DuplicateRecordException;
	
	
	public void delete(AppointmentDTO dto) ;
	
	
	public void update(AppointmentDTO dto) throws DuplicateRecordException;
	  
	
	public AppointmentDTO findByPK(long pk) ;
	
	
	
	public AppointmentDTO findByName(String name);
	
	
	
	public List<AppointmentDTO> search(AppointmentDTO dto);
	
	
	
	public List search(AppointmentDTO dto, int pageNo, int pageSize) ;
	
	
	public Map<Long, AppointmentDTO> getMapDTO(Set<Long> ids);

}
