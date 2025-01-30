package org.islom.homework22.repository;

import org.islom.homework22.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepo extends JpaRepository<Attachment,Integer> {
}
