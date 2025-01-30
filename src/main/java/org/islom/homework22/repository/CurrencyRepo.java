package org.islom.homework22.repository;

import org.islom.homework22.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency",collectionResourceRel = "list")
public interface CurrencyRepo extends JpaRepository<Currency, Integer> {
}
