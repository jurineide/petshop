package com.jurineide.petshop.services;

import com.jurineide.petshop.dtos.AnimalDTO;
import com.jurineide.petshop.entities.Animal;
import com.jurineide.petshop.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository animalRepository;

    public AnimalDTO save(AnimalDTO animalDTO) {
        Animal animal = new Animal(animalDTO.getId(),animalDTO.getName(),animalDTO.getTipoAnimal());
        Animal save = animalRepository.save(animal);

        return new AnimalDTO(animal.getId(), animal.getName(), animal.getTipoAnimal());
    }

    public List<AnimalDTO> findAll() {
        // Buscar todos os animais do repositório
        List<Animal> animals = animalRepository.findAll();

        return animals.stream().map(animal -> new AnimalDTO(animal.getId(), animal.getName(), animal.getTipoAnimal()) ).collect(Collectors.toList());
    }
}
