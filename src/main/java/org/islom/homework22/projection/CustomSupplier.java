package org.islom.homework22.projection;
import org.islom.homework22.entity.Supplier;
import org.islom.homework22.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    Integer getId();
    String getName();
    String getActive();

    String getPhoneNumber();



}
