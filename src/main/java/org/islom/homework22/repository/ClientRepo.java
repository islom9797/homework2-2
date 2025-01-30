package org.islom.homework22.repository;

import org.islom.homework22.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = CustomAddress.class)
public interface ClientRepo extends JpaRepository<Client, Integer> {
}
