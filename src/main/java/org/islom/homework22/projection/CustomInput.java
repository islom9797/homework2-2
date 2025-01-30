package org.islom.homework22.projection;

import org.islom.homework22.entity.Currency;
import org.islom.homework22.entity.Input;
import org.islom.homework22.entity.Supplier;
import org.islom.homework22.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.security.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();

    Timestamp getDate();

    WareHouse getWareHouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();


}
