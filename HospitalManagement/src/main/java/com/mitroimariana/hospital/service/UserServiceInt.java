package com.mitroimariana.hospital.service;

import java.util.List;

import com.mitroimariana.hospital.dto.UserDTO;
import com.mitroimariana.hospital.exception.DuplicateRecordException;






public interface UserServiceInt {

	
	
	
	
	public long add(UserDTO dto) throws DuplicateRecordException;
	
	
	
	public void delete(UserDTO dto) ;
	
	
	
	
	public void update(UserDTO dto) throws DuplicateRecordException;
	 
	
	
	
	
	public UserDTO findByPK(long pk) ;
	
	
	
	
	public UserDTO findByLogin(String login) ;
	 
	 
	
	
	public List<UserDTO> search(UserDTO dto);
	 
	
	
	
	
	public List search(UserDTO dto, int pageNo, int pageSize) ;
	
	
	
	 
    public boolean changePassword(Long id, String oldPassword,
            String newPassword) ;

   
    
    
    
    public UserDTO authenticate(UserDTO dto);
    
    
    
    
    public long registerUser(UserDTO dto)  ;
    
    
    
    public boolean forgetPassword(String login);
	
}
