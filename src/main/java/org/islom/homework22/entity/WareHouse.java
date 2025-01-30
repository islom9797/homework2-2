package org.islom.homework22.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.islom.homework22.entity.template.AbsEntity;
@Data
@Entity
@EqualsAndHashCode(callSuper=true)
public class WareHouse extends AbsEntity {
}
