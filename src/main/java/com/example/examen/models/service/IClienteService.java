package com.example.examen.models.service;

import java.util.List;

import com.example.examen.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();

	public Cliente save(Cliente cliente);

	public Cliente findById(Long id);

	public void delete(Long id);
}
