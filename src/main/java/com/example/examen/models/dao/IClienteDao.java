package com.example.examen.models.dao;

import java.util.List;

import com.example.examen.models.entity.Cliente;

public interface IClienteDao {
	public List<Cliente> findAll();

	public Cliente save(Cliente cliente);

	public Cliente findById(Long id);

	public void delete(Long id);
}
