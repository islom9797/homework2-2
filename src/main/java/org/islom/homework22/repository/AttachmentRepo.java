package org.islom.homework22.repository;

import org.islom.homework22.entity.Attachment;
import org.islom.homework22.projection.CustomAttachment;
import org.islom.homework22.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment",collectionResourceRel = "list",excerptProjection = CustomAttachment.class)
public interface AttachmentRepo extends JpaRepository<Attachment,Integer> {
}
