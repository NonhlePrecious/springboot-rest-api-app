package com.restapi_nonhle_mavimbela_app.Model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class WithdrawalNotice {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    private LocalDate date;
    private String bankDetails;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    // Getters and setters
}