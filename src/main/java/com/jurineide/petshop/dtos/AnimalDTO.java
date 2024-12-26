package com.jurineide.petshop.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AnimalDTO {
    private Long id;
    private String name;
    private String tipoAnimal;

}
