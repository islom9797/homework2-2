package org.islom.homework22.repository;

import org.islom.homework22.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

    boolean existsByName(String name);
}