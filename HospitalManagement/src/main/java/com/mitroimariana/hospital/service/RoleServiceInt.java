package com.mitroimariana.hospital.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mitroimariana.hospital.dto.RoleDTO;
import com.mitroimariana.hospital.exception.DuplicateRecordException;



/**Role Service Interface
 * @author Navigable Set
 *@version 1.0
 *@copywrite Navigable Set
 */


public interface RoleServiceInt {


	
	
	
	public long add(RoleDTO dto) throws DuplicateRecordException;
	
	
	public void delete(RoleDTO dto) ;
	
	
	public void update(RoleDTO dto) throws DuplicateRecordException;
	  
	
	public RoleDTO findByPK(long pk) ;
	
	
	
	public RoleDTO findByName(String name);
	
	
	
	public List<RoleDTO> search(RoleDTO dto);
	
	
	
	public List search(RoleDTO dto, int pageNo, int pageSize) ;
	
	
	public Map<Long, RoleDTO> getMapDTO(Set<Long> ids);
	
	
	
}
