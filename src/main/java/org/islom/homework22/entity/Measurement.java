package org.islom.homework22.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.islom.homework22.entity.template.AbsEntity;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Measurement extends AbsEntity {

}
