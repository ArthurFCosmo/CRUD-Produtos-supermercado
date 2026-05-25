package com.cosmodev.crud1.model;
import jakarta.persistence.*;

@Entity(name = "product")
@Table(name = "product")
public class Product {

    //  Product class atributes
    //  Atributos da classe produto

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Long price;

    // Empty constructor needed by JPA to instantiate the entity
    // Construtor vazio exigiado pela JPA para instanciar a entidade

    public Product( ) {}

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
