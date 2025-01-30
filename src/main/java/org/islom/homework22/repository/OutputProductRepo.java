package org.islom.homework22.repository;

import org.islom.homework22.entity.OutputProduct;
import org.islom.homework22.projection.CustomOutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "list",excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepo extends JpaRepository<OutputProduct, Integer> {
}
