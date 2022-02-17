package ame.com.preving.springboot.backend.apirest.models.dao;

import ame.com.preving.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {




}
