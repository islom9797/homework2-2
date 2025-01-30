package org.islom.homework22.projection;
import org.islom.homework22.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.security.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
    Timestamp getDate();

    WareHouse getWareHouse();

    Client getClient();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();


}
