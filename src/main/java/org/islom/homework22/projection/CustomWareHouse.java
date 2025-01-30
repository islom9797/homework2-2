package org.islom.homework22.projection;
import org.islom.homework22.entity.User;
import org.islom.homework22.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = WareHouse.class)
public interface CustomWareHouse {
    Integer getId();
    String getName();
    String getActive();


}
