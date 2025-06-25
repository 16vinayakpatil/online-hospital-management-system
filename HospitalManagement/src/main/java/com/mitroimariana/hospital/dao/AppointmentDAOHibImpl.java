package com.mitroimariana.hospital.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mitroimariana.hospital.dto.AppointmentDTO;
import com.mitroimariana.hospital.dto.RoleDTO;

@Repository
public class AppointmentDAOHibImpl implements AppointmentDAOInt{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long add(AppointmentDTO dto) {
		
		
		long pk = (Long) sessionFactory.getCurrentSession().save(dto);
		return pk;
	}

	@Override
	public void update(AppointmentDTO dto) {
		sessionFactory.getCurrentSession().merge(dto);
		
	}

	@Override
	public void delete(AppointmentDTO dto) {
		sessionFactory.getCurrentSession().delete(dto);
		
	}

	@Override
	public AppointmentDTO findByName(String name) {
		
		Session session = sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(AppointmentDTO.class);

		criteria.add(Restrictions.eq("firstName", name));

		return (AppointmentDTO) criteria.uniqueResult();
	}

	@Override
	public AppointmentDTO findByPk(long id) {
		Session session = sessionFactory.getCurrentSession();
		AppointmentDTO dto = (AppointmentDTO) session.get(AppointmentDTO.class, id);
		
		return dto;
	}

	@Override
	public List<AppointmentDTO> search(AppointmentDTO dto, long pageNo, int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(AppointmentDTO.class);

		if (dto != null) {
		
			if (dto.getId() > 0) {

				criteria.add(Restrictions.eq("id", dto.getId()));

			}
			if (dto.getFirstName() != null && dto.getFirstName().length() > 0) {
				criteria.add(Restrictions.like("firstName", dto.getFirstName() + "%"));
			}
			
			if (dto.getCNP() != null && dto.getCNP().length() > 0) {
				criteria.add(Restrictions.like("CNP", dto.getCNP() + "%"));
			}

			if (pageSize > 0) {

				pageNo = (pageNo - 1) * pageSize;
				criteria.setFirstResult((int) pageNo);
				criteria.setMaxResults(pageSize);
			}
		}

		return criteria.list();
	}

	@Override
	public List<AppointmentDTO> search(AppointmentDTO dto) {
		
		return search(dto, 0, 0);
	}

	@Override
	public Map<Long, AppointmentDTO> getMapDTO(Set<Long> ids) {
		Session session = sessionFactory.getCurrentSession();
		Map<Long, AppointmentDTO> map = new HashMap<Long, AppointmentDTO>();	
		
		for (Long id : ids) {
			map.put(id,  (AppointmentDTO) session.get(AppointmentDTO.class, id));
		}	
		return map;
	}

}
