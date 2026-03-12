package com.example.ServicePrueba.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ServicePrueba.model.Object;

@Service
public class ObjectService {

private List<Object> objects = new ArrayList<>();

public ObjectService(){
    objects.add(new Object(1, "Laptop", "Dispositivo portátil"));
    objects.add(new Object(2, "Mouse", "Dispositivo de entrada"));
    objects.add(new Object(3, "Teclado", "Dispositivo para escribir"));
}

public List<Object> obtenerObjects(){
    return objects;
}

public Object obtenerObjectId(int id){
    for(Object object : objects){
        if(object.getId()== id){
            return object;
        }
    }
    return null;
}

}