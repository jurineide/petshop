package com.jurineide.petshop.controllers;


import com.jurineide.petshop.dtos.AnimalDTO;
import com.jurineide.petshop.entities.Animal;
import com.jurineide.petshop.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {
    @Autowired
    AnimalService animalService;
    @PostMapping("/postAnimal")
    ResponseEntity<AnimalDTO>postAnimal(@RequestBody AnimalDTO animalDTO){
        var response = animalService.save(animalDTO);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/getAnimais")
    ResponseEntity<List<AnimalDTO>> getAnimals(){
        List<AnimalDTO> animalDTOList = animalService.findAll();
        return ResponseEntity.ok(animalDTOList);
    }

     @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable Long id) {
        animalService.deleteById(id);
        return ResponseEntity.noContent().build(); 
    }
}
