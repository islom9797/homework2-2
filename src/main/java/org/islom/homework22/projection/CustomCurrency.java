package org.islom.homework22.projection;
import org.islom.homework22.entity.Currency;
import org.islom.homework22.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();
    String getName();
    String getActive();

}
