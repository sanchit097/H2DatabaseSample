package com.example.h2.learning.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Data
@Entity
@Table(name="Electronic_Items")
public class ElectronicItems {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String price;
}
