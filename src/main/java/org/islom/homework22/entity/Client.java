package org.islom.homework22.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.islom.homework22.entity.template.AbsEntity;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Client extends AbsEntity {
    @Column(unique = true, nullable = false)
    private String phoneNumber;
}
