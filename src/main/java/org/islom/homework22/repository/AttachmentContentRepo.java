package org.islom.homework22.repository;

import org.islom.homework22.entity.AttachmentContent;
import org.islom.homework22.projection.CustomAttachment;
import org.islom.homework22.projection.CustomAttachmentContent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "customAttachmentContent",collectionResourceRel = "list",excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepo extends CrudRepository<AttachmentContent, Integer> {
}
