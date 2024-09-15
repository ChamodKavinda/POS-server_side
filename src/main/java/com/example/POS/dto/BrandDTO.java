package com.example.POS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BrandDTO {
    private int brand_id;
    private String brand_name;
    private boolean active;
}
