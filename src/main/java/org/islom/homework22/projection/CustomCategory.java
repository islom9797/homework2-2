package org.islom.homework22.projection;
import org.islom.homework22.entity.Category;
import org.islom.homework22.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getFirstName();
    String getLastName();
    String getCode();
    String getPhoneNumber();
    String getPassword();



}
