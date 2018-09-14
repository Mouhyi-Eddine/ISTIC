package fr.istic.malah.tp2.model;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import static fr.istic.malah.tp2.model.ModelDataDefinition.FIRST_NAME;
import static fr.istic.malah.tp2.model.ModelDataDefinition.LAST_NAME;
import static fr.istic.malah.tp2.model.ModelDataDefinition.PERSON;

@Data
@Entity
@Table(name = PERSON)
public class Person extends BaseEntity {

    @NotNull
    @Column(name = FIRST_NAME)
    private String firstName;

    @NotNull
    @Column(name = LAST_NAME)
    private String lastName;

    @ManyToOne
    private City city;
}
