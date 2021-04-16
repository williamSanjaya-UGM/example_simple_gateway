package com.example.springcloudgateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CatalogDto {

    private CatalogKeyDto catalogKey;

    private double rating;

    private String productName;

    private int num_of_purchased;

    private int unit_in_price;

    private int discount_in_rupee;
}
