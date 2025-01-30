package org.islom.homework22.repository;

import org.islom.homework22.entity.Input;
import org.islom.homework22.projection.CustomInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input",collectionResourceRel = "list",excerptProjection = CustomInput.class)
public interface InputRepo extends JpaRepository<Input, Integer> {
}
