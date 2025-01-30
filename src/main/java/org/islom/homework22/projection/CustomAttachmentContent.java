package org.islom.homework22.projection;

import org.islom.homework22.entity.Attachment;
import org.islom.homework22.entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Integer getId();

    byte[] getBytes();

    Attachment getAttachment();


}
