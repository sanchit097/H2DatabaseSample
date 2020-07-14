package com.example.h2.learning.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class ElectronicResponse {
    private String name;
    private String description;
    private String price;
}
