package org.islom.homework22.repository;

import org.islom.homework22.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product",collectionResourceRel = "list")
public interface ProductRepo extends JpaRepository<Product, Integer> {

    boolean exitsByNameAndCategoryId(String name, int categoryId);
}
