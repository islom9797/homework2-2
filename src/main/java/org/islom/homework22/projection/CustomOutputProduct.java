package org.islom.homework22.projection;

import org.islom.homework22.entity.Output;
import org.islom.homework22.entity.OutputProduct;
import org.islom.homework22.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Product getProduct();

    double getAmount();

    double getPrice();


    Output getOutput();

}
