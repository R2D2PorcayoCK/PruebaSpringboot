package com.example.ServicePrueba.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServicePrueba.model.Object;
import com.example.ServicePrueba.service.ObjectService;

@RestController
@RequestMapping("/objects")
public class ObjectController {

    private ObjectService objectService;

    public ObjectController(ObjectService objectService) {
        this.objectService = objectService;
    }

    @GetMapping
    public List<Object> obtenerObjects() {
        return objectService.obtenerObjects();
    }

    @GetMapping("/{id}")
    public Object obtenerObjectPorId(@PathVariable int id) {
        return objectService.obtenerObjectId(id);
    }

}
