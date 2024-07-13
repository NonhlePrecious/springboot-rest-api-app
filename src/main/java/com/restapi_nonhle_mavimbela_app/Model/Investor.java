package com.restapi_nonhle_mavimbela_app.Model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import java.util.Set;

@Entity
public class Investor {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String contact;

    @OneToMany(mappedBy = "investor", cascade = CascadeType.ALL)
    private Set<Product> products;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    // Getters and setters
}