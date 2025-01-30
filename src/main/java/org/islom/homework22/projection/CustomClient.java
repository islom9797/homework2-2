package org.islom.homework22.projection;
import org.islom.homework22.entity.Client;
import org.islom.homework22.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();
    String getName();
    String getActive();
    String getPhoneNumber();


}
