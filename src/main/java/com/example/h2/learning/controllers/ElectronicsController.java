package com.example.h2.learning.controllers;

import com.example.h2.learning.services.ReactiveService;
import com.example.h2.learning.models.ElectronicResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/item")
@AllArgsConstructor
public class ElectronicsController {

    private ReactiveService reactiveService;

    @GetMapping("/electronics")
    public List<ElectronicResponse> getElectronicItems(){
        return reactiveService.getElectronics();
    }
}
