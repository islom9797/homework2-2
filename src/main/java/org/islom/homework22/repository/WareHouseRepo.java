package org.islom.homework22.repository;

import org.islom.homework22.entity.WareHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "PcMarket",collectionResourceRel = "list",excerptProjection = CustomAddress.class)
public interface WareHouseRepo extends JpaRepository<WareHouse,Integer> {
}
