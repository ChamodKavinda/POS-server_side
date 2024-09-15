package com.example.POS.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BrandDTOUpdate {
    private int brand_id;
    private String brand_name;
    private boolean active;
}
