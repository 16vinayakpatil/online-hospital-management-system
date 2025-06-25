package com.mitroimariana.hospital.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mitroimariana.hospital.dto.AppointmentDTO;


public interface AppointmentDAOInt {
	
	
public long add(AppointmentDTO dto);

	
	public void update(AppointmentDTO dto);

	
	public void delete(AppointmentDTO dto);
	

  
	public AppointmentDTO findByName(String name);
	

	
	public AppointmentDTO findByPk(long id);

	
	public List<AppointmentDTO> search(AppointmentDTO dto, long pageNo, int pageSize);

	
	public List<AppointmentDTO> search(AppointmentDTO dto);
	
	
	
	public Map<Long, AppointmentDTO> getMapDTO(Set<Long> ids);

}
