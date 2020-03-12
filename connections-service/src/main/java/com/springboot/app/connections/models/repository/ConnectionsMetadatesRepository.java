package com.springboot.app.connections.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springboot.app.connections.models.entity.ConnectionsMetadates;

@RepositoryRestResource(path = "connections-metadates")
public interface ConnectionsMetadatesRepository extends CrudRepository<ConnectionsMetadates, Long>{

}
