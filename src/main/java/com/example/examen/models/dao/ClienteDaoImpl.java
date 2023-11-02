package com.example.examen.models.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.examen.models.entity.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class ClienteDaoImpl implements IClienteDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	
	@Override
	public List<Cliente> findAll() {
		
		return em.createQuery("from Cliente").getResultList();
	}

	@Override
	public Cliente save(Cliente cliente) {
		
		if(cliente.getId_cliente() != null && cliente.getId_cliente() > 0) {
			em.merge(cliente);
		} else {
			em.persist(cliente);
		}
		return cliente;	
	}

	@Override
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return em.find(Cliente.class, id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		Cliente cliente = findById(id);
		em.remove(cliente);
		
	}

}
