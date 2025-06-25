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

import com.mitroimariana.hospital.dto.PatientDTO;
import com.mitroimariana.hospital.dto.RoleDTO;

@Repository
public class PatientDAOHibImpl implements PatientDAOInt {

	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long add(PatientDTO dto) {
		
		long pk = (Long) sessionFactory.getCurrentSession().save(dto);
		return pk;
	}

	@Override
	public void update(PatientDTO dto) {
		sessionFactory.getCurrentSession().merge(dto);
		
	}

	@Override
	public void delete(PatientDTO dto) {
		sessionFactory.getCurrentSession().delete(dto);
		
	}

	@Override
	public PatientDTO findByName(String name) {
		
		Session session = sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(PatientDTO.class);

		criteria.add(Restrictions.eq("firstName", name));

		return (PatientDTO) criteria.uniqueResult();
	}

	@Override
	public PatientDTO findByPk(long id) {
		Session session = sessionFactory.getCurrentSession();
		PatientDTO dto = (PatientDTO) session.get(PatientDTO.class, id);
		return dto;
	}

	@Override
	public List<PatientDTO> search(PatientDTO dto, long pageNo, int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(PatientDTO.class);

		if (dto != null) {
		
			if (dto.getId() > 0) {

				criteria.add(Restrictions.eq("id", dto.getId()));

			}
			if (dto.getFirstName() != null && dto.getFirstName().length() > 0) {
				criteria.add(Restrictions.like("firstName", dto.getFirstName() + "%"));
			}
			if (dto.getLastName() != null && dto.getLastName().length() > 0) {
				criteria.add(Restrictions.like("lastName", dto.getLastName() + "%"));
			}if (dto.getCity() != null && dto.getCity().length() > 0) {
				criteria.add(Restrictions.like("city", dto.getLastName() + "%"));
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
	public List<PatientDTO> search(PatientDTO dto) {
		return search(dto, 0, 0);
	}

	@Override
	public Map<Long, PatientDTO> getMapDTO(Set<Long> ids) {
		Session session = sessionFactory.getCurrentSession();
		Map<Long, PatientDTO> map = new HashMap<Long, PatientDTO>();	
		
		for (Long id : ids) {
			map.put(id,  (PatientDTO) session.get(PatientDTO.class, id));
		}	
		return map;
	}

}
