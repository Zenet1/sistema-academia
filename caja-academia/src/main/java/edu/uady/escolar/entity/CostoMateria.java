package edu.uady.escolar.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@entity
@Table (name = "costo_materias")
@Data
@NoArgsConstructor
public class CostoMateria {
    @Id
    @Column(name = "materia_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="costo")
    private int costo;

}
