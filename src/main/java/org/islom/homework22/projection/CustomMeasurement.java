package org.islom.homework22.projection;
import org.islom.homework22.entity.Measurement;
import org.islom.homework22.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();
    String getName();
    String getActive();


}
