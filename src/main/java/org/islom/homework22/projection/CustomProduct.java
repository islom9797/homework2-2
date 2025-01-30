package org.islom.homework22.projection;

import org.islom.homework22.entity.Attachment;
import org.islom.homework22.entity.Category;
import org.islom.homework22.entity.Measurement;
import org.islom.homework22.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    Category getCategory();

    Attachment getAttachment();

    String getCode();

    Measurement getMeasurement();


}
