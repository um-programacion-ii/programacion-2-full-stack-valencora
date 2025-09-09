package com.example.hexagonal.hexagonal_basico.product.infrastructure.web.dto;


import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequest {

    @NotBlank(message = "desc is mandatory")
    private String description;

    @NotNull(message = "not null")
    @DecimalMin(value = "0.0", inclusive = false, message = "aa")
    private BigDecimal price;
}
