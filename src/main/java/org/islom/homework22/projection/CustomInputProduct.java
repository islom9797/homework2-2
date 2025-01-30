package org.islom.homework22.projection;

import org.islom.homework22.entity.Input;
import org.islom.homework22.entity.InputProduct;
import org.islom.homework22.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();

    Product getProduct();

    double getAmount();

    double getPrice();

    Date getExpiryDate();

    Input getInput();

}
