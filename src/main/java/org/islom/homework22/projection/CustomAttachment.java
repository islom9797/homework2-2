package org.islom.homework22.projection;

import org.islom.homework22.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();

    String getName();

    long getSize();

    String getContentType();


}
