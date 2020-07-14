package com.example.h2.learning.services;

import com.example.h2.learning.mappers.ElectronicMapper;
import com.example.h2.learning.models.ElectronicResponse;
import com.example.h2.learning.repositories.H2Repository;
import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ReactiveService {


    private H2Repository h2Repository;


    public List<ElectronicResponse> getElectronics() {
        List<ElectronicResponse> response = new ArrayList<>();
        h2Repository.findAll()
                .forEach(item->
                        response.add(Mappers.getMapper(ElectronicMapper.class)
                                .mapElectronicMapperToResponse(item)));
        return response;

    }

}
