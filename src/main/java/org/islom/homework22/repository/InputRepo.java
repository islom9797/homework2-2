package org.islom.homework22.repository;

import org.islom.homework22.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input",collectionResourceRel = "list")
public interface InputRepo extends JpaRepository<Input, Integer> {
}
