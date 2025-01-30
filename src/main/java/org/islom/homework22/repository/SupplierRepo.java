package org.islom.homework22.repository;

import org.islom.homework22.entity.Supplier;
import org.islom.homework22.projection.CustomSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier",collectionResourceRel = "list",excerptProjection = CustomSupplier.class)
public interface SupplierRepo extends JpaRepository<Supplier, Long> {
}
