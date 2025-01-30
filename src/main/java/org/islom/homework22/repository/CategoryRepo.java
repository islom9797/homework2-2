package org.islom.homework22.repository;

import org.islom.homework22.entity.Category;
import org.islom.homework22.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category",collectionResourceRel = "list",excerptProjection = CustomCategory.class)
public interface CategoryRepo extends JpaRepository<Category, Integer> {

    boolean existsByName(String name);
}