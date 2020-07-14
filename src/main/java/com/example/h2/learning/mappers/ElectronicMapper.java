package com.example.h2.learning.mappers;

import com.example.h2.learning.domains.ElectronicItems;
import com.example.h2.learning.models.ElectronicResponse;
import org.mapstruct.Mapper;

@Mapper
public interface ElectronicMapper {

    ElectronicResponse mapElectronicMapperToResponse(ElectronicItems items);
}

