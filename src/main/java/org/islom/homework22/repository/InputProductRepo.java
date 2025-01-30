package org.islom.homework22.repository;

import org.islom.homework22.entity.InputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputProduct",collectionResourceRel = "list")
public interface InputProductRepo extends JpaRepository<InputProduct, Integer> {
}
