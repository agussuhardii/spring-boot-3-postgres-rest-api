package com.agussuhardi.springboot3integrationtest.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author agus.suhardii@gmail.com
 * &#064;created  20/06/23/06/2023 :20.13
 * {@code @project} spring-boot-3-postgres-rest-api
 */
@Data
@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "char(36)")
    private String id;

    @Column(name = "name", nullable = false)
    @NotNull(message = "name can not null")
    private String name;

    @Column(name = "qty", nullable = false)
    @NotNull(message = "qty can not null")
    private int qty;

}
