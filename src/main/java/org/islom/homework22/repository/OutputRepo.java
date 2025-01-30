package org.islom.homework22.repository;

import org.islom.homework22.entity.Output;
import org.islom.homework22.projection.CustomOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = CustomOutput.class)
public interface OutputRepo extends JpaRepository<Output, Integer> {
}
