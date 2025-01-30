package org.islom.homework22.repository;

import org.islom.homework22.entity.Pcmarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "PcMarket",collectionResourceRel = "list")
public interface PcMarketRepo extends JpaRepository<Pcmarket,Integer> {
}
