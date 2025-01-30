package org.islom.homework22.repository;

import org.islom.homework22.entity.User;
import org.islom.homework22.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user",collectionResourceRel = "list",excerptProjection = CustomUser.class)
public interface UserRepo extends JpaRepository<User, Integer> {
}
