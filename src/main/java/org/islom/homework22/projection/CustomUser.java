package org.islom.homework22.projection;
import org.islom.homework22.entity.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();
    String getFirstName();
    String getLastName();
    String getCode();
    String getPhoneNumber();
    String getPassword();



}
