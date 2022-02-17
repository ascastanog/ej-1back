package ame.com.preving.springboot.backend.apirest.models.services;

import ame.com.preving.springboot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();
    public Cliente save(Cliente cliente);
    public void delete(Long id);
    public Cliente findById(Long id);


}


